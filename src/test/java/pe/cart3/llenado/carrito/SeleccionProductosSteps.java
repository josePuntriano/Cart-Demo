package pe.cart3.llenado.carrito;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.cart.driver.Driver;
import pe.cart.driver.Driver.NavegadorWeb;
import pe.cart.inicio.PaginaInicio;
import pe.cart.login.Login;
import pe.cart.seleccion.LlenarCarrito;


public class SeleccionProductosSteps {
	
	@Managed
	private WebDriver driver;
	private WebDriverWait wait;
	private PaginaInicio paginaInicio;
	private Login login;
	private LlenarCarrito llenarCarrito;
	
	@Before
	public void setupTest() {
		driver = Driver.getInstancia(NavegadorWeb.CHROME);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);

		paginaInicio = new PaginaInicio(driver);
		login = new Login(driver,wait);
		llenarCarrito = new LlenarCarrito(driver,wait);
	}
	
	@After
	public void closeWindow() {
		driver.close();
	}
	
	@Given("Se carga el sistema PRODUCT STORE")
	public void cargarSistema()  {
		paginaInicio.cargar();
	}
	
	@And("Se ingresa con el usuario ya registrado {string} y clave {string}")
	public void logeo(String usuario, String password)  {
		login.login(usuario, password);
	}
	
	@And("Selecciona la categoria")
	public void seleccionarCategoria() {
		llenarCarrito.categoria();
	}
	
	@And("Elige una laptop a comprar y la carga al carrito")
	public void seleccionarLaptop()  {
		llenarCarrito.seleccionarProductoLaptop();
	}
	
	@And("Elige un celular a comprar y la carga al carrito")
	public void seleccionarCelular()  {
		llenarCarrito.seleccionarProductoCelular();
	}
	
	@Then("Visualiza lo cargado en el carrito")
	public void carrito()  {
		llenarCarrito.verCarrito();
	}

}
