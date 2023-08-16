package pe.cart.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {
	
	private final By imagenCel = By.xpath("//*[@*='imgs/Lumia_1520.jpg']");
	private final By btnLogin = By.cssSelector("#login2");
	
	private final By txtUsuario = By.cssSelector("#loginusername");
	private final By txtPassword = By.cssSelector("#loginpassword");
	
	private final By btnIngresar = By.xpath("//*[contains(text(),'Log in') and @type='button']");


	private final WebDriver driver;
	private final WebDriverWait wait;
	
	public Login(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}


	public void login (String usuario, String password)  {
		wait.until(ExpectedConditions.visibilityOfElementLocated(imagenCel));
		this.driver.findElement(btnLogin).click();

		this.driver.findElement(txtUsuario).clear();
		this.driver.findElement(txtUsuario).sendKeys(usuario);

		this.driver.findElement(txtPassword).clear();
		this.driver.findElement(txtPassword).sendKeys(password);

		this.driver.findElement(btnIngresar).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(btnIngresar));
	}
	
}
