package ejercicioA;
import java.util.ArrayList;
import java.util.List;

public class EjerHola {

	public static void main(String[] args) {
		List<String> palabras=new ArrayList<>();
		String pal1="Hola";
		String pal2="Adios";
		String pal3="Hola";
		String pal4="Lunes";
		String pal5="Martes";
		String pal6="Hola";
		palabras.add(pal1);
		palabras.add(pal2);
		palabras.add(pal3);
		palabras.add(pal4);
		palabras.add(pal5);
		palabras.add(pal6);
		/*for(int i=0;i<6;i++) {
			palabras.remove("Hola");
		}*/
		
		//while(palabras.indexOf("Hola")!=-1) {
		while(palabras.contains("Hola")) {
			palabras.remove("Hola");
		}
		
		System.out.println(palabras);

	}

}
