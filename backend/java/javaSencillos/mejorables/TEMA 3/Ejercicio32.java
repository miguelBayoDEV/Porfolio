import java.io.IOException;

import bpc.daw.reproductor.*;
public class Ejercicio32 {

	public static void main(String[] args) {
		PlayList pl=new PlayList();
		
		ArchivoMP3 song1=new ArchivoMP3("Stand Proud.mp3");
		ArchivoMP3 song2=new ArchivoMP3("Music/Nisekoi_-_Click.mp3");
		ArchivoMP3 song3=new ArchivoMP3("Medaka_Box_Abnormal_-_Believe.mp3");
		pl.añadir(song1);
		pl.añadir(song2);
		pl.añadir(song3);
		try {
			pl.guardar("ListaEjemplo.txt");
		}catch(IOException e) {
			System.out.println("Archivo no encontrado");
		}
		Reproductor r=new Reproductor(pl, true, true);
		r.play();
		

	}

}
