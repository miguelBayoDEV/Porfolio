import java.lang.*;
public class Ejercicio45 {
	public static void main(String[] args){
		String n�m = args[0];
		String n�mPremiado = args[1];
		int n�mero = Integer.parseInt(n�m);
		int n�meroPremiado = Integer.parseInt(n�mPremiado);
		// N�mero coincide con n�mero premiado.
		boolean coincidir = n�mero==n�meroPremiado;
		System.out.println("�"+n�mero+" coincide con n�mero premiado: "+n�mPremiado+"? "+coincidir);
		// Si el n�mero tiene reintegra seguir� estas condiciones. 
		int nPremiado = n�meroPremiado%10;
		int n�mer = n�mero%10;
		int n�mero1 = n�mero/10000;
		int n�meroPremiado1 = n�meroPremiado/10000;/*
		System.out.println(nPremiado);
		System.out.println(n�mer);
		*/
		boolean coincidencia2 = n�mero1==n�mer;
		/*
		System.out.println(n�mero1);
		System.out.println(n�meroPremiado1);
		*/
		boolean coincidencia1 = n�meroPremiado1==nPremiado;
		boolean resultado = coincidencia1&&coincidencia2;
		System.out.println("�Este n�mero "+n�mero+" tiene reintegro? "+resultado);
	}
}