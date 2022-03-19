package Ejercicios_adicionales;
import java.lang.*;
import javax.imageio.ImageIO;
import java.io.*;
import bpc.daw.consola.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Imagen fondo y cursor invisible, monstrar mensaje y pulsar tecla para finalizar.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaTexto ct = c.getCapaTexto();
		CapaFondo cf = c.getCapaFondo();
		File f = new File("Ace_One Piece.png");
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
			Thread.sleep(KeyEvent.KEY_PRESSED*1000);
		}catch(InterruptedException error) {
			ct.println("Interrupción.");
		}
	}

}
