package MayorEdad_Ejer11;

public class MayorEdad {

	private final static int MAYOREDAD = 18;

	public static void mayorDeEdad(int edad) {
		
		if(edad >= MAYOREDAD) {
			System.out.println("Es mayor de edad: " + edad + " años.");
		}else {
			System.out.println("No es mayor de edad: " + edad + " años.");
		}
		
	}
	
}
