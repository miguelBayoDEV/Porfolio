package Ejercicios_adicionales;
import java.lang.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		//Dibujar la siguiente imagen.
		Consola c = new Consola("Dibujo",640,480);
		CapaTexto ct = c.getCapaTexto();
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		g.setColor(Color.BLUE);
		g.fillRect(0,0,640,400);
		g.setColor(Color.GREEN);
		g.fillRect(0, 400, 640, 80);
		g.setColor(Color.YELLOW);
		g.fillOval(120, 90, 20, 20);
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException error) {
			ct.println("Interrupción.");
		}
	}

}
