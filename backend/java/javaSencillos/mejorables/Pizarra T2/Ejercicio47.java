import java.lang.*;
public class Ejercicio47 {
	public static void main(String[] args){
		int n�mero = 97;
		char car�cter = (char) n�mero;
		int n�mero1 = 92;
		char car�cter1 = (char) n�mero1;
		// Saber si un car�cter es n�mero: car�cter>='0'&&car�cter<='9'; (car�cter>='a'&&car�cter<='z')||(car�cter>='A'&&car�cter<='Z'); el primer par�ntesis es min�scula y el segundo may�scula.
		boolean primer_n�mero = (car�cter>='a'&&car�cter<='z')||(car�cter>='A'&&car�cter<='Z');
		System.out.println(car�cter+",�corresponde a una letra? "+primer_n�mero);
		boolean segundo_n�mero = (car�cter1>='a'&&car�cter1<='z')||(car�cter1>='A'&&car�cter1<='Z');
		System.out.println(car�cter1+",�corresponde a una letra? "+segundo_n�mero);
	}
}