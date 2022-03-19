import bpc.daw.consola.*;
import java.util.*;
public class EjercicioAdicional2 {
	public static void main(String[] args){

		//Creo la consola
		
		Consola c=new Consola();
		CapaFondo cf=c.getCapaFondo();
		Teclado t=c.getTeclado();
		CapaTexto ct=c.getCapaTexto();
		ct.println("Escriba tres numeros enteros comprendidos entre el 0 y el 255");
			
		
		try {
			int r=t.leerNumeroEntero();
			int g=t.leerNumeroEntero();
			int b=t.leerNumeroEntero();
			FondoColorSolido color=new FondoColorSolido(r,g,b);
			cf.setFondo(color);
			t.leerNumeroEntero();
			}catch(Exception error){
				ct.println(error.getMessage())
			}
		
		
	}
}
