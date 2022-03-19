import java.lang.*;
public class Ejercicio31 {
	public static void main(String[] args){
		boolean encendida = true;
		int porcentajeTinta = 20;
		int foliosImpresora = 40;
		int foliosTrabajo = 8;
		boolean hayTinta = porcentajeTinta>0;
		boolean hayFolios = foliosImpresora>=foliosTrabajo;
		boolean resultado = encendida&&hayTinta&&hayFolios;
		System.out.println("¿Se puede imprimir? "+resultado);
	}
}