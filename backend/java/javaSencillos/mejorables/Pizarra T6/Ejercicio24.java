import java.util.*;
public class Ejercicio24 {

	public static void main(String[] args) {
		
		//Crear la tabla. No te sale cuadrado debido a que se debe poner los espacios al crear la tabla horario.
		String[][] horario = {
				{"             |","Lunes   |","Martes    |","Miércoles   |","Jueves          |","Viernes         "},
				{"16:00h-16:55h|","Fol     |","Sistemas  |","Base Datos  |","Lenguajes Marcas|","Programación    "},
				{"16:55h-17:50h|","Fol     |","Sistemas  |","Base Datos  |","Lenguajes Marcas|","Programación    "},
				{"17:50h-18:45h|","Fol     |","Sistemas  |","Entornos    |","Base Datos      |","Programación    "},
				{"18:45h-19:00h|","Recreo  |","Recreo    |","Recreo      |","Recreo          |","Recreo          "},
				{"19:00h-19:55h|","Sistemas|","Base Datos|","Programación|","Entornos        |","Entornos        "},
				{"19:55h-20:50h|","Sistemas|","Base Datos|","Programación|","Programación    |","Lenguajes Marcas"},
				{"20:50h-21:45h|","Sistemas|","Base Datos|","Programación|","Programación    |","Lenguajes Marcas"}
		};
		
		//Mostrar por pantalla la tabla.
		for(int i=0;i<horario.length;i++) {
			for(int j=0;j<horario[i].length;j++) {
				System.out.print(horario[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
