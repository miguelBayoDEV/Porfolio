package Ejercicio13;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 3 numeros numericos");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1>n2&&n1>n3) {
			System.out.println("El numero mayor es "+n1);
		}else if(n2>n1&&n2>n3) {
			System.out.println("El numero mayor es "+n2);
		}else if(n3>n1&&n3>n2){
			System.out.println("El numero mayor es "+n3);
			
		}

	}

}
/*
Realiza un programa que lea por teclado tres números enteros y el programa
muestre el mayor de ellos
*/