import java.lang.*;
public class Ejercicio41 {
	public static void main(String[] args){
		// Hay 4 fines de semanas en un mes.
		int finSemana = 4;
		// Edad primer hijo.
		int edad1 = 20;
		// Edad segundo hijo.
		int edad2 = 18;
		// Edad tercer hijo.
		int edad3 = 15;
		// Paga primer hijo.
		double paga1 = 12.75;
		System.out.println("Al primer hijo le da una paga de "+paga1+" euros.");
		// Paga segundo hijo.
		double paga2 = (edad2*paga1)/edad1;
		System.out.println("Al segundo hijo le da una paga de "+paga2+" euros.");
		// Paga tercer hijo.
		double paga3 = (edad3*paga1)/edad1;
		System.out.println("Al tercer hijo le da una paga de "+paga3+" euros.");
		// Paga total primer hijo en un mes.
		double paga1Total = paga1*finSemana;
		// Paga total segundo hijo en un mes.
		double paga2Total = paga2*finSemana;
		// Paga total tercer hijo en un mes.
		double paga3Total = paga3*finSemana;
		// Paga total de todos los hijos en un mes.
		double pagaTotal = paga1Total+paga2Total+paga3Total;
		System.out.println("El padre se gasta al mes en las pagas de sus hijos "+pagaTotal+" euros.");
		int gananciaPadre = 1200;
		double porcentajeGanancia_padre = (pagaTotal*100)/gananciaPadre;
		System.out.println("El porcentaje del suledo del padre en las pagas de sus hijos es; "+porcentajeGanancia_padre+"%.");
	}
}