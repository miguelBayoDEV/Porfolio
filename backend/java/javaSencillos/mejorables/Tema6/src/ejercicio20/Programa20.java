/* Usa los métodos adecuados de la clase File para realizar un programa que pregunte al usuario la ruta de una carpeta
 *  del ordenador y haga esto: */
package ejercicio20;
import java.io.File;
import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escribe la ruta de una carpeta.");
		String ruta = scanner.nextLine();
		
		/* Si la ruta introducida no es una carpeta, el programa mostrará en pantalla “Debe introducir la ruta de una 
		 * carpeta” y terminará. 
		 */
		
		File carpeta = new File (ruta);
		
		if (carpeta.isDirectory()==true) {
			
			/* Si la ruta es una carpeta, el programa mostrará por pantalla un listado de todos los archivos que hay
			 *  en dicha carpeta, indicando su tamaño en bytes. No se deberán mostrar las subcarpetas. 
			 */
			
			File[] listaArchivos = carpeta.listFiles();
			
			for (int i=0; i<listaArchivos.length;i++) {
				
				
				long tamaño = listaArchivos[i].length();
				System.out.println(listaArchivos[i]+" - "+tamaño);
				
			}
			
		} else {
			
			System.out.println("Debe introducir la ruta de una carpeta.");
			
		}
		
	}
}
