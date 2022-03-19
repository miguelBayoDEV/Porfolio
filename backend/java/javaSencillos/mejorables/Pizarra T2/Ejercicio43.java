import java.lang.*;
public class Ejercicio43 {
	public static void main(String[] args){
		String época = args[0];
		int año = Integer.parseInt(época);
		boolean condición1 = año%400==0;
		boolean condición2a = año%4==0;
		boolean condición2b = año%100!=0;
		boolean condición2 = (condición2a)&&(condición2b);
		boolean condición = condición1||condición2;
		System.out.println("¿El año "+año+" es un año bisiesto? "+condición);
	}
}