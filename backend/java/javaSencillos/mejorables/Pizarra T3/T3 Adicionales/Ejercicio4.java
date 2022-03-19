package Ejercicios_adicionales;
import java.lang.*;

import javax.imageio.ImageIO;

import bpc.daw.consola.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Ejercicio4 {

	public static void main(String[] args) {
		//Fondo azul, texto amarillo y cursor invisible, pregunta al usuario ruta imagen y pulsar tecla para finalizar.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaTexto ct = c.getCapaTexto();
		CapaFondo cf = c.getCapaFondo();
		Color azul = new Color(0,0,255);
		FondoColorSolido fcs = new FondoColorSolido(azul);
		cf.setFondo(fcs);
		ct.setColorTexto(Color.YELLOW);
		t.setColorCursor(Color.YELLOW);
		t.setTipoCursor(Teclado.CURSOR_NULO);
		ct.println("Introduzca ruta: ");
		String ruta = t.leerCadenaCaracteres();
		File f = new File(ruta);
		try {
			BufferedImage imagen = ImageIO.read(f);
			FondoImagen fi = new FondoImagen(imagen);
			fi.setEscalado(true);
			cf.setFondo(fi);
			
		}catch(IOException error) {
			ct.println("Error IO.");
		}
		
		t.setTipoCursor(Teclado.CURSOR_NULO);
		c.esperarSiguienteFrame();
		ct.println("Pulsa una tecla para salir: ");
		
		try {
			
			boolean tecla = t.hayTeclaPulsada();
			Thread.sleep(KeyEvent.KEY_PRESSED);
		}catch(InterruptedException error) {
			ct.println("Interrupción.");
		}
	}

}
