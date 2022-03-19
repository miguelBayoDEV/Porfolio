package ejercicio18;
import java.util.*;

public class Ejer18 {

	public static void main(String[] args) {
		char[] dni= {'T',
				'R',
				'W',
				'A',
				'G',
				'M',
				'Y',
				'F',
				'P',
				'D',
				'X',
				'B',
				'N',
				'J',
				'Z',
				'S',
				'Q',
				'V',
				'H',
				'L',
				'C',
				'K',
				'E',
				'T'
		};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe tu DNI sin letra");
		
		int num=sc.nextInt();
		
		int resto=num%23;
		
		System.out.println(dni[resto]);
		
		

	}

}
