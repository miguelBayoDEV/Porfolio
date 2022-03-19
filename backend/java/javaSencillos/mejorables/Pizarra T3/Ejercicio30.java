import java.lang.*;
import bpc.daw.musica.*;
public class Ejercicio30 {

	public static void main(String[] args) {
		// Crear partitura en un piano y luego en una guitarra.
		// Primero creo los objetos.
		Piano p = new Piano();
		Guitarra g = new Guitarra();
		Cancion piano = new Cancion("Canción de piano.");
		Cancion guitarra = new Cancion("Canción de guitarra.");
		NotaMusical n1 = new NotaMusical(0,2);
		NotaMusical n2 = new NotaMusical(0,2);
		NotaMusical n3 = new NotaMusical(4,2);
		NotaMusical n4 = new NotaMusical(4,2);
		NotaMusical n5 = new NotaMusical(5,2);
		NotaMusical n6 = new NotaMusical(5,2);
		NotaMusical n7 = new NotaMusical(4,1);
		NotaMusical n8 = new NotaMusical(3,3);
		NotaMusical n9 = new NotaMusical(3,3);
		NotaMusical n10 = new NotaMusical(2,3);
		NotaMusical n11 = new NotaMusical(2,3);
		NotaMusical n12 = new NotaMusical(1,4);
		NotaMusical n13 = new NotaMusical(2,4);
		NotaMusical n14 = new NotaMusical(3,4);
		NotaMusical n15 = new NotaMusical(1,4);
		NotaMusical n16 = new NotaMusical(0,2);
		// Añadir notas a las canciones.
		piano.añadir(n1);
		piano.añadir(n2);
		piano.añadir(n3);
		piano.añadir(n4);
		piano.añadir(n5);
		piano.añadir(n6);
		piano.añadir(n7);
		piano.añadir(n8);
		piano.añadir(n9);
		piano.añadir(n10);
		piano.añadir(n11);
		piano.añadir(n12);
		piano.añadir(n13);
		piano.añadir(n14);
		piano.añadir(n15);
		piano.añadir(n16);
		guitarra.añadir(n1);
		guitarra.añadir(n2);
		guitarra.añadir(n3);
		guitarra.añadir(n4);
		guitarra.añadir(n5);
		guitarra.añadir(n6);
		guitarra.añadir(n7);
		guitarra.añadir(n8);
		guitarra.añadir(n9);
		guitarra.añadir(n10);
		guitarra.añadir(n11);
		guitarra.añadir(n12);
		guitarra.añadir(n13);
		guitarra.añadir(n14);
		guitarra.añadir(n15);
		guitarra.añadir(n16);
		// Reproducir canciones.
		boolean reproducir_piano = p.reproducir(piano);
		boolean reproducir_guitarra = g.reproducir(guitarra);
	}

}
