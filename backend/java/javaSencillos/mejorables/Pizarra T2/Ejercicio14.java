import java.lang.*;
public class Ejercicio14 {
	public static void main(String[] args){
		double pel�culaEl_padrino = 3.5;
		double pel�culaOdisea_2001 = 2.95;
		int d�as = 2;
		// Se multiplica cada pel�cula por los d�as y se suman.
		double pagoDos_d�as = (pel�culaEl_padrino * d�as) + (pel�culaOdisea_2001 * d�as);
		// Como el resultado es false ser�a que NO, si el resultado fuese true ser�a S�. Tambi�n pagoDos_d�as<=5.
		boolean billete_5 = 5>=pagoDos_d�as;
		System.out.println("El dinero que se necesita para alquilar dos d�as estas dos pel�culas son: "+pagoDos_d�as+" euros.");
		System.out.println("�Ser� suficiente un billete de 5 euros para pagar dicho alquiler? "+billete_5);
	}
}