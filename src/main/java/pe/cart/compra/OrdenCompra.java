package pe.cart.compra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdenCompra {
	
	private By btnCart = By.xpath("/html/body/nav/div[1]/ul/li[4]/a");
	
	private By btnOrdencompra = By.xpath("/html/body/div[6]/div/div[2]/button");
	
	private By txtName = By.id("name");
	private By txtCountry = By.id("country");
	private By txtCity = By.id("city");
	private By txtCreditCard = By.id("card");
	private By txtMonth = By.id("month");
	private By txtYear = By.id("year");
	private By btnPurchase = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
	
	private By btnOk = By.xpath("/html/body/div[10]/div[7]/div/button");
	
	private By btnLogout = By.xpath("/html/body/nav/div[1]/ul/li[6]/a");
	
	private WebDriver driver;
//prueba
	
	public OrdenCompra(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void verCarrito() throws InterruptedException {
		
		Thread.sleep(3000);
		this.driver.findElement(btnCart).click();
	}
	
	public void realizarPedido() throws InterruptedException {
		
		Thread.sleep(3000);
		this.driver.findElement(btnOrdencompra).click();
	}
	
	public void llenarFormulario(String name, String country, String city, String creditCard, String month, String year) throws InterruptedException {
		
		Thread.sleep(3000);
		
		this.driver.findElement(txtName).clear();
		this.driver.findElement(txtName).sendKeys(name);
		Thread.sleep(1000);
		
		this.driver.findElement(txtCountry).clear();
		this.driver.findElement(txtCountry).sendKeys(country);
		Thread.sleep(1000);
		
		this.driver.findElement(txtCity).clear();
		this.driver.findElement(txtCity).sendKeys(city);
		Thread.sleep(1000);
		
		this.driver.findElement(txtCreditCard).clear();
		this.driver.findElement(txtCreditCard).sendKeys(creditCard);
		Thread.sleep(1000);
		
		this.driver.findElement(txtMonth).clear();
		this.driver.findElement(txtMonth).sendKeys(month);
		Thread.sleep(1000);
		
		this.driver.findElement(txtYear).clear();
		this.driver.findElement(txtYear).sendKeys(year);
		Thread.sleep(3000);
		
		this.driver.findElement(btnPurchase).click();
	}
	
	public void confirmacion() throws InterruptedException {
		
		Thread.sleep(5000);
		this.driver.findElement(btnOk).click();
	}
	
	public void cerrarSesion() throws InterruptedException {
		
		Thread.sleep(3000);
		this.driver.findElement(btnLogout).click();
		Thread.sleep(3500);
	}

}
