package ej14tema5;
import bpc.daw.consola.*;
public class ej14tema5 {

	public static void main(String[] args) {
		Consola c=new Consola();
		CapaTexto tx=c.getCapaTexto();
		Teclado te=c.getTeclado();
		int lado=0;
		for(int i=0;i<20;i++){
			int resto=(i+1)%2;
			if(resto==0){
				 lado=45;
			}else {
				lado=1;
			}
			tx.print(i,lado,i+") No se juega en clase");
			
		}
		te.leerCaracter();
	}

}
