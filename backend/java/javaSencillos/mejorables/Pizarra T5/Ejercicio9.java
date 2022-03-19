import java.lang.*;
import java.io.*;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca ruta del archivo.txt: ");
		String ruta = s.nextLine();
		try {
			FileInputStream f = new FileInputStream(ruta);
			InputStreamReader lector = new InputStreamReader(f);
			BufferedReader leer = new BufferedReader(lector);
			boolean repetir = true;
			while(repetir) {
				String línea = leer.readLine();
				if(línea==null) {
					repetir = false;
					f.close();
					lector.close();
					leer.close();
				}else {
					System.out.println(línea);
				}
			}
		}catch(FileNotFoundException error) {
			System.out.println("Error al cargar ruta del archivo.txt.");
		}catch(IOException error) {
			System.out.println("Error al cerrar.");
		}
		
		
	}

}
