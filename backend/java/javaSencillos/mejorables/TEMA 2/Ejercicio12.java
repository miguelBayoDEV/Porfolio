/*ejercicio 12: Haz un programa en el que existan tres variables enteras: horas, minutos y segundos,
inicializadas con cualquier cantidad. El programa mostrará el número total de segundos que hay
entre las tres variables*/
import java.lang.*;
  public class Ejercicio12{
    public static void main(String[] args){
      //Declaracion de variables:
      int horas=12;
      int minutos=67;
      int segundos=97;
      int totalSegundos=0;
      //Operaciones
      totalSegundos=horas*3600+minutos*60+segundos;
      //Salida de resultados:
      System.out.println("El total de Segundos de "+horas+"h "+minutos+"' "+segundos+"'' es de "+totalSegundos);



    }
  }
