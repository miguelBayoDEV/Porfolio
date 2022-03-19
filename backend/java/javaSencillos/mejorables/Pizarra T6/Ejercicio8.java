import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.lang.*;
import java.util.*;
import bpc.daw.consola.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Crear dos listas.
			List<Rectangle> r = new ArrayList<>();
			List<Color> color = new ArrayList<>();
				
		//Métodos de consola.
		Consola c = new Consola();
		CapaCanvas cc = c.getCapaCanvas();
		
		
		//Scanner s = new Scanner(System.in);
		//int N = s.nextInt();
		int N = 6;
		int x = 0;
		int y = 0;
		Random ran = new Random();
		for(int i=0;i<N;i++) {
			Rectangle rect = new Rectangle(x,y,275,550);
			r.add(rect);
			color.add(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			x+=100;
		}
		
		Graphics g = cc.getGraphics();
		x = 50;
		y = 50;
		
		for(int i=0;i<r.size();i++) {
			g.setColor(color.get(i));
			g.fillRect(x, y, 175, 550);
			x+=100;
		}
		g.dispose();
		Teclado t = c.getTeclado();
		t.leerCadenaCaracteres();
		
	}

}
