import java.util.Scanner;
import java.lang.*;
public class Ejercicio17 {

	public static void main(String[] args) {
			
		Scanner s = new Scanner (System.in);
		
		System.out.println("Introduce la contraseña");
		
		String clave ="Hlanz";
		String comprobacion = s.nextLine();
		
		boolean correcto = clave.equals(comprobacion);
		
		System.out.println("Es correcta la contraseña? "+correcto);
		

	}

}
