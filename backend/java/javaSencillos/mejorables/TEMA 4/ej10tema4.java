package ej10tema4;
import bpc.daw.consola.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class ej10tema4 {

	public static void main(String[] args) {
		Consola c=new Consola();
		Teclado t=c.getTeclado();
		CapaFondo fon=c.getCapaFondo();
		CapaTexto tex=c.getCapaTexto();
		tex.print("Escribe una ruta:");
		String rutas=t.leerCadenaCaracteres();
		File ruta=new File(rutas);
			try {
			BufferedImage foto= ImageIO.read(ruta);
			FondoImagen fonc=new FondoImagen(foto);
			tex.print("¿Quieres que se escale s/n?");
			String esc=t.leerCadenaCaracteres();
			fon.setFondo(fonc);
			if(esc.contentEquals("s") || esc.equals("S")){
				fonc.setEscalado(true);
			}
			if(esc.contentEquals("n") || esc.contentEquals("N")){
				t.leerCaracter();
			}else {
				System.out.print("Escribe n o N");
				t.leerCaracter();
			}
		}catch(IOException error){
			tex.print("Escribe una ruta valida");
			t.leerCaracter();
		}
		
		
		
	}

}
