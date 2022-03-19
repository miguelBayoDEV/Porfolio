import java.awt.Color;
import java.awt.Graphics;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;
import bpc.daw.consola.Teclado;

public class EjercicioA5 {

	public static void main(String[] args) {
		Consola c = new Consola();
		CapaFondo cf = c.getCapaFondo();
		CapaCanvas cv = c.getCapaCanvas();
		FondoColorSolido fcs = new FondoColorSolido(0, 0, 255);
		cf.setFondo(fcs);
		Graphics g =cv.getGraphics();
		Graphics g1 =cv.getGraphics();
		g.setColor(Color.GREEN);
		g.fillRect(0, 640, 12000, 480);
		g1.setColor(Color.YELLOW);
		g1.fillOval(120, 90, 60, 60);
		Teclado tecla = c.getTeclado();
	    tecla.setVisible(false);
	    tecla.leerCaracter();
		
	}

}
/*
Realiza un programa que dibuje en la pantalla la siguiente imagen:
*/