import java.lang.*;
public class Ejercicio26 {

	public static void main(String[] args) {
		int suma = 0;
		int cua = 0;
		for(int i=5;i<=13;i++) {
			cua = (int) Math.pow(i, 2);
			suma +=cua;
		}
		System.out.println("La suma de los números cuadrados entre 5 y 13 son: "+suma);
	}

}
