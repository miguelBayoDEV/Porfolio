import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.*;

import javax.imageio.ImageIO;

import bpc.daw.consola.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		ct.println("Introduzca la ruta del archivo imagen: ");
		Teclado t = c.getTeclado();
		String ruta = t.leerCadenaCaracteres();
		File f = null;
		if(ruta.endsWith(".jpg")) {
			f = new File(ruta);
		}else {
			String nruta = ruta+".jpg";
			f = new File(nruta);
		}
		
		CapaFondo cf = c.getCapaFondo();
		try {
			BufferedImage imagen = ImageIO.read(f);
			FondoImagen fondo = new FondoImagen(imagen);
			/*
			ct.print("¿Desea escalar la imagen a toda la pantalla (s/n)? ");
			String c_letra = t.leerCadenaCaracteres();
			boolean tecla = c_letra.equalsIgnoreCase("s");
			if(tecla) {
				fondo.setEscalado(true);
				cf.setFondo(fondo);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}else {
				fondo.setEscalado(false);
				cf.setFondo(fondo);
				t.setTipoCursor(Teclado.CURSOR_NULO);
				t.leerCaracter();
			}
			 */
			fondo.setEscalado(true);
			cf.setFondo(fondo);
			t.setTipoCursor(Teclado.CURSOR_NULO);
			t.leerCaracter();
		}catch(IOException error) {
			ct.print("Error al cargar la imagen.");
		}
	}

}
