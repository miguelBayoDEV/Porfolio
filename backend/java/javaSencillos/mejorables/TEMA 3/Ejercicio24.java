import java.util.Scanner;
import java.io.*;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
				
		System.out.println("Escribe dos frases:");
		String frase1 = s.nextLine();
		String frase2 = s.nextLine();
		
		try {
			PrintWriter archivo = new PrintWriter("d:/frases.txt");
			archivo.print(frase1);
			archivo.print(frase2);
			archivo.close();
		}catch(FileNotFoundException error) {
			System.out.println("La carpeta no existe");
		}
		
	}

}
