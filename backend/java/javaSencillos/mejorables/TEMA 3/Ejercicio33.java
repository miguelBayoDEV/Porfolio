import java.io.IOException;

import bpc.daw.reproductor.*;
public class Ejercicio33 {

	public static void main(String[] args) {
		
		//CARGAMOS LA LISTA CREADA ANTERIORMENTE Y LA REPRODUCIMOS SI NO DA ERROR
		
		try {
			PlayList p = new PlayList ("/Users/elenasilva/Desktop/lista.txt");
			System.out.println("Lista Cargada");
			Reproductor r = new Reproductor (p,true, true);
			r.play();
		}catch (IOException error) {
			System.out.println("Error al cargar la lista");
		}
	}

}

 