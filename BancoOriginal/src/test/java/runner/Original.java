package runner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Browser;
import metodos.Metodos;

public class Original {
	Metodos metodos = new Metodos();
	Browser browser = new Browser();

	@Before
	public void setUp() throws Exception {
		  browser.abrirNavegador("https://www.google.com.br/");
		   
	}

	@After
	public void tearDown() throws Exception {
		// metodos.esperar();
			metodos.escrever(By.name("q"), "panela");
		
		
		
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
