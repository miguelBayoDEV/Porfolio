package daw.ejer6;

import java.awt.Toolkit;
import java.util.*;

public class Punto {
	
	//Propiedades de la clase.
	private int x;
	private int y;
	
	//Constructores.
	public Punto() {
		this(0,0);
	}
	
	public Punto(int x, int y) {
		this.x=(x>=0&&x<Toolkit.getDefaultToolkit().getScreenSize().getWidth())?x:0;
		this.y=(y>=0&&x<Toolkit.getDefaultToolkit().getScreenSize().getHeight())?x:(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	}
	
	public Punto(Punto p) {
		this(p.x/2,p.y/2);
	}
	
	public Punto(double angulo, double distancia) {
		this((int) (Math.cos(angulo)*distancia), (int) (Math.sin(angulo)*distancia));
	}
}
