import java.lang.*;
public class ejercicio14{
    public static void main (String [] args){
        //ponemos variables
        double padrino=3.5;
        padrino=padrino*2;//por dos dias
        double odisea=2.95;
        odisea=odisea*2;//por dos dias
		double precio=padrino+odisea;
        System.out.println("Para dos dias necesita pagar por El padrino y por Odisea 2001: "+(precio)+" euros.");
        //miramos si podemos pagar con 5 euros
        boolean suficiente=precio<=5;
        System.out.println("¿Con 5 euros tiene suficiente ?"+suficiente );
    }
}