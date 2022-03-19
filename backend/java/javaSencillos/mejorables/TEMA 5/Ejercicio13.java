/*Ejercicio 13: Haz un programa que dibuje en la pantalla 8 rectángulos
 cuyas coordenadas, dimensiones y color sean aleatorios.*/
import bpc.daw.consola.*;
import java.awt.*;
import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		// Declaracion de variables:
				final int TOPERGB=256;
				final int TOPEPANTALLA=1000;
				int numero=1;
				int r=0;
				int g=0;
				int b=0;
				Random aleatorio = new Random();
				
				// Creamos la consola:
				Consola pantalla = new Consola("Rectángulos", TOPEPANTALLA, TOPEPANTALLA);
				CapaCanvas canvas = pantalla.getCapaCanvas();
				CapaTexto texto = pantalla.getCapaTexto();
				Teclado teclado = pantalla.getTeclado();
				
				//Pedimos el numero de circulos:
				texto.saltoLinea();
				texto.println("Introduzca el numero de rectángulos: ");
				numero=teclado.leerNumeroEntero();
				
				if (numero > 0) {
					
					Graphics editor = canvas.getGraphics();
					
					for(int i=0; i<=numero; i++) {
						r=aleatorio.nextInt(TOPERGB);
						g=aleatorio.nextInt(TOPERGB);
						b=aleatorio.nextInt(TOPERGB);
						Color rgb = new Color(r,g,b);
						editor.setColor(rgb);
						editor.fillRect(aleatorio.nextInt(TOPEPANTALLA), aleatorio.nextInt(TOPEPANTALLA), aleatorio.nextInt(TOPEPANTALLA), aleatorio.nextInt(TOPEPANTALLA));
					}
							
					editor.dispose();
				}else {
					texto.println("Número erróneo.");
				}

				try {
					Thread.sleep(2000);
				}catch(InterruptedException error) {
					
				}

	}

}
