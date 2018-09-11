package co.com.bancolombia.certificacion.capacitaciongoogletranslate.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

public class AbrirNavegador implements Task{
	
	private  PageObject page;
	
	//CONSTRUCTOR SETTER
	public AbrirNavegador (PageObject page) {
		this.page =page;
		
	}

	@Override
	@Step ("{0} Abrir el navegador de google")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
		
	}

	public static AbrirNavegador google (PageObject page) {
		return instrumented(AbrirNavegador.class, page);
	}

	
}
