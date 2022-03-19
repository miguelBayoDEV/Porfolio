import java.lang.*;
public class Ejercicio54 {
	public static void main(String[] args){
		String n1 = args[0];
		String n2 = args[1];
		int número1 = Integer.parseInt(n1);
		int número2 = Integer.parseInt(n2);
		boolean mayor_igual = número1>=número2;
		System.out.println("¿El primer número "+número1+" es mayor o igual que el segundo número "+número2+"? "+mayor_igual);
	}
}