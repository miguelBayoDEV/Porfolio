import java.lang.*;
import bpc.daw.reproductor.*;
import java.util.Scanner;
import java.io.*;
public class Ejercicio33 {

	public static void main(String[] args) {
		// Cargar lista de reproducci�n guardada y reproducirlo de forma s�ncrona.
		Scanner s = new Scanner(System.in);
		System.out.println("Ruta del archivo mp3 a reproducir (ponerle la extensi�n.txt): ");
		String ruta = s.nextLine();
		try {
			PlayList lista1 = new PlayList(ruta);
			lista1.setTitulo("Reproducci�n sincr�nica.");
			System.out.println("Nombre de la lista de reproducci�n: "+lista1.getTitulo());
			Reproductor r = new Reproductor(lista1, true, true);
			r.play();
		}catch(IOException error) {
			System.out.println("Error al cargar archivo.");
		}
	}

}
