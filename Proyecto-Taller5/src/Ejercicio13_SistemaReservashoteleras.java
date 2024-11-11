
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
