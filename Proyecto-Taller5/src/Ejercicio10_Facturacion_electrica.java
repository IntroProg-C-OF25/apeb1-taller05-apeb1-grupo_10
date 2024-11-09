
/**
 * Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz.
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
 * Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la tercera edad.
 *
 * @author Jesús Rivas
 */
import java.util.Scanner;

public class Ejercicio10_Facturacion_electrica {

    public static void main(String[] args) {
        double kilov_h, kilo_cons, edad, desc, v_inicial, v_total;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su costo de kilovatio/hora: ");
        kilov_h = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos en el mes: ");
        kilo_cons = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextDouble();
        v_inicial = kilov_h * kilo_cons;
        desc = (edad >= 65) ? v_inicial * 0.10 : 0;
        v_total = v_inicial - desc;
        System.out.println("Su total a pagar este mes sera de: " + v_total);
    }
}
/***
* run:
* Ingrese su costo de kilovatio/hora: 10
* Ingrese el numero de kilovatios consumidos en el mes: 20
* Ingrese su edad: 66
* Su total a pagar este mes sera de: 180.0
 */
/***
* run:
* Ingrese su costo de kilovatio/hora: 10
* Ingrese el numero de kilovatios consumidos en el mes: 20
* Ingrese su edad: 43
* Su total a pagar este mes sera de: 200.0
 */
