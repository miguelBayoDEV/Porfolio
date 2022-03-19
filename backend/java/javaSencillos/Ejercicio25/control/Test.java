package control;

import tools.ConversorArray;

public class Test {

	public static void test() {

		String[] ejemplo = { "", "hola", "a", "adios", "murcielago" };
		String[] ejemploEmpty = {};
		String[] ejemploNulo = null;

		if (!ConversorArray.comprobarArrayStringNullOrEmpty(ejemplo)) {
			System.out.println("Longitudes del array String:");
			for(int item: ConversorArray.conversorArrayStringToArrayIntLongitud(ejemplo)) {
				System.out.println(item);
			}
		} else {
			System.out.println("Este array es nulo o está vacío.");
		}

		if (ConversorArray.comprobarArrayStringNullOrEmpty(ejemploEmpty)) {
			System.out.println("Este array es nulo o está vacío.");
		}

		if (ConversorArray.comprobarArrayStringNullOrEmpty(ejemploNulo)) {
			System.out.println("Este array es nulo o está vacío.");
		}

	}

}
