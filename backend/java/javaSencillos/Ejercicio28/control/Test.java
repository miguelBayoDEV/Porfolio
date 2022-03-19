package control;

import tools.ConversorArray;

public class Test {

	public static void test() {
		String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		diasSemana = ConversorArray.conversorArrayToArrayOrdenado(diasSemana);
		ConversorArray.imprimirArray(diasSemana);
		meses = ConversorArray.conversorArrayToArrayOrdenado(meses);
		ConversorArray.imprimirArray(meses);
	}
	
}
