package co.com.bancolombia.certificacion.capacitaciongoogletranslate.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface.GoogleAppComplements;

public class VaA implements Task {
	
	private Target googleApp;
	
	public VaA (Target googleApp) {
		this.googleApp = googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppComplements.BOTON_APLICACIONES),
		Click.on(googleApp));

	}

	public static VaA LaAplicacion(Target googleApp) {
		// TODO Auto-generated method stub
		return instrumented(VaA.class, googleApp);
	}


	

}
