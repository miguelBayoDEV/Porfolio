package daw.persona;

import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		DNI dni = new DNI("12345678j");
		System.out.println(dni.toString());
		
		DNI d = new DNI(12345678,'j');
		System.out.println(d.toString());
	}

}
