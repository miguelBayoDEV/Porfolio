import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import javax.imageio.ImageIO;

import bpc.daw.consola.*;
public class Ejercicio3_MiguelPuertaBayo {

	public static void main(String[] args) {
		
		Consola c = new Consola();
		CapaTexto ct = c.getCapaTexto();
		Teclado t = c.getTeclado();
		CapaFondo cf = c.getCapaFondo();
		ct.print("Escriba el nombre del usuario: ");
		String nombre = t.leerCadenaCaracteres();
		
		Path p = Paths.get(nombre+".properties");
		if(Files.exists(p)) {
			
			Properties pro = new Properties();
			FileInputStream f = null;
			
			try {
				f = new FileInputStream(nombre+".properties");
				pro.load(f);
				
				String ruta_imagen = "";
				String fondo_escalado = "";
				String saludo = "";
				String color_letras = "";
				String imagen = pro.getProperty("ruta_imagen");
				String escalar = pro.getProperty("fondo_escalado");
				String usuario = pro.getProperty("saludo");
				String color = pro.getProperty("color_letras");
				
				File fi = new File(imagen);
				BufferedImage image = null;
				try {
					image = ImageIO.read(fi);
				}catch(IOException error) {
					ct.print(error.getMessage());
				}
				boolean escalada = Boolean.parseBoolean(escalar);
				FondoImagen fondo = new FondoImagen(image);
				fondo.setEscalado(escalada);
				cf.setFondo(fondo);
				pro.setProperty(usuario, "Hola "+nombre);
				ct.setColorTexto(new Color(Integer.parseInt(color)));
				ct.println(usuario);
				
				char caracter = t.leerCaracter();
				String ruta_nueva = "";
				String b = "";
				String texto = "";
				int R = 0;
				int G = 0;
				int B = 0;
				if(t.teclaPulsada(KeyEvent.VK_I)) {
					ct.cls();
					ct.print("Introduzca nueva ruta de imagen: ");
					ruta_nueva = t.leerCadenaCaracteres();
					b = "";
					if(ruta_nueva.equalsIgnoreCase("Si")) {
						b = "true";
					}else {
						b = "false";
					}
					pro.setProperty(imagen, ruta_nueva);
					pro.setProperty(escalar, b);
				}else if(t.teclaPulsada(KeyEvent.VK_S)) {
					ct.println("Introduzca nuevo texto de saludo: ");
					texto = t.leerCadenaCaracteres();
					try {
						R = t.leerNumeroEntero();
						if(R>=0&&R<=255) {
							G = t.leerNumeroEntero();
							if(G>=0&&G<=255) {
								B = t.leerNumeroEntero();
								if(B<0&&B>255) {
									B=0;
								}
							}
						}
					}catch(Exception error) {
						ct.print(error.getMessage());
					}
					pro.setProperty(usuario, texto);
					pro.setProperty(color, Integer.toString(R)+","+Integer.toString(G)+","+Integer.toString(B));
				}
				FileOutputStream salida = new FileOutputStream(ruta_nueva);
				pro.store(salida, "");
				f.close();
				salida.close();
			}catch(IOException error) {
				ct.print(error.getMessage());
			}
			
		}else {
			ct.print("No se encuentra el archivo de configuración del usuario ("+nombre+").");
		}
		char w = t.leerCaracter();
	}

}
