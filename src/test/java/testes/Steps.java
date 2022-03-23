package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que eu esteja no site da empresa")
	public void que_eu_esteja_no_site_da_empresa() {
		metodos.abrirNavegador("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
	  
	}

	@When("preencher os dados")
	public void preencher_os_dados() throws InterruptedException {
		metodos.escrever(null, null);
	 
	}

	@Then("visualizo as informacoes")
	public void visualizo_as_informacoes() {
	   
	}


}
