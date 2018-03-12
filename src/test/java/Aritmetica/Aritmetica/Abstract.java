package Aritmetica.Aritmetica;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Clases.ClasePrincipal;

public class Abstract {
	
	protected int numero1; // reciben los parametros de la Suite
	protected int numero2;
	protected ClasePrincipal ari;

	@Parameters({"numero1","numero2"})// Anotacion de los parametros
	@BeforeClass
	public void setUp(int numero1, int numero2) {

		ari = new ClasePrincipal();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	@AfterClass
	public void setOut() {

		}
	}


