package pe.cart1.registro.usuario;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.cart.driver.Driver;
import pe.cart.inicio.PaginaInicio;
import pe.cart.registro.Registro;

public class RegistroUsuarioSteps {

	@Managed
	private WebDriver driver;
	private WebDriverWait wait;
	private PaginaInicio paginaInicio;
	private Registro registro;

	
	@Before
	public void setupTest() {
		driver = Driver.getInstancia(Driver.NavegadorWeb.CHROME);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);

		paginaInicio = new PaginaInicio(driver);
		registro = new Registro(driver,wait);
	}
	
	@After
	public void closeWindow() {
		driver.close();
	}
	
	@Given("Se carga el sistema PRODUCT STORE")
	public void cargarSistema() {
		paginaInicio.cargar();
	}
	
	@Then("Se registra con el usuario {string} y la clave {string}")
	public void registro(String usuarioRegistro, String passwordRegistro) {
		registro.registroUsuario(usuarioRegistro, passwordRegistro);
	}

}
