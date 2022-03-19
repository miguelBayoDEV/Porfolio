package control;

import tools.Matriz2D;

public class Test {

	public static void test() {
		String[][] matriz = Matriz2D.matrizPuntos();
		Matriz2D.imprimirMatrizPuntos(matriz);
		
		// Nueva matriz con letras
		String[][] nuevaMatriz = {
				{"a", "b", "c", "d", "e", "f", "g"},
				{"a", "b", "c", "d", "e", "f", "g"},
				{"a", "b", "c", "d", "e", "f", "g"},
				{"a", "b", "c", "d", "e", "f", "g"},
				{"a", "b", "c", "d", "e", "f", "g"},
				{"a", "b", "c", "d", "e", "f", "g"},
				{"a", "b", "c", "d", "e", "f", "g"}
		};
		Matriz2D.girarMatriz90Derecha(nuevaMatriz);
		Matriz2D.girarMatriz90Derecha(matriz);
	}
	
}
