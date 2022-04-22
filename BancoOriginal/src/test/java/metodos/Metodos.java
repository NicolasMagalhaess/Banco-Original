package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Metodos extends Browser {

	/**
	 * metodo para clickar num elemento web
	 * 
	 * @author Nicolas
	 * @param elemento
	 */
	public void click(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("--------erro ao clickar--------" + e.getMessage());

		}

	}

	/**
	 * metodo para escrever num elemento web com texto
	 * 
	 * @author Nicolas
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		try {
	driver.findElement(elemento).sendKeys(texto);
	
		} catch (Exception e) {
			System.err.println("--------erro ao escrever--------" + e.getMessage());
		}
	}
	public void esperar() {
		
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
}
