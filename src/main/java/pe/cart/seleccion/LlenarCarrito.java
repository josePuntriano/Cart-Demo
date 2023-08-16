package pe.cart.seleccion;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LlenarCarrito {

	private final By btnPhones = By.xpath("//*[contains(text(),'Phones')]");
	private final By btnLaptops = By.xpath("//*[contains(text(),'Laptops')]");
	private final By btnMonitors = By.xpath("//*[contains(text(),'Monitors')]");


	private final By btnLaptopCompra = By.xpath("//*[contains(text(),'MacBook Pro') and @href]");
	private final By btnAddCart = By.xpath("//*[contains(text(),'Add to cart')]");

	private final By btnPhoneCompra = By.xpath("//*[contains(text(),'HTC One M9') and @href]");

	private final By btnHome = By.xpath("//*[contains(text(),'Home') and @href]");
	private final By btnCart = By.cssSelector("#cartur");


	private final By imagenCel = By.xpath("//*[@*='imgs/Lumia_1520.jpg']");
	private final By imagenLap = By.xpath("//*[@href='prod.html?idp_=8' and (contains(text(),'Sony vaio i5'))]");
	private final By imagenMon = By.xpath("//*[contains(text(),'Apple monitor 24')]");

	private final WebDriver driver;
	private final WebDriverWait wait;


	public LlenarCarrito(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}


	public void categoria(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(imagenCel));
		this.driver.findElement(btnLaptops).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(imagenLap));
		this.driver.findElement(btnMonitors).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(imagenMon));
		this.driver.findElement(btnPhones).click();
	}

	public void seleccionarProductoLaptop(){
		this.driver.findElement(btnLaptops).click();
		this.driver.findElement(btnLaptopCompra).click();
		this.driver.findElement(btnAddCart).click();

		wait.until(ExpectedConditions.alertIsPresent());
		this.driver.switchTo().alert().accept();

		this.driver.findElement(btnHome).click();
	}

	public void seleccionarProductoCelular(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(imagenCel));
		this.driver.findElement(btnPhones).click();
		this.driver.findElement(btnPhoneCompra).click();
		this.driver.findElement(btnAddCart).click();

		wait.until(ExpectedConditions.alertIsPresent());
		this.driver.switchTo().alert().accept();

		this.driver.findElement(btnHome).click();
	}

	public void verCarrito(){
		this.driver.findElement(btnCart).click();
	}

}