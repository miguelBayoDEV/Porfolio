package TrianguloAsterisco_Ejer19;

public class TrianguloAsterisco {

	public static void crearTrianguloAsteriscosA(int numeroAsteriscos) {
		for(int i=1; i<=numeroAsteriscos; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void crearTrianguloAsteriscosB(int numeroAsteriscos) {
		for(int i=1; i<=numeroAsteriscos; i++) {
			for(int j=1; j<=numeroAsteriscos-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void crearTrianguloAsteriscosC(int numeroAsteriscos) {
		for(int i=0; i<=numeroAsteriscos; i++) {
			for(int j=1; j<=numeroAsteriscos-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* * ");
			}
			System.out.println("");
		}
	}

}
