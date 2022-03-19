package ej25tema3;
import java.util.*;
import java.io.*;
public class ej25tema3 {

	public static void main(String[] args) {
		try {
			File ruta=new File("C:/texto/texto.txt");
			Scanner leer=new Scanner(ruta);
			String fin=leer.nextLine();
			String fin2 = leer.nextLine();
			System.out.print("El texto es: "+fin);
			System.out.print("El texto es: "+fin2);
			leer.close();
		}catch(FileNotFoundException error){
			System.out.print("No se ha podido leer el archivo");
		}
			
		

	}

}
