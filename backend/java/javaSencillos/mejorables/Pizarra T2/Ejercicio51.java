import java.lang.*;
public class Ejercicio51 {
	public static void main(String[] args){
		// Sumar el número de dedos obtenidos de los 7 amigos.
		int númeroAmigos = 7;
		int nDedos0 = 4;
		int nDedos1 = 5;
		int nDedos2 = 1;
		int nDedos3 = 0;
		int nDedos4 = 3;
		int nDedos5 = 2;
		int nDedos6 = 3;
		int totalNúmero_dedos = nDedos0+nDedos1+nDedos2+nDedos3+nDedos4+nDedos5+nDedos6;
		// El amigo que se pondrá de portero será totalNúmero_dedos (18) módulo de 7 (el resto es 4).
		int amigoPortero = totalNúmero_dedos%númeroAmigos;
		// Como el número 0 cuenta se realizará un incremento a la variable amigoPortero.
		amigoPortero++;
		System.out.println("El amigo que se pondrá de portero es el número: "+amigoPortero+".");
	}
}