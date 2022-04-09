package control;

import model.Idioma;
import tools.OperacionesScanner;
import tools.Traductor;

public class Test {

	public static void test() {
		System.out.println(Traductor.palabraTraducida(OperacionesScanner.leerDato("Introduzca palabra:"), Idioma.ALEMAN));
		System.out.println(Traductor.palabraTraducida(OperacionesScanner.leerDato("Introduzca palabra:"), Idioma.BULGARO));
		System.out.println(Traductor.palabraTraducida(OperacionesScanner.leerDato("Introduzca palabra:"), Idioma.CATALAN));
	}
}
