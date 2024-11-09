
/** *
 * Descuento en Compras: Calcular el precio final de un producto con un descuento del 10%
 * si el precio original es mayor de $100; de lo contrario, no hay descuento.
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio4_Descuentocompras {

    public static void main(String[] args) {
        double product, p_final;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("DAME EL PRECIO ORIGINAL DEL PRODUCTO: ");
        product = ingreso.nextDouble();
        double desc = (product > 100) ? product * 0.10 : 0;
        p_final = product - desc;
        System.out.println("EL PRECIO FINAL DEL PRODUCTO ES DE: " + p_final);

    }
}
/*** run-single:
 *DAME EL PRECIO ORIGINAL DEL PRODUCTO: 120
 *EL PRECIO FINAL DEL PRODUCTO ES DE: 108.0
 */
