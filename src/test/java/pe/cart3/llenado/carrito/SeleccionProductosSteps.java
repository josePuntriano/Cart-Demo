package pe.cart3.llenado.carrito;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import pe.cart.driver.Driver;
import pe.cart.driver.Driver.NavegadorWeb;
import pe.cart.inicio.PaginaInicio;
import pe.cart.login.Login;
import pe.cart.seleccion.LlenarCarrito;

public class SeleccionProductosSteps {
	
	@Managed
	private WebDriver driver;
	private PaginaInicio paginaInicio;
	private Login login;
	private LlenarCarrito llenarCarrito;
	
	@Before
	public void configuracionInicial() {
		
		driver = Driver.getInstancia(NavegadorWeb.CHROME);
		driver.manage().window().maximize();
		paginaInicio = new PaginaInicio(driver);
		login = new Login(driver);
		llenarCarrito = new LlenarCarrito(driver);
	}
	
	@After
	public void configuracionFinal() {
		driver.close();
	}
	
	@Given("Se carga el sistema PRODUCT STORE")
	public void cargarSistema() throws InterruptedException {
		paginaInicio.cargar();
	}
	
	@And("Se ingresa con el usuario ya registrado {string} y contraseña {string}")
	public void logeo(String usuario, String password) throws InterruptedException {
		login.login(usuario, password);
	}
	
	@And("Selecciona la categoria")
	public void seleccionarCategoria() throws InterruptedException {
		llenarCarrito.categoria();
	}
	
	@And("Elige una laptop a comprar y la carga al carrito")
	public void seleccionarLaptop() throws InterruptedException {
		llenarCarrito.seleccionarProductoLaptop();
	}
	
	@And("Elige un celular a comprar y la carga al carrito")
	public void seleccionarCelular() throws InterruptedException {
		llenarCarrito.seleccionarProductoCelular();
	}
	
	@Then("Visualiza lo cargado en el carrito")
	public void carrito() throws InterruptedException {
		llenarCarrito.verCarrito();
	}

}
