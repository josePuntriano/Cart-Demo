package pe.cart3.llenado.carrito;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "classpath:features/carrito/3-seleccionarProductos")

public class SeleccionProductosTest {

}
