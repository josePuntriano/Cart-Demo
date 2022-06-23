package pe.cart.seleccion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LlenarCarrito {
	
	private By btnPhones = By.xpath("/html/body/div[5]/div/div[1]/div/a[2]");
	private By btnLaptops = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]");
	private By btnMonitors = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");
	
	private By scrollLaptop = By.xpath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h4/a");
	private By scrollPhones = By.xpath("/html/body/div[5]/div/div[2]/form/ul/li[2]/button");
	private By scrollMonitors = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");
	private By scrollHome = By.xpath("/html/body/nav/div[1]/ul/li[1]/a");
	
	private By btnLaptopCompra = By.xpath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h4/a");
	private By btnAddCart = By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");
	
	private By btnPhoneCompra = By.xpath("/html/body/div[5]/div/div[2]/div/div[5]/div/div/h4/a");
	
	private By btnHome = By.xpath("/html/body/nav/div/div/ul/li[1]/a");
	private By btnCart = By.xpath("/html/body/nav/div[1]/ul/li[4]/a");
	
	private WebDriver driver;
	
	
	public LlenarCarrito(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void categoria() throws InterruptedException {
		
		Thread.sleep(3000);
		
		this.driver.findElement(btnLaptops).click();
		Thread.sleep(3500);
		
		WebElement scroll = driver.findElement(scrollLaptop);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()", scroll);
		Thread.sleep(3500);
		
		WebElement scroll2 = driver.findElement(scrollMonitors);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", scroll2);
        
		this.driver.findElement(btnMonitors).click();
		Thread.sleep(3500);
		
		this.driver.findElement(btnPhones).click();
		Thread.sleep(3500);
		
		WebElement scroll3 = driver.findElement(scrollPhones);
        JavascriptExecutor jse3 = (JavascriptExecutor)driver;
        jse3.executeScript("arguments[0].scrollIntoView()", scroll3);
        Thread.sleep(3500);
        
        WebElement scroll4 = driver.findElement(scrollMonitors);
        JavascriptExecutor jse4 = (JavascriptExecutor)driver;
        jse4.executeScript("arguments[0].scrollIntoView()", scroll4); 
        Thread.sleep(3500);
        
        WebElement scroll5 = driver.findElement(scrollHome);
        JavascriptExecutor jse5 = (JavascriptExecutor)driver;
        jse5.executeScript("arguments[0].scrollIntoView()", scroll5);
	}
	
	public void seleccionarProductoLaptop() throws InterruptedException {

		this.driver.findElement(btnLaptops).click();
		
		Thread.sleep(3500);
		WebElement scroll = driver.findElement(scrollLaptop);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()", scroll);
		
		Thread.sleep(3000);
		this.driver.findElement(btnLaptopCompra).click();
		
		Thread.sleep(3000);
		this.driver.findElement(btnAddCart).click();
		
		Thread.sleep(2000);
		this.driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		this.driver.findElement(btnHome).click();
		Thread.sleep(2000);
	}
	
	public void seleccionarProductoCelular() throws InterruptedException {
		
		this.driver.findElement(btnPhones).click();
		Thread.sleep(2500);
		
		WebElement scroll = driver.findElement(scrollPhones);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()", scroll);
        Thread.sleep(2500);
        
        WebElement scroll2 = driver.findElement(scrollMonitors);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", scroll2); 
        
        Thread.sleep(3000);
		this.driver.findElement(btnPhoneCompra).click();
		
		Thread.sleep(2000);
		this.driver.findElement(btnAddCart).click();
		
		Thread.sleep(1000);
		this.driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		this.driver.findElement(btnHome).click();
		Thread.sleep(2000);
	}
	
	public void verCarrito() throws InterruptedException {
		
		this.driver.findElement(btnCart).click();
		Thread.sleep(4000);
	}

}
