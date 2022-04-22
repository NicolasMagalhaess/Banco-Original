package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browser;
import metodos.Metodos;

public class Cadastro {

	Browser browser = new Browser();
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu entre no site")
	public void que_eu_entre_no_site() {
		browser.abrirNavegador("https://www.original.com.br/");
	}

	@Given("clicar em abrir conta")
	public void clicar_em_abrir_conta() {
		metodos.click(el.getPopUp());
		metodos.click(el.getAbrirConta());
	}

	@When("preencho os dados")
	public void preencho_os_dados() {
		metodos.escrever(el.getNome(), "Marcos Souza");
		metodos.escrever(el.getTelefone(), "21 92770-5852");
		metodos.escrever(el.getEmail(), "marcosmurilosouza_@brastek.com.br");
		metodos.escrever(el.getCpf(), "469.740.180-88");
		metodos.click(el.getClick());

	}

	@Then("solicitacao e enviada")
	public void solicitacao_e_enviada() {

	}

}
