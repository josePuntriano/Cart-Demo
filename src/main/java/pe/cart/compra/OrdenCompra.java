package pe.cart.compra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrdenCompra {
	
	private final By btnCart = By.cssSelector("#cartur");
	
	private final By btnOrdencompra = By.xpath("//*[contains(text(),'Place Order')]");
	
	private final By txtName = By.id("name");
	private final By txtCountry = By.id("country");
	private final By txtCity = By.id("city");
	private final By txtCreditCard = By.id("card");
	private final By txtMonth = By.id("month");
	private final By txtYear = By.id("year");
	private final By btnPurchase = By.xpath("//*[contains(text(),'Purchase')]");

	private final By btnOk = By.xpath("//*[contains(text(),'OK')]");
	
	private final By btnLogout = By.cssSelector("#logout2");
	
	private final WebDriver driver;
	private final WebDriverWait wait;

	
	public OrdenCompra(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	
	public void verCarrito()  {
		this.driver.findElement(btnCart).click();
	}
	
	public void realizarPedido()  {
		this.driver.findElement(btnOrdencompra).click();
	}
	
	public void llenarFormulario(String name, String country, String city, String creditCard, String month, String year)  {
		this.driver.findElement(txtName).clear();
		this.driver.findElement(txtName).sendKeys(name);
		
		this.driver.findElement(txtCountry).clear();
		this.driver.findElement(txtCountry).sendKeys(country);
		
		this.driver.findElement(txtCity).clear();
		this.driver.findElement(txtCity).sendKeys(city);
		
		this.driver.findElement(txtCreditCard).clear();
		this.driver.findElement(txtCreditCard).sendKeys(creditCard);
		
		this.driver.findElement(txtMonth).clear();
		this.driver.findElement(txtMonth).sendKeys(month);
		
		this.driver.findElement(txtYear).clear();
		this.driver.findElement(txtYear).sendKeys(year);
		
		this.driver.findElement(btnPurchase).click();
	}
	
	public void confirmacion() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnOk)).click();
	}
	
	public void cerrarSesion()  {
		this.driver.findElement(btnLogout).click();
	}

}
