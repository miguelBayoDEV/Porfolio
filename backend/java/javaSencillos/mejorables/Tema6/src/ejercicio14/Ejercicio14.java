package ejercicio14;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import bpc.daw.consola.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		//Elementos de la consola.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaTexto ct = c.getCapaTexto();
		CapaCanvas cc = c.getCapaCanvas();
		Graphics g = cc.getGraphics();
		
		//Crear listas.
		Set<Rectangle> rectangulos = new HashSet<>();
		//Set<Rectangle> lista = new LinkedHashSet<>();
		//Set<Rectangle> lista = new TreeSet<>();
		
		//Guardar en la lista diez rectángulo de coordenadas aleatorias y rojos.
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		double w = d.getWidth()-100;
		double h = d.getHeight()-100;
		Random ra = new Random();
		g.setColor(Color.RED);
		for(int i=0;i<10;i++) {
			Rectangle r = new Rectangle(ra.nextInt((int) w),ra.nextInt((int) h),ra.nextInt(100),ra.nextInt(100));
			rectangulos.add(r);			
			g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
		}
		//Preguntar coordenadas del rectángulo blanco.
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;
		try {
			x = t.leerNumeroEntero();
			y = t.leerNumeroEntero();
			width = t.leerNumeroEntero();
			height = t.leerNumeroEntero();
		}catch(Exception error) {
			ct.print("Número entero incorrecto.");
		}
		
		//Crearlo.
		Rectangle r = new Rectangle(x,y,width,height);
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		
		g.dispose();
		t.leerCaracter();
		
		int choque = 0;
		Iterator<Rectangle> re = rectangulos.iterator();
		
		boolean repetir = true;
		while(repetir) {
			if(re.hasNext()) {
				Rectangle rect = r.intersection(re.next());
				if(r.intersects(rect)) {
					choque++;
				}
			}else {
				repetir = false;
			}
		}
		
		ct.print("Cantidad de rectángulos rojos que se solapan con el blanco son: "+choque);
		t.leerCaracter();
	}

}
