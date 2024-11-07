/**
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. 
 * Si son iguales, mostrar un mensaje.
 * @author Jesús Rivas
 */
import java.util.Scanner;

public class Ejercicio3_Mayor_de_tres_numeros {
    public static void main(String[] args) {
        int num1, num2, num3, n_mayor = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese un segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese un tercer número: ");
        num3 = teclado.nextInt();
        if(num1 > num2){
            if(num1 > num3)
                n_mayor = num1;
            System.out.println("El número mayor entre: " + num1 + "," + num2 + ","+ num3 + "es :"  + n_mayor);
        }else{
            if(num2 > num3){
                n_mayor = num2;
                System.out.println("El número mayor entre " + num1 + "," + num2 + ","+ num3 + " es: "  + n_mayor);
            }else{
                n_mayor = num3;
                System.out.println("El número mayor entre: " + num1 + "," + num2 + ","+ num3 + "es :"  + n_mayor);
            }
        }
    }
}
/***
 * 
 */