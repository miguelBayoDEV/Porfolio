import bpc.daw.mario.*;
public class Actividad3Tema3 {
	public static void main(String[] args) {
		
		Mario m=new Mario(200,400);
		Luigi l=new Luigi(325,325);
	
		Seta s=new Seta(500,500);
		
		Planta p1=new Planta(400,400);
		Planta p2=new Planta(400,450);
		Planta p3=new Planta(400,500);
		
		Cañon c=new Cañon(600,600);
		
		
		s.andarHacia(0, 0);
		m.saltar();
		c.disparar(325, 325);
		p1.comer(true);
		p2.comer(true);
		p3.comer(true);
		
	}
}
