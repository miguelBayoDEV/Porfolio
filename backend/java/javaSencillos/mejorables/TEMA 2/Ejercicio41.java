import java.lang.*;
public class Ejercicio41{
	public static void main(String[] args){
		int edadMayor=20;
		double pagaMayor=12.75;
		int edadMenor=15;
		int edadMediano=18;
		//a)
		double pagaMenor=(edadMenor*pagaMayor)/edadMayor;
		double pagaMediano=(edadMediano*pagaMayor)/edadMayor;
		System.out.println(pagaMediano+" "+pagaMenor);
		
		//b)
		double pagaTotal=pagaMayor+pagaMediano+pagaMenor;
		double pagaMes=pagaTotal*4;
		System.out.println(pagaMes);
		//c)
		int sueldoPadre=1200;
		double porcentaje=(pagaMes*100)/sueldoPadre;
		System.out.println(porcentaje);
	}
}