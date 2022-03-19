package ej19tema3;
import java.util.*;
public class ej19tema3 {

	public static void main(String[] args) {
		System.out.println("¿cual es tu nombre?");
		Scanner Nombre=new Scanner(System.in);
		String Nombre2=Nombre.nextLine();
		System.out.println("¿cual es tu domino?");
		Scanner Dominio=new Scanner(System.in);
		String Dominio2=Dominio.nextLine();
		System.out.print("Tu correo es: "+Nombre2+"@"+Dominio2+".com");
		

	}

}
