package control;

import model.Coche;
import model.Lavado;
import model.TipoLavado;

public class TunelLavado {

	public static void test() {
		Coche cohe1 = new Coche("Opel Corsa", "2345SDF", 20.3, 10.2);
		Coche cohe2 = new Coche("Ford Mondeo", "7656ERT", 23.5, 12.4);
		Coche cohe3 = new Coche("Lincon", "2345POI", 25.7, 20.4);
		
		Lavado lavado1 = new Lavado(cohe1, TipoLavado.BASICO);
		Lavado lavado2 = new Lavado(cohe2, TipoLavado.NORMAL);
		Lavado lavado3 = new Lavado(cohe3, TipoLavado.SUPER);
		
		System.out.println(lavado1.toString());
		System.out.println(lavado2.toString());
		System.out.println(lavado3.toString());
	}
}
