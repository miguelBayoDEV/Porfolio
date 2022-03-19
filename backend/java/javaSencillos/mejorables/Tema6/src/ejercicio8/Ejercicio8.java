package ejercicio8;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

public class Ejercicio8 {

	public static void main(String[] args) {
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaTexto ct = c.getCapaTexto();
		CapaCanvas cv = c.getCapaCanvas();
		Graphics g = cv.getGraphics();
		ArrayList<Rectangle> lista1 = new ArrayList<>();
		ArrayList<Rectangle> lista2 = new ArrayList<>();
		List<Color> lista3 = Arrays.asList(Color.RED,Color.GREEN,Color.blue,Color.yellow,Color.ORANGE,Color.MAGENTA);
		int x = 40;
		int y = 40;
		int a = 0;
		for(int i = 0;i<6;i++) {
			
			lista1.add(new Rectangle(x,y,110,600));
			x+=160;
		}
		
		for(int i = 0;i<lista3.size();i++) {
			Color co = lista3.get(i);
			g.setColor(co);
			Rectangle r = lista1.get(i);
			g.fillRect((int) r.getX(),(int) r.getY(),(int) r.getWidth(), (int)r.getHeight());
			a++;
		}
		
		t.leerCaracter();
		if(t.hayTeclaPulsada()) {
			a=0;

			for(Rectangle r: lista1) {
				if(a==0) {
					g.setColor(Color.GREEN);
				}else if(a==1) {
					g.setColor(Color.RED);
				}else if(a==2) {
					g.setColor(Color.YELLOW);
				}else if(a==3) {
					g.setColor(Color.BLUE);
				}else if(a==4) {
					g.setColor(Color.MAGENTA);
				}else if(a==5) {
					g.setColor(Color.ORANGE);
				}
				g.fillRect((int) r.getX(),(int) r.getY(),(int) r.getWidth(), (int)r.getHeight());
				a++;
			
			
			}
			
		}
		
		t.leerCaracter();
		
/*
		g.setColor(Color.RED);
		g.fillRect(40, 40, 100, 600);
		g.setColor(Color.GREEN);
		g.fillRect(180,40, 100, 600);
		g.setColor(Color.BLUE);
		g.fillRect(320, 40, 100, 600);
		g.setColor(Color.YELLOW);
		g.fillRect(460, 40, 100, 600);
		g.setColor(Color.ORANGE);
		g.fillRect(600, 40, 100, 600);
		g.setColor(Color.MAGENTA);
		g.fillRect(740, 40, 100, 600);
		t.leerCaracter();
		if(t.hayTeclaPulsada()) {
			g.setColor(Color.GREEN);
			g.fillRect(40, 40, 100, 600);
			g.setColor(Color.RED);
			g.fillRect(180,40, 100, 600);
			g.setColor(Color.YELLOW);
			g.fillRect(320, 40, 100, 600);
			g.setColor(Color.BLUE);
			g.fillRect(460, 40, 100, 600);
			g.setColor(Color.MAGENTA);
			g.fillRect(600, 40, 100, 600);
			g.setColor(Color.ORANGE);
			g.fillRect(740, 40, 100, 600);
			
		}
		t.leerCaracter();
	*/
	}

}
/*
Usa la Consola DAW para hacer un programa que muestre en pantalla 6
rectángulos de colores. Al pulsar una tecla, los rectángulos se intercambiarán de dos en dos.
*/