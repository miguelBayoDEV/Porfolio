package Ejercicios_adicionales;
import java.lang.*;
import java.awt.*;
import bpc.daw.consola.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		//Escribir por pantalla una frase roja y que finalice en 10 segundos.
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		String frase ="Bienvenidos al instituto.";
		Color rojo = new Color(255,0,0);
		ct.setColorTexto(rojo);
		ct.println(frase);
		try {
			long ms = 10*1000;
			Thread.sleep(ms);
		}catch(InterruptedException error) {
			System.out.println(error.getMessage());
		}
	}

}
