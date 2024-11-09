
/**
 *Clasificar a una persona en una categoría de edad (niño, adolescente, adulto)
 * en función de su edad.
 *
 * @author Jesús Rivas
 */
import java.util.Scanner;

public class Ejercicio6_CategoriadeEdad {

    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad <= 12) {
            System.out.println("Usted es un niño");
        } else {
            if (edad < 18) {
                System.out.println("Usted es un adolescente");
            } else {
                System.out.println("Usted es un adulto");
            }
        }

    }

}
/**
 * *
 * run: Ingrese su edad: 20 Usted es un adulto
 */
/**
 * *
 * run: Ingrese su edad: 10 Usted es un niño
 */
/***
* run:
* Ingrese su edad: 16
* Usted es un adolescente
 */
