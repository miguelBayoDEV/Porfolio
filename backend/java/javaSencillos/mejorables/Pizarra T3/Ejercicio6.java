import bpc.daw.mario.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// Crear un Mario con argumentos del comando.
		String n1 = args[0];
		int x = Integer.parseInt(n1);
		String n2 = args[1];
		int y = Integer.parseInt(n2);
		Mario m = new Mario(x,y);
		int rx = m.getX();
		System.out.println("x de Mario = "+rx);
		int ry = m.getY();
		System.out.println("y de Mario = "+ry);
	}

}
