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
	
}
