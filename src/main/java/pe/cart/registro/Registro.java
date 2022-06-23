package pe.cart.registro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registro {

	private By btnRegistro = By.xpath("/html/body/nav/div[1]/ul/li[8]/a");
	
	private By txtUsernameRegistro = By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input");
	private By txtPasswordRegistro = By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input");
	
	private By btnConfirmar = By.xpath("/html/body/div[2]/div/div/div[3]/button[2]");
	
	private WebDriver driver;

	
	public Registro(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void registroUsuario(String usernameRegistro, String passwordRegistro) throws InterruptedException {
		
		Thread.sleep(4000);
		this.driver.findElement(btnRegistro).click();
				
		Thread.sleep(2000);
		this.driver.findElement(txtUsernameRegistro).clear();
		this.driver.findElement(txtUsernameRegistro).sendKeys(usernameRegistro);
		
		Thread.sleep(2000);
		this.driver.findElement(txtPasswordRegistro).clear();
		this.driver.findElement(txtPasswordRegistro).sendKeys(passwordRegistro);
		
		Thread.sleep(2000);
		this.driver.findElement(btnConfirmar).click();
		
		Thread.sleep(3000);
	}
	
}
