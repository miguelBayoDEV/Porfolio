package daw.boligrafo;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

import bpc.daw.consola.Teclado;

public class PruebaBoligrafo {

	public static void main(String[] args) {
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		
		Boligrafo b = new Boligrafo(ct);
		
		String[] pruebas = {"Prueba 1", 
							"Prueba 2", 
							"Prueba 3", 
							"Prueba 4", 
							"Prueba 5", };

		for (int i= 0; i<pruebas.length; i++) {
			b.setColor(i);
			b.escribir(pruebas[i]);
		}
		
		String escribirGuay = "ABCD EFG HI JKLMN O P Q RSTU";
		
		b.escribirGuay(escribirGuay);
		
		char a = t.leerCaracter();

	}

}
