import java.lang.*;
public class EjercicioA{
	public static void main(String[] args){
		/*
			Tengo 15 caramelos y hay 4 niños.
			Calcula cuántos caramelos le tocan a cada niño y cuántos sobran.
		*/
		int caramelos = 15;
		int chicos = 4;
		int resultado = caramelos / chicos;
		int sobran = caramelos%chicos;
		// int sobran = caramelos - (resultado * chicos);
		System.out.println("A cada chicos le dan "+resultado+" y sobran "+sobran+" caramelos.");
	}
}