package co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppComplements {

	public static final Target BOTON_APLICACIONES = Target.the("El boton que muestra las aplicaciones")
			.located(By.id("gbwa"));

	public static final Target BOTON_GOOGLE_TRANSLATE = Target.the("Bot�n de app traductor").located(By.id("gb51"));



}
