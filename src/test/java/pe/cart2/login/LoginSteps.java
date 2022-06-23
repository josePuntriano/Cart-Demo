package pe.cart2.login;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import pe.cart.driver.Driver;
import pe.cart.driver.Driver.NavegadorWeb;
import pe.cart.inicio.PaginaInicio;
import pe.cart.login.Login;


public class LoginSteps {
	
	@Managed
	private WebDriver driver;
	private PaginaInicio paginaInicio;
	private Login login;
	
	@Before
	public void configuracionInicial() {
		
		driver = Driver.getInstancia(NavegadorWeb.CHROME);
		driver.manage().window().maximize();
		paginaInicio = new PaginaInicio(driver);
		login = new Login(driver);
	}
	
	@After
	public void configuracionFinal() {
		driver.close();
	}
	
	@Given("Se carga el sistema PRODUCT STORE")
	public void cargarSistema() throws InterruptedException {
		paginaInicio.cargar();
		paginaInicio.panel();
	}
	
	@Then("Se ingresa con el usuario ya registrado {string} y contraseña {string}")
	public void logeo(String usuario, String password) throws InterruptedException {
		login.login(usuario, password);
	}

}
