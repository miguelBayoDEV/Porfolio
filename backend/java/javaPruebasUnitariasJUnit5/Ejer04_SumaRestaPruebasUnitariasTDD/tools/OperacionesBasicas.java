package tools;

import java.util.Optional;

import Exception.ExceptionFueraRangoInt;

public class OperacionesBasicas {

	public static int sumar(int a, int b) {
		int resultado = 0;

		try {
			resultado = (a) + (b);
			System.out.println(resultado);
			errorFueraRangoInt(resultado);
		} catch (ExceptionFueraRangoInt e) {
			System.out.println("");
		} catch (Exception e) {
			System.out.println("");
		}

		return resultado;
	}

	public static int restar(int a, int b) {
		int resultado = 0;

		try {
			resultado = (a) - (b);
			errorFueraRangoInt(resultado);
		} catch (ExceptionFueraRangoInt e) {
			System.out.println("");
		} catch (Exception e) {
			System.out.println("");
		}

		return resultado;
	}

	public static void errorFueraRangoInt(int resultado) throws ExceptionFueraRangoInt {
		if (resultado <= -2147483647 || resultado <= 2147483647) {
			throw new ExceptionFueraRangoInt("Resultado supera el límite de tipo Integer.");
		}
	}
	
	public static boolean isChar(char numero) {
		String n = "" + numero;
		boolean resultado = (n.matches("[+-]?\\d*(\\.\\d+)?")) ? false : true;
		return resultado;
	}

}
