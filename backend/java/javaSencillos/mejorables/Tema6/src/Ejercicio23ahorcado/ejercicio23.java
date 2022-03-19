package Ejercicio23ahorcado;

/*Ejercicio 23: El juego del ahorcado.
 Realiza el famoso juego del ahorcado de la siguiente manera:
 	-Haz un ArrayList<String> llamado "palabras" en el que guardarás
 	la lista de palabras disponibles en el juego, y una variable 
 	llamada "vidas" con el valor 4.
	-Usa la clase Collections para desordenar aleatoriamente la 
	lista, y saca la primera palabra que haya en la lista, 
	borrándola de ella al sacarla.
	-Cuenta el número de letras que hay en la variable "palabra" y 
	haz un array de booleanos de ese tamaño llamado "aciertos", 
	todos con el valor inicial false.

	Cada booleano controla si la letra que hay en la posición 
	correspondiente de la variable "palabra" ha sido adivinada 
	por el usuario.
	
	-Haz una variable String llamada "vistaUsuario" que estará 
	formada de la siguiente forma: se recorre el array "aciertos" 
	y por cada false, se añade un guión (-). Por cada true, se pone
	la letra de la variable "palabra" que se corresponde con la 
	posición del booleano.
	-Muestra por pantalla las variables "vistaUsuario" y "vidas".
	-Pide una letra al usuario y comprueba si está dentro de la 
	variable "palabra". En caso de encontrarla, pon a true todos 
	los booleanos que se correspondan con la posición de la letra 
	encontrada y actualiza la variable "vistaUsuario". En caso de 
	no encontrarla, haz que el usuario pierda una vida.
	-Repite los dos últimos puntos hasta que el usuario pierda o 
	acierte la palabra. Muestra un mensaje de éxito o fracaso al 
	final de la partida.
	-Si el usuario acierta la palabra, repite el proceso sacando 
	nuevamente la primera palabra de la lista, hasta que el usuario 
	acierte todas las palabras o pierda sus vidas.*/
import java.util.*;

public class ejercicio23 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		List<String> palabras = new ArrayList<>();

		int vidas = 4;
		palabras.add("aaron");
		palabras.add("victor");
		palabras.add("torres");
		palabras.add("cristian");
		palabras.add("maria");
		palabras.add("elena");
		palabras.add("pangolin");
		int p = 0;
		int max = palabras.size();
		Collections.shuffle(palabras);
		boolean juego = true;
		while (juego && (p < max) && vidas >= 0) {

			String palabra = palabras.get(0);
			palabras.remove(0);

			int tamaño = palabra.length();

			boolean[] aciertos = new boolean[tamaño];
			String vistaUsuario = "";

			for (int i = 0; i < tamaño; i++) {
				vistaUsuario += "-";
			}

			boolean acierto = false;

			System.out.println(vistaUsuario);

			boolean repetir = true;
			while (repetir && vidas >= 0) {
				List<String> letras = new ArrayList<>();

				String lectura = "";
				String aux = vistaUsuario;
				System.out.println("\nIntroduzca una letra || Vidas:" + vidas);
				char entrada = 'a';

				do {
					lectura = teclado.nextLine();
					entrada = lectura.charAt(0);
				} while (letras.indexOf(entrada) != (-1));

				letras.add(lectura);

				boolean fallo = true;
				for (int i = 0; i < tamaño; i++) {

					aux = vistaUsuario;
					if (palabra.charAt(i) == entrada) {

						fallo = false;
						if (i == 0) {
							aux = entrada + vistaUsuario.substring(i + 1);
						} else if (i == palabra.length()) {
							aux = vistaUsuario.substring(0, i - 1) + entrada;
						} else {
							aux = vistaUsuario.substring(0, i) + entrada + vistaUsuario.substring(i + 1);
						}

						aciertos[i] = true;

					}
					vistaUsuario = aux;
				}

				if (fallo) {
					vidas--;
				}

				boolean encontrado = true;
				for (int i = 0; i < tamaño; i++) {
					if (aciertos[i] == false) {
						encontrado = false;
					}
				}

				System.out.println(vistaUsuario);
				if (vidas < 0) {
					repetir = false;
				}
				if (encontrado) {
					repetir = false;
					acierto = true;
				}

			}

			if (acierto) {
				System.out.println("Acertaste! ");
				p++;
			} else {
				System.out.println("Lo siento, has perdido. " + palabra);
				vidas--;
			}

		}
		System.out.println("---Fin del juego---");
	}

}
