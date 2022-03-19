import java.lang.*;
public class Ejercicio16 {
	public static void main(String[] args){
		int cobroClases_particulares = 7;
		// En este caso la variable mes podría omitirse debido a que ya sabemos las semanas de un mes.
		int mes = 30;
		int semanasMes = 4;
		// Dinero que recibe de cada alumno al mes por darles sus respectivas clases.
		int clasesSemanales_alumno1 = (2*semanasMes)*cobroClases_particulares;
		int clasesSemanales_alumno2 = (3*semanasMes)*cobroClases_particulares;
		// El cobro que recibirá de sus dos alumnos al mes.
		int cobroMes = clasesSemanales_alumno1+clasesSemanales_alumno2;
		System.out.println("En un mes ganará con estos dos alumnos: "+cobroMes+" euros.");
		int ganar900 = 900;
		// Esta puesto esta variable con int y no con double (128,5714285714286) para que no haya error de incompatibilidad.
		int horasClases_mes = ganar900/cobroClases_particulares;
		/* 
			Le he sumado 1 al resultado porque al dar un decimal no sería lógica la respuesta; es decir,
			esos 4 euros que faltan hasta 900 serían los decimales así que lo lógico sería dar otra clase (en este caso).
			int totalHoras_mes = horasClases_mes+1;
		*/
		System.out.println("Debe dar para ganar 900 euros "+horasClases_mes+" horas de clase al mes.");
	}
}