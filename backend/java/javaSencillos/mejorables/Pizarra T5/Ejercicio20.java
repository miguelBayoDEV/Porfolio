import java.lang.*;
public class Ejercicio20 {

	public static void main(String[] args) {

		int t = args.length;
		int sum = 0;
		int n = 0;
		for(int i=0;i<t;i++) {
			try {
				n = Integer.parseInt(args[i]);
				sum += n;
				System.out.println("Suma del número "+args[i]+" es: "+sum);
			}catch(NumberFormatException error) {
				//System.out.println("No es un número."+args[i]);
			}
		}
	}

}
