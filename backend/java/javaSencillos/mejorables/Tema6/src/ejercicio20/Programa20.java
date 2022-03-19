/* Usa los m�todos adecuados de la clase File para realizar un programa que pregunte al usuario la ruta de una carpeta
 *  del ordenador y haga esto: */
package ejercicio20;
import java.io.File;
import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escribe la ruta de una carpeta.");
		String ruta = scanner.nextLine();
		
		/* Si la ruta introducida no es una carpeta, el programa mostrar� en pantalla �Debe introducir la ruta de una 
		 * carpeta� y terminar�. 
		 */
		
		File carpeta = new File (ruta);
		
		if (carpeta.isDirectory()==true) {
			
			/* Si la ruta es una carpeta, el programa mostrar� por pantalla un listado de todos los archivos que hay
			 *  en dicha carpeta, indicando su tama�o en bytes. No se deber�n mostrar las subcarpetas. 
			 */
			
			File[] listaArchivos = carpeta.listFiles();
			
			for (int i=0; i<listaArchivos.length;i++) {
				
				
				long tama�o = listaArchivos[i].length();
				System.out.println(listaArchivos[i]+" - "+tama�o);
				
			}
			
		} else {
			
			System.out.println("Debe introducir la ruta de una carpeta.");
			
		}
		
	}
}
