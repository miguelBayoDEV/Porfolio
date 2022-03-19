import java.lang.*;
import bpc.daw.reproductor.*;
import java.util.Scanner;
import java.io.*;
public class Ejercicio33 {

	public static void main(String[] args) {
		// Cargar lista de reproducción guardada y reproducirlo de forma síncrona.
		Scanner s = new Scanner(System.in);
		System.out.println("Ruta del archivo mp3 a reproducir (ponerle la extensión.txt): ");
		String ruta = s.nextLine();
		try {
			PlayList lista1 = new PlayList(ruta);
			lista1.setTitulo("Reproducción sincrónica.");
			System.out.println("Nombre de la lista de reproducción: "+lista1.getTitulo());
			Reproductor r = new Reproductor(lista1, true, true);
			r.play();
		}catch(IOException error) {
			System.out.println("Error al cargar archivo.");
		}
	}

}
