import java.lang.*;
public class Ejercicio43 {
	public static void main(String[] args){
		String �poca = args[0];
		int a�o = Integer.parseInt(�poca);
		boolean condici�n1 = a�o%400==0;
		boolean condici�n2a = a�o%4==0;
		boolean condici�n2b = a�o%100!=0;
		boolean condici�n2 = (condici�n2a)&&(condici�n2b);
		boolean condici�n = condici�n1||condici�n2;
		System.out.println("�El a�o "+a�o+" es un a�o bisiesto? "+condici�n);
	}
}