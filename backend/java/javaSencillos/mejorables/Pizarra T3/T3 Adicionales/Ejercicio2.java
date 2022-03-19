package Ejercicios_adicionales;
import java.lang.*;
import bpc.daw.consola.*;
import java.awt.*;
import java.awt.event.KeyEvent;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Programa de fondo de pantalla de consola por color por teclado.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		boolean pulsada = t.hayTeclaPulsada();
		CapaTexto ct = c.getCapaTexto();
		CapaFondo cf = c.getCapaFondo();
		try {
			
			String f1 = "Introduzca un número entre 0 y 255 para color R: ";
			ct.println(f1);
			int R = t.leerNumeroEntero();
			pulsada = t.hayTeclaPulsada();
			t.activarEco(pulsada);
			String f2 = "Introduzca un número entre 0 y 255 para color G: ";
			ct.println(f2);
			int G = t.leerNumeroEntero();
			pulsada = t.hayTeclaPulsada();
			t.activarEco(pulsada);
			String f3 = "Introduzca un número entre 0 y 255 para color B: ";
			ct.println(f3);
			
			int B = t.leerNumeroEntero();
			pulsada = t.hayTeclaPulsada();
			t.activarEco(pulsada);
			c.esperarSiguienteFrame();
			FondoColorSolido fcs = new FondoColorSolido(R,G,B);
			cf.setFondo(fcs);
			boolean visible = cf.esVisible();
			cf.setVisible(visible);
		
			c.esperarSiguienteFrame();
			Thread.sleep(10000);
		}catch(Exception error) {
			ct.println("Introduzca un número sin decimales.");
		}
	}

}
