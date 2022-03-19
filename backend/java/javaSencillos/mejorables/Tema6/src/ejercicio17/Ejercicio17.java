package ejercicio17;
import java.awt.Graphics;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

public class Ejercicio17 {

	public static void main(String[] args) {
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		int[] x = {250,298,446,297,250,203,53,202};
		int[] y = {46,180,224,268,400,268,224,180};
		
		g.drawPolygon(x, y, x.length);
		
		
		t.leerCaracter();

	}

}
/*
: Usa la Consola DAW para realizar un programa que dibuje en pantalla el polígono
de la imagen. Sugerencia: Usa el método drawPolygon de la clase Graphics:
*/