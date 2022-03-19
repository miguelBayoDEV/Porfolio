package daw.ejer6;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		System.out.println(p1);
		
		Punto p2 = new Punto(70, 170);
		System.out.println(p2);
		
		Punto p3 = new Punto(new Punto(70,70));
		System.out.println(p3);
		
		Punto p4 = new Punto(30.00, 70.00);
		System.out.println(p4);
	}

}
