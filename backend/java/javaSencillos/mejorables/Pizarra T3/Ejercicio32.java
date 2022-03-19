import java.lang.*;
import bpc.daw.reproductor.*;
import java.util.Scanner;
import java.io.*;
public class Ejercicio32 {

	public static void main(String[] args) {
		// Crear lista de reproducci�n y a�adirle 3 canciones, guardar la lista y reproducir las canciones.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca 3 rutas de archivos mp3: ");
		String r1 = s.nextLine();
		String r2 = s.nextLine();
		String r3 = s.nextLine();
		ArchivoMP3 a1 = new ArchivoMP3(r1);
		ArchivoMP3 a2 = new ArchivoMP3(r2);
		ArchivoMP3 a3 = new ArchivoMP3(r3);
		try {
			PlayList lista = new PlayList();
			lista.setTitulo("Lista de Ejemplo.");
			System.out.println("Nombre de la lista de reproducci�n: "+lista.getTitulo());
			lista.a�adir(a1);
			lista.a�adir(a2);
			lista.a�adir(a3);
			// Tambi�n se puede usar: lista.a�adirVarias(a1, a2, a3);
			lista.guardar("d:/lista.txt");
			Reproductor r = new Reproductor(lista, false, true);
			r.play();
			r.siguienteCancion();
		}catch(IOException error) {
			System.out.println("No se puede crear/guardar lista de reproducci�n.");
		}
	}

}
