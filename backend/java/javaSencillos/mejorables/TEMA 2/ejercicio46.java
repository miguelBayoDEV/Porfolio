import java.lang.*;

public class ejercicio46 {
    public static void main(String[] args) {

        // ponemos los suspensos; de cada alumno
        int antonioSuspensas = 3;
        int jaimeSuspensas = 8;
        int pedroSuspensas = 2;
        int manuelSuspensas = 0;
        int maiteSuspensas = 0;

        // creamos un boolean que nos diga si cada alumno aprueba el curso
        boolean antonioAprueba = antonioSuspensas == 0;
        boolean jaimeAprueba = jaimeSuspensas == 0;
        boolean pedroAprueba = pedroSuspensas == 0;
        boolean manuelAprueba = manuelSuspensas == 0;
        boolean maiteAprueba = maiteSuspensas == 0;

        // Mostramos por pantalla el nombre del alumno y si ha suspendido
        System.out.println("¿Antonio ha aprobado?" + antonioAprueba);
        System.out.println("¿Jaime ha aprobado?" + jaimeAprueba);
        System.out.println("¿Pedro ha aprobado?" + pedroAprueba);
        System.out.println("¿Manuel ha aprobado?" + manuelAprueba);
        System.out.println("¿Maite ha aprobado?" + maiteAprueba);

        // imprimimos el numero media de asignaturas suspensas
        int nuMedioSuspensas = (antonioSuspensas + jaimeSuspensas + maiteSuspensas + manuelSuspensas + pedroSuspensas)/ 5;
        System.out.println("El numero medio de asisgnaturas suspensas son " + nuMedioSuspensas);

        // imprimimos si todos los alumnos van a pasar de curso
        boolean resultado = antonioAprueba && jaimeAprueba && pedroAprueba && manuelAprueba && maiteAprueba;
        System.out.println("¿Van a pasar todos los alumnos de curso? " + resultado);

        // Imprimimos si hay un alumno con mas de 4 suspensos

        boolean antonio4 = antonioSuspensas > 4;
        boolean jaime4 = jaimeSuspensas > 4;
        boolean pedro4 = pedroSuspensas > 4;
        boolean manuel4 = manuelSuspensas > 4;
        boolean maite4 = maiteSuspensas > 4;
        boolean suspenso4 = ((antonio4) || (jaime4) || (pedro4) || (manuel4) || (maite4));

        System.out.println("¿Hay algun alumno con mas de 4 suspensos? " + suspenso4);
    }
}