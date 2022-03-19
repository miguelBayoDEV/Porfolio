import java.lang.*;
import bpc.daw.reproductor.*;
import java.util.Scanner;
public class Ejercicio31 {

	public static void main(String[] args) {
		// Crear programa que reproduzca de forma asíncrona un archivo mp3 y mostrar sus datos.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca ruta archivo mp3 deseado: ");
		String ruta = s.nextLine();
		ArchivoMP3 mp3 = new ArchivoMP3(ruta);
		Reproductor r = new Reproductor(mp3, false, false);
		r.play();
		String título = mp3.getTitulo();
		String autor = mp3.getAutor();
		long duración = mp3.getDuracion();
		// Falla cuando se reproduce en que no vuelve a repetirse: r.siguienteCancion();
		System.out.print(" Título: "+título+"\n Autor: "+autor+"\n Duración: "+duración+" mseg");
	}

}
