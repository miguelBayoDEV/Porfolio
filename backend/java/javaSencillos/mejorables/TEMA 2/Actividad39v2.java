import java.lang.*;
public class Actividad39v2{
	public static void main(String[] args){

		String numero=args[0];
		double numero1=Double.parseDouble(numero);
		double numero2=numero1%2;
		boolean resto=numero2==0;

	


		System.out.println("¿Es par? "+resto);

	}
}