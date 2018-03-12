package Aritmetica.Aritmetica;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

public class Parametros extends Abstract {
	
	@Title("Prueba de Método Suma")
	@Test
	public void ProbarSuma() {

		try {
			Assert.assertEquals(14,ari.suma(6, 8));

		} catch (Exception e) {
			org.testng.Assert.fail("El resultado de la Suma es Incorrecto");
		}
	}
	
	
	@Title("Prueba de Método Resta")
	@Test
	public void ProbarRestas() {

		try {
			Assert.assertEquals(6,ari.resta(8, 2));

		} catch (Exception e) {
			org.testng.Assert.fail("El resultado de la Resta es Incorrecto");
		}
	}
	
	@Title("Prueba de Método Multiplicar")
	@Test
	public void ProbarMulti() {

		try {
			Assert.assertEquals(8,ari.mult(4, 2));

		} catch (Exception e) {
			org.testng.Assert.fail("El resultado de la Multiplicacion es Incorrecto");
		}
	}

	@Title("Prueba de Método Division")
	@Test
	public void ProbarDiv() {

		try {
			Assert.assertEquals(6,ari.division(45, 8));

		} catch (Exception e) {
			org.testng.Assert.fail("El resultado de la División es Incorrecto");
		}
	}
}





