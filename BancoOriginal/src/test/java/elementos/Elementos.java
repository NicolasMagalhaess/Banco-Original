package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By abrirConta= By.xpath("//*[@id=\"section-2\"]/div[2]/div/div/a");
	private By popUp= By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By nome= By.id("nome");
	private By telefone= By.id("telefone");
	private By cpf= By.id("cpf");
	private By email= By.id("email");
	private By click= By.id("btnEnviar");

	public By getTelefone() {
		return telefone;
	}

	public By getCpf() {
		return cpf;
	}

	public By getEmail() {
		return email;
	}

	public By getClick() {
		return click;
	}

	public By getAbrirConta() {
		return abrirConta;
	}

	public By getPopUp() {
		return popUp;
	}

	public By getNome() {
		return nome;
	}

}
