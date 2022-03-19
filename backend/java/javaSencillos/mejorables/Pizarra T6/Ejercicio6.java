import java.lang.*;
import java.util.*;
import bpc.daw.reproductor.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		
		List<ArchivoMP3> canciones = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		Reproductor r = null;
		for(int i=0;i<10;i++) {
			System.out.println("Introduzca una ruta de una canción: ");
			String ruta = s.nextLine();
			ArchivoMP3 mp3 = new ArchivoMP3(ruta);
			canciones.add(mp3);
		}
		boolean repetir=false;
		while(repetir) {
			System.out.println("Seleccione una canción: ");
			for(int i=0;i<10;i++) {
				System.out.println(i+1+")"+canciones.get(i));
			}
			System.out.println("10)Salir");
			int n = s.nextInt();
			r = new Reproductor(canciones.get(n),false,false);
			r.play();
			if(n==10) {
				repetir=false;
			}
			/*
			if(n.equals("1")) {
				r = new Reproductor(canciones.get(0),false,true);
				r.play();
			}else if(n.equals("2")) {
				r = new Reproductor(canciones.get(1),false,true);
				r.play();
			}else if(n.equals("3")) {
				r = new Reproductor(canciones.get(2),false,true);
				r.play();
			}else if(n.equals("4")) {
				r = new Reproductor(canciones.get(3),false,true);
				r.play();
			}else if(n.equals("5")) {
				r = new Reproductor(canciones.get(4),false,true);
				r.play();
			}else if(n.equals("6")) {
				r = new Reproductor(canciones.get(5),false,true);
				r.play();
			}else if(n.equals("7")) {
				r = new Reproductor(canciones.get(6),false,true);
				r.play();
			}else if(n.equals("8")) {
				r = new Reproductor(canciones.get(7),false,true);
				r.play();
			}else if(n.equals("9")) {
				r = new Reproductor(canciones.get(8),false,true);
				r.play();
			}else if(n.equals("10")) {
				r = new Reproductor(canciones.get(9),false,true);
				r.play();
			}
			*/
		}
	}

}
