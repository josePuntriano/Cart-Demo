package pe.cart.inicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicio {

	private WebDriver driver;
	
	private String url = "https://www.demoblaze.com/index.html";
	
	private By btnDerecha = By.xpath("/html/body/nav/div[2]/div/a[2]/span[1]");
	private By btnIzquierda = By.xpath("/html/body/nav/div[2]/div/a[1]/span[1]");

	
	public PaginaInicio(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void cargar() {
		this.driver.get(url);
	}
	
	public void panel() throws InterruptedException {
		
		Thread.sleep(2000);
		this.driver.findElement(btnDerecha).click();
		Thread.sleep(1000);
		this.driver.findElement(btnDerecha).click();
		Thread.sleep(1000);
		this.driver.findElement(btnDerecha).click();
		
		Thread.sleep(3000);
		this.driver.findElement(btnIzquierda).click();
		Thread.sleep(1000);
		this.driver.findElement(btnIzquierda).click();
		Thread.sleep(1000);
		this.driver.findElement(btnIzquierda).click();		
	}
		
}
