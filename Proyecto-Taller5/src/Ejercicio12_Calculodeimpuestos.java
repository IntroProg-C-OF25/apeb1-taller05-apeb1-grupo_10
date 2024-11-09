
/**
 * Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo)
 * imprima el impuesto por pagar y el precio de venta (incluido el impuesto).
 * Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%,
 * si es de Italia, 15%, y si es de USA, 8%
 *
 * @author Jesús Rivas
 */
import java.util.Scanner;

public class Ejercicio12_Calculodeimpuestos {

    public static void main(String[] args) {
        String marca, origen;
        double costo, impuestos, pr_venta;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la marca de su auto: ");
        marca = tcl.next();
        System.out.print("Ingrese el lugar de origen se su automovil: ");
        origen = tcl.next();
        System.out.print("Ingrese el costo de su automovil: ");
        costo = tcl.nextDouble();
        if ("Alemania".equals(origen)) {
            impuestos = costo * 0.20;
            pr_venta = costo + impuestos;
            System.out.println("Su autamovil " + marca + " de origen " + origen + " pagara un impuesto de $" + impuestos + " Y un total de: $" + pr_venta);
        } else {
            if ("Japon".equals(origen)) {
                impuestos = costo * 0.30;
                pr_venta = costo + impuestos;
                System.out.println("Su autamovil " + marca + " de origen " + origen + " pagara un impuesto de $" + impuestos + " Y un total de: $" + pr_venta);
            } else {
                if ("Italia".equals(origen)) {
                    impuestos = costo * 0.15;
                    pr_venta = costo + impuestos;
                    System.out.println("Su autamovil " + marca + " de origen " + origen + " pagara un impuesto de $" + impuestos + " Y un total de: $" + pr_venta);
                } else {
                    if ("USA".equals(origen)) {
                        impuestos = costo * 0.08;
                        pr_venta = costo + impuestos;
                        System.out.println("Su autamovil " + marca + " de origen " + origen + " pagara un impuesto de $" + impuestos + " Y un total de: $" + pr_venta);
                    }
                }
            }
        }

    }

}
/***
* run:
* Ingrese la marca de su auto: Ford
* Ingrese el lugar de origen se su automovil: USA
* Ingrese el costo de su automovil: 100
* Su autamovil Ford de origen USA pagara un impuesto de $8.0 Y un total de: $108.0
 */
