package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String contrase�a = "hola";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una contrase�a");
		String caracteres = sc.nextLine();
		if(contrase�a.equals(caracteres)) {
			System.out.println("Contrase�a correcta");
		}else{ 
			System.out.println("Contrase�a incorrecta");
		}

	} 

}
/*
 Realiza un programa en el que haya un  String llamado contrase�a con el valor que quieras. 
 El programa preguntar�: "Introduzca la contrase�a" y el usuario teclear� una cadena de caracteres. 
 Si coincide con la variable, se mostrar� el mensaje "Contrase�a correcta". 
 En caso contrario, se mostrar� el mensaje "Contrase�a incorrecta". 
 
*/