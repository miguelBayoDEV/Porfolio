import java.util.Scanner;
public class correo20 {

	public static void main(String[] args) {
		System.out.println("¿Cuál es tu correo electrónico?");
		Scanner c = new Scanner(System.in);
		String correo = c.nextLine();
		int posicion = correo.indexOf("@");
		int ultimo = correo.length();
		String nombre = correo.substring(0,posicion);
		String dominio = correo.substring(posicion+1,ultimo);
		System.out.println("Este es tu nombre: "+nombre);
		System.out.println("Este es tu dominio: "+dominio);
	}
}
