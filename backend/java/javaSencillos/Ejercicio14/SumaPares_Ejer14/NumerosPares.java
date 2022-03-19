package SumaPares_Ejer14;

public class NumerosPares {

	public static int sumarNumerosPares(int numero) {
		int suma = 0;
		
		for(int i=1; i<=numero; i++) {
			System.out.println(i * 2);
			suma+= i * 2;
		}
		
		return suma;
	}
	
}
