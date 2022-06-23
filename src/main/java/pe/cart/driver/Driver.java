package pe.cart.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	public enum NavegadorWeb { CHROME, EDGE	};
	
	
	public static WebDriver getInstancia(NavegadorWeb navegador) {
		if( navegador == NavegadorWeb.CHROME) {
			return getDriverChrome();
		}
			return getDriverEdge();	
	}
	
	
	private static WebDriver getDriverChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	
	private static WebDriver getDriverEdge() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
		return driver;
	}
	

}
