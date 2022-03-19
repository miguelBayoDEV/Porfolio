package ejercicio6tema5;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import bpc.daw.consola.*;
public class ej6tema5 {

	public static void main(String[] args) {
		Consola c=new Consola("Hola",800,800);
		CapaTexto tx=c.getCapaTexto();
		Teclado te=c.getTeclado();
		CapaCanvas can=c.getCapaCanvas();
		Graphics cir=can.getGraphics();
		Random ale=new Random();
		tx.println("¿Cuantos circulos quieres dibujar?");
		int numero=te.leerNumeroEntero();
		if(numero>0){
			boolean comprobar=true;
			while(comprobar==true){
				if(numero!=0){
				int r=ale.nextInt(256);
				int g=ale.nextInt(256);
				int b=ale.nextInt(256);
				int x=ale.nextInt(800);
				int y=ale.nextInt(800);
				Color col=new Color(r,g,b);
				cir.setColor(col);
				cir.drawOval(x, y, 40, 40);
				numero--;
				}else {
				te.leerCaracter();
				comprobar=false;
				}
			}
			
		}else {
			tx.println("No te entiendo pulsa una tecla para finalizar");
			te.leerCaracter();
		}
		

	}

}
