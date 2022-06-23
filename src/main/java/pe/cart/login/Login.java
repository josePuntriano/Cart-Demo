package pe.cart.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	private By btnLogin = By.xpath("/html/body/nav/div[1]/ul/li[5]/a");
	
	private By txtUsuario = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input");
	private By txtPassword = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input");	
	
	private By btnIngresar = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");

	private WebDriver driver;

	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void login (String usuario, String password) throws InterruptedException {
		
		Thread.sleep(2000);
		this.driver.findElement(btnLogin).click();
				
		Thread.sleep(2000);
		this.driver.findElement(txtUsuario).clear();
		this.driver.findElement(txtUsuario).sendKeys(usuario);
		
		Thread.sleep(2000);
		this.driver.findElement(txtPassword).clear();
		this.driver.findElement(txtPassword).sendKeys(password);
		
		Thread.sleep(2000);
		this.driver.findElement(btnIngresar).click();
		
		Thread.sleep(4000);	
	}
	
}
