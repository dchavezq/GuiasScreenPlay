package co.com.bancolombia.certificacion.capacitaciongoogletranslate.tasks;

import co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface.GoogleTranslatePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Traducir implements Task {

	private String palabra;

	public Traducir(String palabra) {
		super();
		this.palabra = palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.BOTON_LENGUAJE_ORIGEN),
				Click.on(GoogleTranslatePage.OPCION_INGLES), 
				Click.on(GoogleTranslatePage.BOTON_LENGUAJE_DESTINO),
				Click.on(GoogleTranslatePage.OTRO_ESPANOL),
				Enter.theValue(palabra).into(GoogleTranslatePage.AREA_TRADUCCION),
				Click.on(GoogleTranslatePage.BOTON_TRADUCIR));
	}

	public static Traducir de(String palabra) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Traducir.class, palabra);
	}

}
