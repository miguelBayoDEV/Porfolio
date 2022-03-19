import java.lang.*;
public class ej54{
	public static void main(String[] args){
		String valor1=args[0];
		String valor2=args[1];
		int valor11=Integer.parseInt(valor1);
		int valor22=Integer.parseInt(valor2);
		boolean fin=valor11>=valor22;
		System.out.print("El primero es mayor o igual? "+fin);
	}
}