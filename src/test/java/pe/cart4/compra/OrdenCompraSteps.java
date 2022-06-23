package pe.cart4.compra;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import pe.cart.compra.OrdenCompra;
import pe.cart.driver.Driver;
import pe.cart.driver.Driver.NavegadorWeb;
import pe.cart.inicio.PaginaInicio;
import pe.cart.login.Login;


public class OrdenCompraSteps {
	
	@Managed
	private WebDriver driver;
	private PaginaInicio paginaInicio;
	private Login login;
	private OrdenCompra ordenCompra;
	
	@Before
	public void configuracionInicial() {
		
		driver = Driver.getInstancia(NavegadorWeb.CHROME);
		driver.manage().window().maximize();
		paginaInicio = new PaginaInicio(driver);
		login = new Login(driver);
		ordenCompra = new OrdenCompra(driver);
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
	
	@And("Se ingresa al carrito para ver el listado de productos a comprar")
	public void carrito() throws InterruptedException {
		ordenCompra.verCarrito();
	}
	
	@And("Se realiza el pedido dandole al botón Place Order")
	public void realizaOrdenCompra() throws InterruptedException {
		ordenCompra.realizarPedido();
	}
	@And("Se ingresa el nombre {string}, país {string}, ciudad {string}, tarjeta de crédito {string}, mes {string}, y año {string}")
	public void ingresaDatos(String name, String country, String city, String creditCard, String month, String year) throws InterruptedException {
		ordenCompra.llenarFormulario(name, country, city, creditCard, month, year);
	}
	
	@And("Se confirma la compra")
	public void confirmaCompra() throws InterruptedException {
		ordenCompra.confirmacion();
	}
	
	@Then("El usuario cierra sesión")
	public void cierraSesion() throws InterruptedException {
		ordenCompra.cerrarSesion();
	}


}
