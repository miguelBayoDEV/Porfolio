import java.lang.*;
import bpc.daw.musica.*;
public class Ejercicio30 {

	public static void main(String[] args) {
		// Crear partitura en un piano y luego en una guitarra.
		// Primero creo los objetos.
		Piano p = new Piano();
		Guitarra g = new Guitarra();
		Cancion piano = new Cancion("Canci�n de piano.");
		Cancion guitarra = new Cancion("Canci�n de guitarra.");
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
		// A�adir notas a las canciones.
		piano.a�adir(n1);
		piano.a�adir(n2);
		piano.a�adir(n3);
		piano.a�adir(n4);
		piano.a�adir(n5);
		piano.a�adir(n6);
		piano.a�adir(n7);
		piano.a�adir(n8);
		piano.a�adir(n9);
		piano.a�adir(n10);
		piano.a�adir(n11);
		piano.a�adir(n12);
		piano.a�adir(n13);
		piano.a�adir(n14);
		piano.a�adir(n15);
		piano.a�adir(n16);
		guitarra.a�adir(n1);
		guitarra.a�adir(n2);
		guitarra.a�adir(n3);
		guitarra.a�adir(n4);
		guitarra.a�adir(n5);
		guitarra.a�adir(n6);
		guitarra.a�adir(n7);
		guitarra.a�adir(n8);
		guitarra.a�adir(n9);
		guitarra.a�adir(n10);
		guitarra.a�adir(n11);
		guitarra.a�adir(n12);
		guitarra.a�adir(n13);
		guitarra.a�adir(n14);
		guitarra.a�adir(n15);
		guitarra.a�adir(n16);
		// Reproducir canciones.
		boolean reproducir_piano = p.reproducir(piano);
		boolean reproducir_guitarra = g.reproducir(guitarra);
	}

}
