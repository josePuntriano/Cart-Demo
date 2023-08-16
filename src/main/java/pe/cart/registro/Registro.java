package pe.cart.registro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registro {

	private final By btnRegistro = By.cssSelector("#signin2");
	
	private final By txtUsernameRegistro = By.cssSelector("#sign-username");
	private final By txtPasswordRegistro = By.cssSelector("#sign-password");
	
	private final By btnConfirmar = By.xpath("//*[contains(text(),'Sign up') and @type='button']");
	
	private final WebDriver driver;
	private final WebDriverWait wait;

	
	public Registro(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	
	public void registroUsuario(String usernameRegistro, String passwordRegistro)  {
		this.driver.findElement(btnRegistro).click();

		this.driver.findElement(txtUsernameRegistro).clear();
		this.driver.findElement(txtUsernameRegistro).sendKeys(usernameRegistro);

		this.driver.findElement(txtPasswordRegistro).clear();
		this.driver.findElement(txtPasswordRegistro).sendKeys(passwordRegistro);

		this.driver.findElement(btnConfirmar).click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();

		alert.accept();
	}
	
}
