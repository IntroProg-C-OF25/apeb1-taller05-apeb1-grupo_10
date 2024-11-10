
/** *
 * Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un artículo del cual
 * se tiene la descripción, la cantidad que se requiere y el precio unitario.
 * Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;
public class Ejercicio11_PedidosOnline {

    public static void main(String[] args) {
        int canti_request;
        double precio_uni, costototal;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("DESCRIPCION DEL PRODUCTO: ");
        String descripcion = ingreso.nextLine();
        System.out.print("CANTIDAD REQUERIDA: ");
        canti_request = ingreso.nextInt();
        System.out.print("PRECION UNITARIO: ");
        precio_uni = ingreso.nextDouble();
        costototal = canti_request * precio_uni;
        if (canti_request > 50) {
            costototal = costototal - (costototal * 0.15);
            System.out.println("EL COSTO CON DESCUENTO ES = " + costototal);
        } else {
            System.out.println("EL COSTO TOTAL DEL PRODCUTO ES = " + costototal);
        }
    }
}
/***
 * DESCRIPCION DEL PRODUCTO: Cloro
CANTIDAD REQUERIDA: 150
PRECION UNITARIO: 0,50
EL COSTO CON DESCUENTO ES = 63.75
BUILD SUCCESSFUL (total time: 36 seconds)
 */