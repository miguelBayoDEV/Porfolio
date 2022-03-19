import java.lang.*;
import java.util.*;
public class Ejercicio30 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca tu DNI: ");
		String dni = s.nextLine();
		int c = ' ';
		boolean repetir = true;
		for(int i=0;i<(dni.length()-1);i++) {
			c = dni.charAt(i);
			for(int j=0;repetir&&j<11;j++) {
				if(j==c) {
					repetir = false;
				}else {
					System.out.println("NIF incorrecto.");
				}
			}
		}
		boolean repetir1 = true;
		while(repetir1) {
			if(dni.length()==9) {
				int nu = Integer.parseInt(dni.substring(0, 7));
				nu%=23;
				String letra = "TRWAGMYFPDXBNJZSQVHLCKET";
				if(Integer.toString(dni.charAt(8)).equals(Integer.toString(letra.charAt(nu)))) {
					System.out.println("NIF correcto.");
				}else {
					System.out.println("NIF incorrecto.");
				}
			}
		}
			
		
	}

}
