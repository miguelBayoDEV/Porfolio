import bpc.daw.mario.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		Mario m = new Mario(370,470);
		Luigi l = new Luigi(500,300);
		Seta s = new Seta (200,200);
		Planta p1 = new Planta(300,600);
		Planta p2 = new Planta(p1,400);
		Planta p3 = new Planta(600,100);
		Cañon c = new Cañon(600,400);
		// Seta anda hacia el origen.
		s.andarHacia(0,0);
		// Mario dará un salto.
		m.saltar();
		// Cañón disparará a Luigi.
		c.disparar(500,300);
		// Disparo d = new Disparo(600,400,500,300); Dispara dos veces.
		// Plantas deben comer.
		p1.comer(true);
		p2.comer(true);
		p3.comer(true);
	}

}
