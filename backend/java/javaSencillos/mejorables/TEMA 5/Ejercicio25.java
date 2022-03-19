import java.lang.*;
import java.util.*;
public class Ejercicio25 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int seg = 0;
		try {
			seg = s.nextInt();
		}catch(NumberFormatException error) {
			System.out.println("Número introducido incorrecto.");
		}
	}

}
