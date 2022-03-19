package Ejercicio24;

public class Ejer24 {

	public static void main(String[] args) {
		String[][] tabla = {	{"Lun", "Mart", "Mier", "Juev", "Vier"},
								{ "Fol",  "Sist", "Dat", "Leng", "Prog"},
								{"Fol", "Sist", "Dat", "Leng", "Prog"},
								{"Fol", "Sist", "Entor", "Dat", "Prog"},
								{ "Sist","Dat", "Prog", "Entor", "Entor"},
								{ "Sist", "Dat", "Prog", "Prog", "Leng"},
								{"Sist", "Dat", "Prog", "Prog", "Leng"}

		};

		for (int i = 0; i < tabla.length; i++) {
			//System.out.println("Dia "+i+" de la semana:");
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]+"       ");
			}
			System.out.println();
		}

	}

}
