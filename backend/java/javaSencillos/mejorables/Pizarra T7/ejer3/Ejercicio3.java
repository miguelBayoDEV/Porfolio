package daw.ejer3;

import java.time.LocalDate;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		MarcadorBaloncesto m1 = new MarcadorBaloncesto("Bulls", "Lakers");
		System.out.println(m1);
		
		MarcadorBaloncesto m2 = new MarcadorBaloncesto("Bulls", "Lakers",LocalDate.of(2020, 1, 15));
		System.out.println(m2);
	}

}
