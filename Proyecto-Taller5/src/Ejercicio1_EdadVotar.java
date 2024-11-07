/***
 * Edad para Votar: Determinar si una persona es elegible para 
 * votar en función de su edad minimo 18 años = (mayor o igual a 18 años).
 * @author Jesús Rivas
 */
import java.util.Scanner;
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME EDAD: ");
        edad = tcl.nextInt();
        if(edad >= 18)
            System.out.println("SI PUEDE VOTAR");
        else
            System.out.println("NO PUEDE VOTAR");
    }
}
/***
 * run:
 * DAME EDAD: 50
 * SI PUEDE VOTAR
 */