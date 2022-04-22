package runner;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Browser;
import metodos.Metodos;

public class executa {
	Metodos metodos = new Metodos();
	Browser browser = new Browser();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		browser.abrirNavegador("https://.com.br/");

	}

	@After
	public void tearDown() throws Exception {

		metodos.click(el.getPopUp());
		metodos.click(el.getAbrirConta());
		metodos.escrever(By.id("nome"), "Marcos Murilo Souza");
		metodos.escrever(By.id("telefone"), "21 92770-5852");
		metodos.escrever(By.id("email"), "marcosmurilosouza_@brastek.com.br");
		metodos.escrever(By.id("cpf"), "958.114.441-25");
		metodos.click(By.id("btnEnviar"));

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
