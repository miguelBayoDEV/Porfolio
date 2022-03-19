import java.lang.*;
import bpc.daw.reproductor.*;
public class Ejercicio34 {

	public static void main(String[] args) {
		// Apartado a:
		// Crear dos archivosMP3.
		ArchivoMP3 a1 = new ArchivoMP3("Kalimba.mp3");
		ArchivoMP3 a2 = new ArchivoMP3("Kalimba.mp3");
		// Comparaciones de los archivos.
		boolean c1 = a1 == a2;
		System.out.println("Comparación con ==,¿coinicde? : "+c1);
		boolean c2 = a1.equals(a2);
		System.out.println("Comparación con método equals,¿coinicde? : "+c2);
		int h1 = a1.hashCode();
		int h2 = a2.hashCode();
		boolean c3 = h1 == h2;
		System.out.println("Comparación de los códigos hashCode mediante ==,¿coinicde? : "+c3);
		
		// Apartado b:
		// Crear un objeto reproductor.
		Reproductor r = new Reproductor(a1, true, true);
		String r1 = r.toString();
		System.out.println("¿Qué ocurre al monstrar método toString del objeto reproductor? "+r1);
		
		// Apartado c:
		// Crear un archivoMP3.
		ArchivoMP3 a3 = new ArchivoMP3("Kalimba.mp3");
		String a4 = a3.toString();
		System.out.println("¿Qué ocurre al monstrar método toString del objeto archivoMP3? "+a4);
		// No es la misma estructura que el anteriar debido a que muestra el nombre del archivo del objeto "Kalimba" sin la extensión.
	}

}
