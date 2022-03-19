package Ejercicio21Tema5;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga una palabra");
		String respuesta = sc.nextLine();
		int n = args.length;
		boolean igual = false;
		for(int i=0;i<n;i++){		
			if(respuesta.equals(args[i])){
				System.out.println("La palabra coincide con el argumento "+i);
				igual = true;
			}
		}
		if(igual==false){
			System.out.println("La palabra no coincide con ningún argumento.");
		}

	}

}
