import java.lang.*;
public class Ejercicio51 {
	public static void main(String[] args){
		// Sumar el n�mero de dedos obtenidos de los 7 amigos.
		int n�meroAmigos = 7;
		int nDedos0 = 4;
		int nDedos1 = 5;
		int nDedos2 = 1;
		int nDedos3 = 0;
		int nDedos4 = 3;
		int nDedos5 = 2;
		int nDedos6 = 3;
		int totalN�mero_dedos = nDedos0+nDedos1+nDedos2+nDedos3+nDedos4+nDedos5+nDedos6;
		// El amigo que se pondr� de portero ser� totalN�mero_dedos (18) m�dulo de 7 (el resto es 4).
		int amigoPortero = totalN�mero_dedos%n�meroAmigos;
		// Como el n�mero 0 cuenta se realizar� un incremento a la variable amigoPortero.
		amigoPortero++;
		System.out.println("El amigo que se pondr� de portero es el n�mero: "+amigoPortero+".");
	}
}