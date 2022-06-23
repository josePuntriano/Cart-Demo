package pe.cart1.registro.usuario;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import pe.cart.inicio.PaginaInicio;
import pe.cart.registro.Registro;

public class RegistroUsuarioSteps {

	@Managed
	private WebDriver driver;
	private PaginaInicio paginaInicio;
	private Registro registro;

	
	@Before
	public void configuracionInicial() {
		
		driver.manage().window().maximize();
		paginaInicio = new PaginaInicio(driver);
		registro = new Registro(driver);		
	}
	
	@After
	public void configuracionFinal() {
		driver.close();
	}
	
	@Given("Se carga el sistema PRODUCT STORE")
	public void cargarSistema() {
		paginaInicio.cargar();
	}
	
	@Then("Se registra con el usuario {string} y la clave {string}")
	public void registro(String usuarioRegistro, String passwordRegistro) throws InterruptedException {
		registro.registroUsuario(usuarioRegistro, passwordRegistro);
	}

}
