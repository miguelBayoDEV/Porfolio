import java.awt.Graphics;
import java.util.*;
import bpc.daw.consola.*;
public class Ejercicio22 {

	public static void main(String[] args) {
		
		//Datos de consola.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		CapaTexto ct = c.getCapaTexto();
		
		//Preguntar el nº de vértices.
		ct.print("Introduzca número de vértices del polígono: ");
		int n_vertices = 0;
		
		try {
			n_vertices = t.leerNumeroEntero();
			ct.cls();
			//Arrays.
			int[] x = new int[n_vertices];
			int[] y = new int[n_vertices];
			
			//Preguntar las coordenadas de los vértices.
			for(int i=0;i<n_vertices;i++) {
				ct.print("Coordenada X: ");
				x[i] = t.leerNumeroEntero();
				ct.print("Coordenada Y: ");
				y[i] = t.leerNumeroEntero();
				ct.cls();
			}
			
			//Dibujar el polígono.
			g.drawPolygon(x, y, n_vertices);
			t.setTipoCursor(Teclado.CURSOR_NULO);
			t.leerCaracter();
		}catch(Exception error) {
			ct.print("Número incorrecto.");
		}
		
			
	}

}
