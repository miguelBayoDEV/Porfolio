package ej42;

public class ej42 {

	public static void main(String[] args) {
		
		//Variables
		double v1 = 0.38;
		double v2 = 4.93;
		double exp = -0.36;
		
		//Operaciones
		double operacion = (v1*v2);
		double resultado = Math.pow(operacion, exp);
		
		//Se muestra por pantalla
		System.out.println("El resultado de la operación es "+resultado);
		
		//Se redondea y se muestra por pantalla
		long redondeo = Math.round(resultado);
		System.out.println("Al redondear el valor es "+redondeo);
		
	}

}
