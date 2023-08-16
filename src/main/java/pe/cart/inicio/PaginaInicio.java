package pe.cart.inicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PaginaInicio {

	private final WebDriver driver;
	
	private final String url = "https://www.demoblaze.com/index.html";

	private final By btnDerecha = By.xpath("//*[@data-slide='next']");
	private final By btnIzquierda = By.xpath("//*[@data-slide='prev']");

	
	public PaginaInicio(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void cargar() {
		this.driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void panel()  {

		this.driver.findElement(btnDerecha).click();
		this.driver.findElement(btnDerecha).click();
		this.driver.findElement(btnDerecha).click();

		this.driver.findElement(btnIzquierda).click();
		this.driver.findElement(btnIzquierda).click();
		this.driver.findElement(btnIzquierda).click();
	}
		
}
