import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca ruta del archivo: ");
		String ruta = s.nextLine();
		File f = new File(ruta);
		boolean directorio = f.isDirectory();
		boolean archivo = f.isFile();
		boolean existe = f.exists();
		long tamaño = f.length();
		if(directorio&&existe) {
			System.out.println("La ruta introducida corresponde a un directorio.");
		}else if(archivo&&existe) {
			System.out.println("La ruta introducida es un archivo de tamaño "+tamaño+" bytes. ¿Deseas borrarlo (si/no)?");
			String respuesta = s.nextLine();
			if(respuesta.equalsIgnoreCase("si")) {
				boolean borrar = f.delete();
				if(borrar) {
					System.out.println("Se ha borrado correctamente.");
				}else {
					System.out.println("Se ha producido un error al borrar.");
				}
			}else if(respuesta.equalsIgnoreCase("no")) {
				System.out.println("Borrado cancelado.");
			}else {
				System.out.println("No existe el archivo.");
		}
	}

}
