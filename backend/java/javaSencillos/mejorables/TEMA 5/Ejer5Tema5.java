import java.awt.Color;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;

import bpc.daw.consola.*;

public class Ejer5Tema5 {

	public static void main(String[] args) {
		Consola c=new Consola();
		CapaTexto ct=c.getCapaTexto();
		CapaFondo cf=c.getCapaFondo();
		Teclado t=c.getTeclado();
		ct.setColorTexto(Color.RED);
		t.setTipoCursor(t.CURSOR_LINEA);
		boolean repetir=true;
		ct.println("Escribe la ruta de una imagen");
		String ruta=t.leerCadenaCaracteres();
		File arch=new File(ruta);
		BufferedImage imagen=null;
		FondoImagen fi=null;
		try {
			imagen=ImageIO.read(arch);
			fi=new FondoImagen(imagen);
		}catch(IOException e) {
			ct.println("Pasa una ruta válida");
		}
		cf.setFondo(fi);
		ct.cls();
		while(repetir) {
			ct.println("¿Quieres poner la ruta de otra imagen?");
			String resp=t.leerCadenaCaracteres();
			
			if(resp.equalsIgnoreCase("si")) {
				ct.cls();
				FondoColorSolido negro=new FondoColorSolido(Color.BLACK);
				cf.setFondo(negro);
				ct.println("Escriba la nueva ruta");
				String ruta2=t.leerCadenaCaracteres();
				File arch2=new File(ruta2);
				BufferedImage imagen2=null;
				FondoImagen fi2=null;
				try {
					imagen2=ImageIO.read(arch2);
					fi2=new FondoImagen(imagen2);
				}catch(IOException e) {
					ct.println("Escribe una ruta válida");
				}
				cf.setFondo(fi2);
			}else {
				repetir=false;
			}
		}

	}

}
