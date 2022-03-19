package daw.punto;
import java.util.*;
import java.awt.Toolkit;

public class Punto {

	private int x;
	private int y;
	
	public Punto(int x, int y) {

		this.x=(x>Toolkit.getDefaultToolkit().getScreenSize().width || x<0)?Toolkit.getDefaultToolkit().getScreenSize().width:x;
		this.y=(y>Toolkit.getDefaultToolkit().getScreenSize().height|| y<0)?Toolkit.getDefaultToolkit().getScreenSize().height:y;
		
	}
	
	public Punto() {
		this(0, 0);
	}
	
	public Punto(Punto p) {
		this(p.x/2, p.y/2);
	}
	
	public Punto(double angulo, double distancia) {
		this((int) (Math.cos(angulo)*distancia),(int) (Math.sin(angulo)*distancia));
	}
	
	
	
}
