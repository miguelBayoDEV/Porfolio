package tools;

public class Matriz2D {

	public static int[][] generarMatriz2D() {
		int[][] matriz2D = new int[10][10];
		for(int i=0; i<matriz2D.length; i++) {
			for(int j=0; j<matriz2D.length; j++) {
				matriz2D[i][j] = j;
			}
		}
		return matriz2D;
	}
	
	public static void imprimirMatriz2D(int[][] matriz2D) {
		String resultado = "";
		System.out.println("Matriz 2D resultado:");
		for(int i=0; i<matriz2D.length; i++) {
			resultado += "[";
			for(int j=0; j<matriz2D.length; j++) {
				if(j == 9) {
					resultado += matriz2D[i][j] + "]";
				}else {
					resultado += matriz2D[i][j] + ", ";
				}
			}
			System.out.println(resultado);
			resultado = "";
		}
	}
	
	// Ejercicio 27
	public static String[][] matrizPuntos() {
		String[][] matriz = new String[7][7];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				matriz[i][j] = "*";
			}
		}
		return matriz;
	}
	
	public static void imprimirMatrizPuntos(String[][] matriz) {
		System.out.println("Matriz puntos resultado:");
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void girarMatriz90Derecha(String[][] matriz) {
		System.out.println("Matriz puntos resultado girar a la derecha 90º:");
		int contador = 0;
		String[] resultados = new String[matriz.length];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(resultados[j] == null) {
					resultados[contador] = matriz[i][j] + " ";
				}else {
					resultados[contador] += matriz[i][j] + " ";
				}
				contador++;
			}
			contador = 0;
		}
		
		for(String item: resultados) {
			System.out.println(item);
		}
	}
	
}
