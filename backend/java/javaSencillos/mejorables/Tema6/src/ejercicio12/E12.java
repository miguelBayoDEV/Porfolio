package ejercicio12;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		List<Integer> lista=new ArrayList<>();
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int numero=r.nextInt(11);
			lista.add(numero);
		}
		System.out.println("Introduzca un n�mero");
		int opcion=s.nextInt();
		boolean esta=lista.contains(opcion);
		if(esta==true) {
			System.out.println("El n�mero esta en la lista");
		}else {
			System.out.println("El n�mero no esta");
		}
		System.out.println(lista);
	}
}
