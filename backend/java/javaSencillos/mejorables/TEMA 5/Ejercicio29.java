package Ejercicio29b;
import java.util.*;
public class Ejercicio29 {
	public static void main(String[] args) {
		System.out.println("Introduzca un número");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int divisores=0;
		for(int i=2;i<x;i++) {
			if(x%i==0){
				divisores++;
			}
		}
		if(divisores==0){
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}
	}
}