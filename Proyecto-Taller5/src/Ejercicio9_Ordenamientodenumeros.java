
/** *
 * Ordenamiento de Tres Números: Dados tres números,
 * ordenarlos en orden ascendente
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio9_Ordenamientodenumeros {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1 = tcl.nextInt();
        System.out.print("ingrese un numero: ");
        num2 = tcl.nextInt();
        System.out.print("Ingrese un numero: ");
        num3 = tcl.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("El orden de los numeros es: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("El orden de los numeros es: " + num1 + ", " + num3 + ", " + num2);
            }
        } else {
            if (num2 <= num1 && num2 <= num3) {
                if (num1 <= num3) {
                    System.out.println("El orden de los numeros es: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("El orden de los numeros es: " + num2 + ", " + num3 + ", " + num1);
                }
            }else {
                if (num1 <= num2) {
                    System.out.println("El orden de los numeros es: " + num3 + ", " + num2 + ", " + num1);
                } else {
                    System.out.println("El orden de los numeros es: " + num3 + ", " + num1 + ", " + num2);
                }
            }
        }        
    }
}
/***
 * run:
* Ingrese un numero: 2
* ingrese un numero: 8
* Ingrese un numero: 3
* El orden de los numeros es: 2, 3, 8

 */