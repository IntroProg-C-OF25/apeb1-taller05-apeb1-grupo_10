
/**
 * Calcular el índice de masa corporal (IMC) de una persona y clasificarla
 * en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 *
 * @author Jesús Rivas
 */
import java.util.Scanner;

public class Ejercicio8_Calculadora_de_IMC {

    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        peso = tcl.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        altura = tcl.nextDouble();
        imc = peso / (Math.pow(altura, 2));
        if (imc < 18.5) {
            System.out.println("Usted se encuentra en un bajo peso");
        } else {
            if (imc <= 24.9) {
                System.out.println("Usted se encuentra en un peso normal");
            } else {
                if (imc <= 29.9) {
                    System.out.println("Usted se encuentra con sobrepeso");
                } else {
                    System.out.println("Usted se encuentra con obesidad");
                }
            }
        }
    }

}
/**
 * *
 * run: Ingrese su peso en kg: 67 Ingrese su altura en metros: 1,60 Usted se
 * encuentra con sobrepeso
 */
/**
 * *
 * run: Ingrese su peso en kg: 60 Ingrese su altura en metros: 1,60 Usted se
 * encuentra en un peso normal
 */
/***
* run:
* Ingrese su peso en kg: 40
* Ingrese su altura en metros: 1,60
* Usted se encuentra en un bajo peso
 */
