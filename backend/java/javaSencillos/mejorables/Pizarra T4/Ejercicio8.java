import java.lang.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		int total = args.length;
		if(total==0) {
			System.out.println("No se han pasado argumentos.");
		}else {
			System.out.println("Se han pasado "+total+" argumentos.");
		}
	}

}
