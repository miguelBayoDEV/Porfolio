import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;


import javax.imageio.ImageIO;

import bpc.daw.consola.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// Haz un programa en el que se muestren dos fotografías tal y como
		//se muestra en la imagen. Hacer que cuando se pulse una tecla se borre 
		//la pantalla y las dos fotografías intercambien su posición. 
		//Si se pulsa una tecla nuevamente, el programa finalizará.
		
		//Creamos la consola
		Consola consola = new Consola ();
		
		//Creamos un fondo Blanco
		
		CapaFondo capaFondo = consola.getCapaFondo();
		FondoColorSolido color = new FondoColorSolido (255,255,255);
		capaFondo.setFondo(color);
		
		//Ponemos el texto en color negro
		
		CapaTexto texto = consola.getCapaTexto();
		Color c = new Color (0, 0, 0);
		texto.setColorTexto(c);
		
		//Creamos la capa Canvas 
		
		CapaCanvas imagen = consola.getCapaCanvas();
		Graphics foto = imagen.getGraphics();
		
		//Creamos los archivos para las fotos
		
		File file = new File ("foto1.jpeg");
		File file2 = new File ("foto2.jpeg");
		
		
		try {
			//foto 1
			
			BufferedImage foto1 = ImageIO.read(file);
			foto.drawImage(foto1, 100, 200, 400, 600, null);
			
			//foto2
			
			BufferedImage foto2 = ImageIO.read(file2);
			
			foto.drawImage(foto2, 700, 200, 400, 600, null);
			
			Teclado teclado = consola.getTeclado();
			
			//pulsar para intercambiar
			
			texto.println("\n\n pulse una tecla para intercambiar las fotografias");
			
			teclado.leerCaracter();
			
			//borramos lo de la capa
			
			imagen.cls();
			texto.cls();
			
			//intercambiamos fotos
		
			//foto 2
			
			foto.drawImage(foto2, 100, 200, 400, 600, null);
			
			//foto1
			
			foto.drawImage(foto1, 700, 200, 400, 600, null);
			
			//finalizar programa
			
			texto.println("\n\n Pulse una tecla para salir");
			teclado.leerCaracter();
			
			
		}catch (IOException error) {
			texto.println("No se encuentra la imagen");
		}
	
		
		

	}

}
