package pe.cart4.compra;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "classpath:features/carrito/4-compra")

public class OrdenCompraTest {

}
