/*** Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10%
 * si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar un solución que pida como datos de entrada 
 * el número de días y el precio diario de la habitación y luego calcule
 * e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author Carlitos Ismael
 */
import java.util.Scanner;
public class Ejercicio13_SistemaReservashoteleras {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int dias;
        double precio_Diario, descuento, subtotal,total;
        System.out.print("INGRESE EL TIEMPO DE ESTADIA: ");
        dias = ingreso.nextInt();
        System.out.print("INGRESE EL PRECIO A DIARIO DE HABITACION: ");
        precio_Diario = ingreso.nextDouble();
        subtotal = dias * precio_Diario;
        descuento = 0;
        if(dias > 15){
            descuento = subtotal * 0.20;
        }else if(dias > 10){
            descuento = subtotal * 0.15;
        }else if(dias > 5){
            descuento = subtotal * 0.10;
        }
        total = subtotal - descuento;
        System.out.println("EL SUBTOTAL ES = " + subtotal);
        System.out.println("DESCUENTO = " + descuento);
        System.out.println("TOTAL A PAGAR = " + total);
    }
}
/***
 * INGRESE EL TIEMPO DE ESTADIA: 5
 *INGRESE EL PRECIO A DIARIO DE HABITACION: 10
 *EL SUBTOTAL ES = 50.0
 *DESCUENTO = 0.0
 *TOTAL A PAGAR = 50.0
 *BUILD SUCCESSFUL (total time: 8 seconds)
 */