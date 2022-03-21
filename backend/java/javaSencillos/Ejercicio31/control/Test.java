package control;

import model.CopaHelado;
import model.Helado;
import model.RecipienteHelado;
import model.SaborHelado;

public class Test {

	public static void test() {
		SaborHelado[] sabores1 = {SaborHelado.fresa, SaborHelado.chocolate};
		SaborHelado[] sabores2 = {SaborHelado.nata, SaborHelado.vainilla};
		SaborHelado[] sabores3 = {SaborHelado.pistacho, SaborHelado.stracciatela, SaborHelado.tartaWhisky};
		
		Helado helado1 = new Helado("Fresa y chocolate", CopaHelado.MEGA, sabores1, RecipienteHelado.BARQUILLO);
		Helado helado2 = new Helado("Nata y vainilla", CopaHelado.MINI, sabores2, RecipienteHelado.CUCURUCHO);
		Helado helado3 = new Helado("Pistacho, stracciatela y tarta de whisky", CopaHelado.SUPER, sabores3, RecipienteHelado.TARRINA);
		
		System.out.println(helado1.toString());
		System.out.println(helado2.toString());
		System.out.println(helado3.toString());
	}
}
