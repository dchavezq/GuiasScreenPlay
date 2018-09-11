package co.com.bancolombia.certificacion.capacitaciongoogletranslate.stepdefinitions;

import org.openqa.selenium.WebDriver;
import co.com.bancolombia.certificacion.capacitaciongoogletranslate.questions.LaRespuesta;
import co.com.bancolombia.certificacion.capacitaciongoogletranslate.tasks.AbrirNavegador;
import co.com.bancolombia.certificacion.capacitaciongoogletranslate.tasks.Traducir;
import co.com.bancolombia.certificacion.capacitaciongoogletranslate.tasks.VaA;
import co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface.GoogleAppComplements;
import co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.hamcrest.Matchers;

public class GoogleTranslateDefinitions {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private Actor marcela = Actor.named("Marcela");

	private GoogleHomePage googleHomePage;

	// Enlace entre el actor y el driver
	@Before
	public void configuracionInicial() {
		marcela.can(BrowseTheWeb.with(herBrowser));

	}

	@Given("^que Marcela quiere usar el traductor de Google$")
	public void queMarcelaQuiereUsarElTraductorDeGoogle() throws Exception {
		// precondiciones- todas las acciones a llevar a cabo

		marcela.wasAbleTo(AbrirNavegador.google(googleHomePage),
				VaA.LaAplicacion(GoogleAppComplements.BOTON_GOOGLE_TRANSLATE));

	}

	@When("^ella traduce la palabra (.*) de Ingles a Español$")
	public void ellaTraduceLaPalabraTableDeInglesAEspañol(String palabra) {
		// condiciones
		marcela.wasAbleTo(Traducir.de(palabra));

	}

	@Then("^ella deberia ver la palabra (.*) en la pantalla$")
	public void ellaDeberiaVerLaPalabraMesaEnLaPantalla(String palabraesperada) {

		// consecuencias o pregunta
		marcela.should(seeThat(LaRespuesta.es(), Matchers.equalTo(palabraesperada)));

	}

}
