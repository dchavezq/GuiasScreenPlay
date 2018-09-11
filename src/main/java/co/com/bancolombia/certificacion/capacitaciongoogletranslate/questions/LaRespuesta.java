package co.com.bancolombia.certificacion.capacitaciongoogletranslate.questions;

import co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

	

	public static LaRespuesta es() {
		// TODO Auto-generated method stub
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(GoogleTranslatePage.AREA_TRADUCIDA).viewedBy(actor).asString();
	}

}
