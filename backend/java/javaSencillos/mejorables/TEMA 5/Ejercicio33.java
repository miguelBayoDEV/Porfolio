package Ejer33;
import java.awt.event.KeyEvent;

import bpc.daw.consola.*;
public class Ejercicio33 {

	public static void main(String[] args) {
		//Declaración de variables
		int movimientos = 80;
		int nivel = 1;
		int puntos = 0;
		String temperatura = "";
		final int COORDINICIALY = 40;
		final int COORDINICIALX = 15;
		final String JUGADOR = "O";
		final String TESORO = "$";
		final int INCREMENTO = 10;
		int xT = (int)(1+30*Math.random()); 
		int yT = (int)(1+90*Math.random()); 
		int xJ = COORDINICIALX;
		int yJ = COORDINICIALY;
		boolean nivelPasado = false;
		
		//Creación Consola
		Consola c = new Consola("Juego del Tesoro", 1920, 1024);
		CapaTexto text = c.getCapaTexto();
		Teclado kb = c.getTeclado();	
		kb.setTipoCursor(Teclado.CURSOR_NULO);
	
		for(int i=movimientos;i>0;i--) {
			//pintar la barra y el jugador
			text.situarCursor(1, 1);
			text.print("Nivel: " + nivel);
			text.situarCursor(1, 15);
			text.print("Puntos: " + puntos);
			text.situarCursor(1, 30);
			text.print("Mov. Restantdes: " + i);			
			text.situarCursor(1, 65);
			text.print("" + temperatura);
			text.print(xJ, yJ, JUGADOR);
			text.print(xT, yT, TESORO);

			kb.leerCaracter();
			
			//leer movimientos
			if(kb.teclaPulsada(KeyEvent.VK_W)) {
				xJ--;
			}
			if(kb.teclaPulsada(KeyEvent.VK_S)) {
				xJ++;
			}
			if(kb.teclaPulsada(KeyEvent.VK_A)) {
				yJ--;
			}
			if(kb.teclaPulsada(KeyEvent.VK_D)) {
				yJ++;
			}
					
			text.cls();
			
			//calcula distancia
			double d = Math.sqrt((Math.pow((xJ-xT), 2)+Math.pow((yJ-yT), 2)));
			if(d>=35) {
				temperatura="Muy Frio";
			}else if (d<35&&d>=15) {
				temperatura="Frio";
			}else if(d<15&&d>=5) {
				temperatura="Caliente";
			}else {
				temperatura="Quemando";
			}
			
			//comprueba si el jugador y el tesoro están en la misma posicion
			if(xJ==xT&&yJ==yT) {
				text.cls();
				text.print(15,40,"Has encontrado el tesoro");
				nivelPasado = true;
			}
			
			if(nivelPasado) {
				nivel ++;
				puntos += i;
				i += INCREMENTO;
				xT = (int)(1+30*Math.random()); 
				yT = (int)(1+90*Math.random()); 
				nivelPasado=false;
			}
		}
	}
}
