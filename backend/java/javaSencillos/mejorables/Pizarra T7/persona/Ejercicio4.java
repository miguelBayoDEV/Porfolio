package daw.persona;

import java.time.LocalDate;

public class Ejercicio4 {

	public static void main(String[] args) {

		Persona p1 = new Persona("Miguel", new DNI("12345678j"), 1700, LocalDate.of(1997, 7, 7));
		System.out.println(p1);
		
		Persona p2 = new Persona("Miguel", 12345678, 'j', 1700, LocalDate.of(1997, 7, 7));
		System.out.println(p2);
		
		Persona p3 = new Persona("Miguel", new DNI("12345678j"));
		System.out.println(p3);
		
		Persona p4 = new Persona("Miguel", 12345678, 'j');
		System.out.println(p4);
	}

}
