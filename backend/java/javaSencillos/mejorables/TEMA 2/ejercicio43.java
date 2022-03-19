import java.lang.*;
public class ejercicio43{
    public static void main(String[]args){
       //pedimos en pantalla un numero, que nos devuelve un int
	   
       int annoNumero=Integer.parseInt(args[0]);
       boolean annoPositivo=annoNumero>0;
       System.out.println(" ¿El numero es positivo?" + annoPositivo);
        //Realizamos los calculos para saber si el numero es bisiesto
		
        boolean multiplo400=annoNumero%400==0;
        boolean multiplo4=annoNumero%4==0;
        boolean multiplo100=annoNumero%100==0;
        boolean resultado=multiplo400||(multiplo4&&(!multiplo100));
        //imprimimos por pantalla si el numero es bisiesto
		
       System.out.println("¿El año introducido es bisiesto?" +resultado );
    }
}