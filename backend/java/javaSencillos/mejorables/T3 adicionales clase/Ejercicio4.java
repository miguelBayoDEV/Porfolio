import bpc.daw.consola.*;
import javax.imageio.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		Consola cons= new Consola();
		CapaFondo cf= cons.getCapaFondo();
		Teclado t= cons.getTeclado();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		
		
		
		CapaFondo fondo= cons.getCapaFondo();
		Color colorfondo= new Color(0,0,255);
		FondoColorSolido fcs= new FondoColorSolido(colorfondo);
		fondo.setFondo(fcs);
		
		CapaTexto texto= cons.getCapaTexto();
		Color amarillo= new Color(255,255,0);
		texto.setColorTexto(amarillo);
		texto.setTamTexto(50);
		texto.println("Introducir la ruta de la imagen:");
		String r= t.leerCadenaCaracteres();
		
		
		File f= new File(r);
		
		try {
			BufferedImage i = ImageIO.read(f);
			FondoImagen fi= new FondoImagen(i);
			fi.setEscalado(true);
			cf.setFondo(fi);
			
		}
		catch(IOException e) {
			texto.println("Error");
		}
		
		
		t.leerCaracter();
	}

}