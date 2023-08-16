package pe.cart4.compra;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.cart.compra.OrdenCompra;
import pe.cart.driver.Driver;
import pe.cart.driver.Driver.NavegadorWeb;
import pe.cart.inicio.PaginaInicio;
import pe.cart.login.Login;


public class OrdenCompraSteps {
	
	@Managed
	private WebDriver driver;
	private WebDriverWait wait;
	private PaginaInicio paginaInicio;
	private Login login;
	private OrdenCompra ordenCompra;
	
	@Before
	public void setupTest() {
		driver = Driver.getInstancia(NavegadorWeb.CHROME);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,10);

		paginaInicio = new PaginaInicio(driver);
		login = new Login(driver,wait);
		ordenCompra = new OrdenCompra(driver,wait);
	}
	
	@After
	public void close() {
		driver.close();
	}
	
	@Given("Se carga el sistema PRODUCT STORE")
	public void cargarSistema() {
		paginaInicio.cargar();
	}
	
	@And("Se ingresa con el usuario ya registrado {string} y clave {string}")
	public void logeo(String usuario, String password)  {
		login.login(usuario, password);
	}
	
	@And("Se ingresa al carrito para ver el listado de productos a comprar")
	public void carrito() {
		ordenCompra.verCarrito();
	}
	
	@And("Se realiza el pedido dandole al boton Place Order")
	public void realizaOrdenCompra() {
		ordenCompra.realizarPedido();
	}
	@And("Se ingresa el nombre {string}, pais {string}, ciudad {string}, tarjeta de credito {string}, mes {string}, y periodo {string}")
	public void ingresaDatos(String name, String country, String city, String creditCard, String month, String year) {
		ordenCompra.llenarFormulario(name, country, city, creditCard, month, year);
	}
	
	@And("Se confirma la compra")
	public void confirmaCompra() throws InterruptedException{
		ordenCompra.confirmacion();
	}
	
	@Then("El usuario cierra sesion")
	public void cierraSesion() {
		ordenCompra.cerrarSesion();
	}


}
