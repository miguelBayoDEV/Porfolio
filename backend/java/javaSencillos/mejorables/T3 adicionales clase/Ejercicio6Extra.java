import java.awt.Font;
import java.io.File;
import java.io.IOException;

import bpc.daw.consola.*;

public class Ejercicio6Extra {

	public static void main(String[] args) {
		Consola c=new Consola();
		CapaTexto ct=c.getCapaTexto();
		Teclado t=c.getTeclado();
		File arc=new File("horrendo.ttf");
		Font letraNue=null;
		try {
			letraNue=Font.createFont(Font.TRUETYPE_FONT, arc);
		}catch(Exception e) {
			ct.println(e.getMessage());
		}
		ct.setFont(letraNue);
		String esc=t.leerCadenaCaracteres();
		char car=t.leerCaracter();

		
		

	}

}
