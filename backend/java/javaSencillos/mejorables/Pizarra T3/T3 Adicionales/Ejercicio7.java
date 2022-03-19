package Ejercicios_adicionales;
import java.lang.*;

import javax.imageio.ImageIO;

import bpc.daw.consola.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Poner dos fotografias e intercambiarlas pulsando tecla y finaliza pulsando tecla.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaCanvas cc = c.getCapaCanvas();
		CapaTexto ct = c.getCapaTexto();
		CapaFondo cf = c.getCapaFondo();
		File f = new File("Ace_One Piece.png");
		File f1 = new File("Slam Dunk.jpg");
		ct.println("Imágenes en posición origen.");
		try {
			Thread.sleep(5000);
			BufferedImage imagen = ImageIO.read(f);
			BufferedImage imagen1 = ImageIO.read(f1);
			FondoImagen fi = new FondoImagen(imagen);
			FondoImagen fi1 = new FondoImagen(imagen1);
			fi.setEscalado(false);
			fi1.setEscalado(false);
			Rectangle r = new Rectangle(0,0,150,200);
			Rectangle r1 = new Rectangle(0,0,150,200);
			fi.setSeccionOrigen(r);
			fi1.setSeccionOrigen(r1);
			cf.setFondo(fi);
			cf.setFondo(fi1);
			boolean pulsada = t.hayTeclaPulsada();
			if(pulsada) {
				ct.print("Imágenes en posición inversa.");
				cf.setFondo(fi1);
				cf.setFondo(fi);
				Thread.sleep(5000);
				if(pulsada) {
					Thread.sleep(KeyEvent.KEY_PRESSED);
				}
			}
		}catch(IOException error) {
			ct.println("Error IO.");
		}catch(InterruptedException error) {
			ct.println("Interrupción.");
		}
		
	}

}
