import java.awt.Graphics;
import java.util.*;
import bpc.daw.consola.*;
public class Ejercicio17 {

	public static void main(String[] args) {
		
		//Datos.
		int n = 8;
		int[] x = {250,297,446,297,250,203,53,202};
		int[] y = {46,180,224,268,400,268,224,180};
		
		//Crear consola y sus elementos.
		Consola c = new Consola();
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		g.drawPolygon(x, y, n);
		Teclado t = c.getTeclado();
		t.leerCadenaCaracteres();
	}

}
