import java.lang.*;
public class Ejercicio54 {
	public static void main(String[] args){
		String n1 = args[0];
		String n2 = args[1];
		int n�mero1 = Integer.parseInt(n1);
		int n�mero2 = Integer.parseInt(n2);
		boolean mayor_igual = n�mero1>=n�mero2;
		System.out.println("�El primer n�mero "+n�mero1+" es mayor o igual que el segundo n�mero "+n�mero2+"? "+mayor_igual);
	}
}