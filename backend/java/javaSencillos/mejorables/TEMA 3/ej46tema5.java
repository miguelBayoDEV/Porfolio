package ej46tema3;
import java.util.*;
import java.awt.*;
import java.io.*;
public class ej46tema5 {

	public static void main(String[] args) {
		System.out.print("Escribe aquí la ruta del archivo: ");
		Scanner S=new Scanner(System.in);
		String ruta=S.nextLine();
		File F=new File(ruta);
		try {
			Desktop D=Desktop.getDesktop();
			D.open(F);
		}catch(IOException error)
		{
			System.out.print("No se ha podido abrir el archivo");
		}
		
		

	}

}
