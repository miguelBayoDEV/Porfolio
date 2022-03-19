package Ejercicio15;
import java.io.*;
import java.util.*;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce una ruta");
		String ruta = s.nextLine();
		File arch = new File(ruta);
		boolean dir = arch.isDirectory();
		boolean exist = arch.exists();
		
		if(exist) {
			if(dir) {
				System.out.println("La ruta introducida corresponde a un directorio");
			}else{
				long ocupa = arch.length();
				System.out.println("La ruta introducida es un archivo de tamaño " + ocupa + " bytes");
				System.out.println("¿Desea borrarlo (si/no)?");
				String borra = s.nextLine();
				if(borra.equalsIgnoreCase("si")) {
					boolean seBorra = arch.delete();
					if(seBorra) {
						System.out.println("El archivo se a borrado correctamente");
					}else {
						System.out.println("No se a podido borrar el archivo");
					}
				}else {
					System.out.println("Borrado cancelado");
				}
			}
		}
	}

}
