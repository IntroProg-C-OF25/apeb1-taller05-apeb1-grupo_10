
/** * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial.
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio5_añoBisiesto {

    public static void main(String[] args) {
        int year;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE EL AÑO: ");
        year = ingreso.nextInt();
        if (year % 4 == 0) {
            System.out.println("EL AÑO ES BISIESTO.¡ES UN AÑO ESPECIAL = " + year);
        } else {
            System.out.println("EL AÑO NO ES BISIESTO = " + year);
        }
    }
}
/**
 * *
 * INGRESE EL A�O: 2024 EL A�O ES BISIESTO.�ES UN A�O ESPECIAL = 2024 BUILD
 * SUCCESSFUL (total time: 6 seconds)
 */
/***
 * INGRESE EL A�O: 2023
EL A�O NO ES BISIESTO = 2023
BUILD SUCCESSFUL (total time: 4 seconds)
 */
