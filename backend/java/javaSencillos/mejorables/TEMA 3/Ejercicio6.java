import bpc.daw.mario.*;
public class Ejercicio6 {

	public static void main(String[] args) {

		String coordenadaX=args[0];
		String coordenadaY=args[1];
		int coorX=Integer.parseInt(coordenadaX);
		int coorY= Integer.parseInt(coordenadaY);
		
		Mario m= new Mario(coorX,coorY);
		
	}

}
