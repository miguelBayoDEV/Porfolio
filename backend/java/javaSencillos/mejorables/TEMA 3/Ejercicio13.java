import java.util.Scanner;
public class Estandar {
	public static void main(String[] args) {
		String saludo = "Escribe tu nombre por teclado:";
		System.out.println(saludo);
		Scanner s = new Scanner(System.in);
		String devuelve = s.nextLine();
		System.out.println("Bienvenido al instituto, "+devuelve);
	}

}
