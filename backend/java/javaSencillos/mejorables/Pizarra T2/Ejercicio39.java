import java.lang.*;
public class Ejercicio39 {
	public static void main(String[] args){
		String valor = args[0];
		int n�mero = Integer.parseInt(valor);
		// Para no recibir valores de consola ser�a: int n�mero = 22; esto dar�a true porque el resto es igual a 0.
		boolean par = (n�mero%2)==0;
		System.out.println("�Es "+n�mero+" un n�mero par? "+par);
	}
}