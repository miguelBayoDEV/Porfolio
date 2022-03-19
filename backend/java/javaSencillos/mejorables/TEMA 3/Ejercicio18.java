import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		String dato1= "";
		String dato2="";
		
		System.out.println("Introduce una frase");
		dato1= entrada.nextLine();
		System.out.println("Introduce una palabra");
		dato2= entrada.nextLine();
		int igual= dato1.indexOf(dato2);
		boolean compara= igual== -1;
		System.out.println("La palabra esta dentro de la frase? "+!compara);
		
		
	}

}
