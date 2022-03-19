import java.lang.*;
import javax.imageio.ImageIO;
import bpc.daw.consola.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		CapaFondo cf = c.getCapaFondo();
		boolean repetir = true;
		while(repetir) {
			ct.println("Introduzca ruta de la imagen de fondo: ");
			String ruta = t.leerCadenaCaracteres();
			File f = new File(ruta);
			try {
				BufferedImage imagen = ImageIO.read(f);
				FondoImagen fondo = new FondoImagen(imagen);
				fondo.setEscalado(true);
				cf.setFondo(fondo);
				ct.print("¿Desea poner otra imagen (s)? ");
				String si = t.leerCadenaCaracteres();
				boolean s = si.equalsIgnoreCase("s");
				if(!s) {
					repetir = false;
				}
			}catch(IOException error) {
				ct.print("Error al carger imagen.");
			}
		}
		
	}

}
