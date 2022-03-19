import java.lang.*;
public class E32{
	public static void main(String[] args){
		double nota1=6.5;
		double nota2=4.2;
		double nota3=5.75;
		double nota4=3.5;
		double nota5=8;
		int falta=10;
		double media=(nota1+nota2+nota3+nota4+nota5)/5;
		boolean media1=(media>5);
		boolean falta1=(falta>=10);
		System.out.println("aprobado="+(media1&&falta1));
	}
}
		