package ejercicio11;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import bpc.daw.consola.*;



public class Ejercicio11 {
	
	public static void main(String[] args) {
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		CapaFondo cf = c.getCapaFondo();
		Teclado t = c.getTeclado();
		
		ct.println("Introduce la ruta de la imagen JPG");
		String ruta = t.leerCadenaCaracteres();
		
		Image imagen = null;
		/*String subruta = ruta.substring(ruta.length()-4);
				
		if (!subruta.equals(".jpg")) {
			ruta = ruta+".jpg";
		} */
		
		if(!ruta.endsWith(".jpg")) {
			ruta = ruta+".jpg";
		}
		
		try {
			imagen = ImageIO.read(new File(ruta));
			FondoImagen fondo = new FondoImagen(imagen);
			fondo.setEscalado(true);
			cf.setFondo(fondo);
		}catch(IOException e) {
			ct.println("Error con la ruta/formato de la imagen");
		}
		
		
		ct.println("Pulsa cualquier tecla para salir.");
		char finalizar = t.leerCaracter();
		
	}
	
}
