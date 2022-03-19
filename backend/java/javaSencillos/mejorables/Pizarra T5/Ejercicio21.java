import java.lang.*;
import java.util.*;
public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = args.length;
		boolean repetir = true;
		for(int i=0;i<t&&repetir;i++) { //Para que sea infinito se usa for(;;)
			System.out.println("Introduzca una palabra: ");
			String p = s.nextLine();
			for(int j=0;j<t;j++) {
				if(p.equals(args[j])) {
					System.out.println("Coincide: "+args[j]);
					repetir = false;
				}else {
					System.out.println("No coincide con ninguna palabra.");
					repetir = false;
				}
			}
		}
	}

}
