package pe.cart2.login;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.cart.driver.Driver;
import pe.cart.driver.Driver.NavegadorWeb;
import pe.cart.inicio.PaginaInicio;
import pe.cart.login.Login;


public class LoginSteps {
	
	@Managed
	private WebDriver driver;
	private WebDriverWait wait;
	private PaginaInicio paginaInicio;
	private Login login;
	
	@Before
	public void setupTest() {
		driver = Driver.getInstancia(NavegadorWeb.CHROME);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,10);

		paginaInicio = new PaginaInicio(driver);
		login = new Login(driver,wait);
	}
	
	@After
	public void closeWindow() {
		driver.close();
	}
	
	@Given("Se carga el sistema PRODUCT STORE")
	public void cargarSistema()  {
		paginaInicio.cargar();
		paginaInicio.panel();
	}
	
	@Then("Se ingresa con el usuario ya registrado {string} y clave {string}")
	public void logeo(String usuario, String password) {
		login.login(usuario, password);
	}

}
