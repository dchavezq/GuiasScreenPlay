package co.com.bancolombia.certificacion.capacitaciongoogletranslate.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {

	public static final Target BOTON_LENGUAJE_ORIGEN = Target.the("Boton idioma origen").located(By.id("gt-sl-gms"));

	public static final Target BOTON_LENGUAJE_DESTINO = Target.the("Boton idioma destino").located(By.id("gt-tl-gms"));

	public static final Target OPCION_INGLES = Target.the("La opcion de ingles")
			.located(By.xpath("//div[@id='gt-sl-gms-menu']/table/tbody//tr/td//div[contains(text(),'inglés')]"));

	public static final Target OTRO_ESPANOL = Target.the("Otro idioma")
			.located(By.xpath("//div[@id='gt-tl-gms-menu']/table/tbody//tr/td//div[contains(text(), 'español')]"));

	public static final Target AREA_TRADUCCION = Target.the("Boton idioma destino").located(By.id("source"));
	public static final Target AREA_TRADUCIDA = Target.the("Boton idioma destino").located(By.id("gt-res-dir-ctr"));
	public static final Target BOTON_TRADUCIR = Target.the("Boton idioma destino").located(By.id("gt-submit"));
}
