package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String contraseña = "hola";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una contraseña");
		String caracteres = sc.nextLine();
		if(contraseña.equals(caracteres)) {
			System.out.println("Contraseña correcta");
		}else{ 
			System.out.println("Contraseña incorrecta");
		}

	} 

}
/*
 Realiza un programa en el que haya un  String llamado contraseña con el valor que quieras. 
 El programa preguntará: "Introduzca la contraseña" y el usuario tecleará una cadena de caracteres. 
 Si coincide con la variable, se mostrará el mensaje "Contraseña correcta". 
 En caso contrario, se mostrará el mensaje "Contraseña incorrecta". 
 
*/