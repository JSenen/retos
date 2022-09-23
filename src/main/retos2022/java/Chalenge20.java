import java.util.Scanner;

/*
 * Reto #20
 * PARANDO EL TIEMPO
 * Fecha publicación enunciado: 16/05/22
 * Fecha publicación resolución: 23/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que sume 2 números y retorne su resultado pasados unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma asíncrona, es decir, sin detener la ejecución del programa principal. Se podría ejecutar varias veces al mismo tiempo.
 *
 */
public class Chalenge20 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Intro a number: ");
        int num1 = console.nextInt();
        System.out.println("Intro a second number: ");
        int num2 = console.nextInt();
        System.out.println("Intro time to wait in seconds: ");
        int seconds = console.nextInt();

        /** Paramos el proceso el tiempo indicado */

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Suma(num1,num2));
    }
    public static int Suma(int num1, int num2){
        return num1+num2;
    }
}
