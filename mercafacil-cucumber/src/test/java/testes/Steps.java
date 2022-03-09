package testes;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	Metodos metodos = new Metodos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		metodos.abrirWebSite(string, string);
	}

	@When("clico no botao minha conta")
	public void clico_no_botao_minha_conta() throws IOException {
		metodos.clico_no_botao_minha_conta("/html/body/header/div/nav/ul/li[8]/a");

	}

	@When("preencho usuario")
	public void preencho_usuario() {
		metodos.preencho_usuario("teste", "//*[@id=\"user\"]");
	}

	@When("preencho senha")
	public void preencho_senha() {
		metodos.preencho_senha("123", "//*[@id=\"password\"]");
	}

	@When("clico em acessar")
	public void clico_em_acessar() {

		metodos.clico_em_acessar("//*[@class='v-btn__content']");
	}

	@Then("usuario invalido")
	public void fecharWebSite() throws IOException, InterruptedException {

		Thread.sleep(4000);
		metodos.salvascreenShot("ususario invalido");
		metodos.fecharWebSite();
	}
}
