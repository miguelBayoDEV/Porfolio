package t5ej9;

import java.io.*;
import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Introducir ruta: ");
		String ruta=s.nextLine();
		try {
			FileInputStream fis= new FileInputStream(ruta);
			InputStreamReader r= new InputStreamReader(fis);
			BufferedReader br= new BufferedReader(r);
			
			String x="";
			do {
				x=br.readLine();
				if(x!=null) {
					System.out.println(x);
				}else {
					fis.close();
					br.close();
					r.close();
				}
				
			}while(x!=null);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException error) {
			System.out.println(error);
		}
	}

}
