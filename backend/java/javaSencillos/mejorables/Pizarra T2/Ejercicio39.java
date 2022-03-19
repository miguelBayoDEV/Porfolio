import java.lang.*;
public class Ejercicio39 {
	public static void main(String[] args){
		String valor = args[0];
		int número = Integer.parseInt(valor);
		// Para no recibir valores de consola sería: int número = 22; esto daría true porque el resto es igual a 0.
		boolean par = (número%2)==0;
		System.out.println("¿Es "+número+" un número par? "+par);
	}
}