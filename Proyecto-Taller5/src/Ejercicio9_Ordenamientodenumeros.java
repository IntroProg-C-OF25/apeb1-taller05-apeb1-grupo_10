
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
        Scanner ingreso = new Scanner(System.in);
        System.out.print("DAME EL PRIMER NUMERO: ");
        num1 = ingreso.nextInt();
        System.out.print("DAME EL SEGUNDO NUMERO: ");
        num2 = ingreso.nextInt();
        System.out.print("DAME EL TERCER NUMERO: ");
        num3 = ingreso.nextInt();
        if (num1 > num2) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
            if (num1 > num3) {
                num1 = num1 + num3;
                num3 = num1 - num3;
                num1 = num1 - num3;
                if (num2 > num3) {
                    num2 = num2 + num3;
                    num3 = num2 - num3;
                    num2 = num2 - num3;
                    System.out.println("LOS NUMEROS ORDENADOS DE FORMA ASCENDENTE SON = " + num1 + num2 + num3);
                }
            }
        }
    }
}
/***
 * DAME EL PRIMER NUMERO: 9
DAME EL SEGUNDO NUMERO: 6
DAME EL TERCER NUMERO: 3
LOS NUMEROS ORDENADOS DE FORMA ASCENDENTE SON = 369
BUILD SUCCESSFUL (total time: 10 seconds)

 */