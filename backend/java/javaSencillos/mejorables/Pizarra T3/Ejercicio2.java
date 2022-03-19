import bpc.daw.mario.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Muestra dos muñecos en sus respectivas posiciones: uno a 100px del origen y otro (640,320).
		Mario m = null;
		m = new Mario(100,100);
		Mario m2 = new Mario(640,320);
		//Muestra una seta en el origen.
		Seta s = new Seta(0,0);
		//Mostrar cañón (100,320).
		Cañon c = new Cañon(100,320);
		//Tres plantas en: (400,500),(450,500),(500,500).
		Planta p1 = new Planta(400,500);
		Planta p2 = new Planta(p1,0);
		Planta p3 = new Planta(p2,0);
		int r1x = p1.getX();
		System.out.println("x de p1 = "+r1x);
		int r2x = p2.getX();
		System.out.println("x de p2 = "+r2x);
		int r3x = p3.getX();
		System.out.println("x de p3 = "+r3x);
		int r1y = p1.getY();
		System.out.println("y de p1 = "+r1y);
		int r2y = p2.getY();
		System.out.println("y de p2 = "+r2y);
		int r3y = p3.getY();
		System.out.println("y de p3 = "+r3y);
		// Muestra un muñeco de Luigi (200,200) del origen y luego uno de Mario (250,200).
		Luigi l = new Luigi(200,200);
		Mario m3 = new Mario(l,50);
		int rx = m3.getX();
		System.out.println("x de Mario = "+rx);
		int ry = m3.getY();
		System.out.println("y de Mario = "+ry);
	}

}
