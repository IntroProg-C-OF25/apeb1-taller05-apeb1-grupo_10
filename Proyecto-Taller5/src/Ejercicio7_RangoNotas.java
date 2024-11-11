
/** *
 * Asignar una letra (A, B, C, D) a una calificación en función de su rango
 * (A para 90-100, B para 80-89, etc.).
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio7_RangoNotas {

    public static void main(String[] args) {
        int calificacion;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE LA CALIFICACION: ");
        calificacion = ingreso.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("A");
        } else if (calificacion >= 80 && calificacion <= 90) {
            System.out.println("B");
        } else if (calificacion >= 70 && calificacion <= 80) {
            System.out.println("C");
        } else if (calificacion >= 60 && calificacion <= 70) {
            System.out.println("D");
        } else {
            System.out.println("ESTUDIANTE REPROBADO");
        }

    }

}
/***
 * INGRESE LA CALIFICACION: 97
 *A
BUILD SUCCESSFUL (total time: 5 seconds)
 */
/***
 * INGRESE LA CALIFICACION: 50
 *ESTUDIANTE REPROBADO
BUILD SUCCESSFUL (total time: 4 seconds)
 */