import bpc.daw.reproductor.*;
public class Ejercicio34 {

	public static void main(String[] args) {
		//a)
		ArchivoMP3 a1=new ArchivoMP3("C:/Users/ACER/Music/jojos-bizarre-adventure-opening-8-full-fighting-gold.mp3");
		ArchivoMP3 a2=new ArchivoMP3("C:/Users/ACER/Music/mob-psycho-100-op-opening-full-99-by-mob-choir");
		boolean comparar=a1==a2;
		System.out.println(comparar);
		boolean comp2=a1.equals(a2);
		System.out.println(comp2);
		int hash=a1.hashCode();
		int hash2=a2.hashCode();
		System.out.println(hash+" "+hash2);
		PlayList pl=new PlayList();
		pl.añadir(a1);
		pl.añadir(a2);
		
		//b)
		Reproductor r=new Reproductor(pl, false, true);
		r.play();
		String repro=r.toString();
		System.out.println(repro);
		
		//c)
		ArchivoMP3 a3=new ArchivoMP3("C:/Users/ACER/Music/man-with-a-mission-ft-takuma-database-log-horizon-op");
		String stringA3=a3.toString();
		System.out.println(stringA3);

	}

}
