package tool;

import exception.ExceptionFueraRangoInt;

public class Calculo {

	public static int factorial(int numero) throws ExceptionFueraRangoInt {

		int factorial = 1;
		// Poner el número negativo siempre en positivo, es decir, no le importa el
		// signo
		numero = Math.abs(numero);

		if (numero == 0) {
			factorial = 1;
		} else {
			for (int i = numero; i > 0; i--) {
				// Comprobar si número está fuera de rango
				if (factorial >= Integer.MAX_VALUE || factorial <=Integer.MIN_VALUE) {
					throw new ExceptionFueraRangoInt("Sobrepasa rango límite de int.");
				} else {
					factorial = factorial * i;
				}
				System.out.println(factorial);
			}
		}

		return factorial;
	}

	public static boolean isChar(char numero) {
		String n = "" + numero;
		boolean resultado = (n.matches("[+-]?\\d*(\\.\\d+)?")) ? false : true;
		return resultado;
	}

}
