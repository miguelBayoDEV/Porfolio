package ejercicio9;
import bpc.daw.consola.CapaFondo;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;
import bpc.daw.consola.Teclado;

public class Ejercicio9 { 

	public static void main(String[] args) {
		Consola c1 = new Consola();
		Teclado t1 = c1.getTeclado();
		CapaTexto texto1 = c1.getCapaTexto();
		texto1.print(0,0,"Introduce un numero del 0 al 255: \n");
		int R = 0;
		try {
			 R = t1.leerNumeroEntero();}
		catch(Exception e) {
			System.out.println("Error");
		}
		texto1.cls();
		
		texto1.print(0,0,"Introduce otro numero del 0 al 255: \n");
		int G = 0;
		try {
			 G = t1.leerNumeroEntero();}
		catch(Exception e) {
			System.out.println("Error");
		}
		texto1.cls();
		
		texto1.print(0,0,"Introduce otro numero del 0 al 255: \n");
		int B=0;;
		try {
			B = t1.leerNumeroEntero();}
		catch(Exception e) {
			System.out.println("Error");
		}
		texto1.cls();
		
		if(R>=0 && R <= 255 && G>=0 && G <= 255 && B>=0 && B <= 255) {
			FondoColorSolido f = new FondoColorSolido(R,G,B);
			CapaFondo fondo = c1.getCapaFondo();
			fondo.setFondo(f);
		
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				System.out.println("Error");
			}
		}
			
	}

}
