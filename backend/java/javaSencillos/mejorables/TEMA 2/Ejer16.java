import java.lang.*;
public class Ejer16{
	public static void main(String[] args){
		int hora= 7; //Variable que indica el salario por hora
		int semanas=4;   //Variable que indica las semanas de un mes 
		int alumno1=2;  //Variable que indica las horas que va el alumno1
		int alumno2=3;  //Variable que indica las horas que va el alumno2
		int totalalumno1=(semanas*alumno1)*hora;  //Total que paga el alumno1
		int totalalumno2=(semanas*alumno2)*hora;  //Total que paga el alumno2
		System.out.println("Ganara en un mes "+(totalalumno1+totalalumno2)+" euros");
		int salariomax=900;
		System.out.println("Para ganar 900 euros debe dar "+(salariomax/hora)+" clases");
	}
}