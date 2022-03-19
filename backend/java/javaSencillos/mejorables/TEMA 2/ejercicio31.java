import java.lang.*;
    public class ejercicio31{
        public static void main (String [] args){
		  // datos del enunciado
          boolean encendida=true;
          int porcentajeTinta=20;          
          int foliosImpresora=1;
          int foliosTrabajo=0;
		  
		  // cálculos
		  boolean tinta=porcentajeTinta>0;
          boolean folios=foliosImpresora>=foliosTrabajo;
          boolean resultado=encendida&&tinta&&folios;
          System.out.println("¿El usuario puede imprimir? " +resultado);  
        }
    }