package Ejercicios_adicionales;
import java.lang.*;
import java.io.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		//Descarga archivo tipo letra TTF y cambia el tipo de letra de la consola.
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		ct.println("Estilo por defecto de la consola.");
		File f = new File("stocky.ttf");
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT,f);
			ct.setFont(font);
			ct.println("Cambio estilo de letra.");
			Thread.sleep(10000);
		}catch(Exception error) {
			ct.println(error.getMessage());
		}
	}

}
