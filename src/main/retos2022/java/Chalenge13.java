/*
 * Reto #13
 * FACTORIAL RECURSIVO
 * Fecha publicación enunciado: 28/03/22
 * Fecha publicación resolución: 04/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.util.Scanner;

public class Chalenge13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Intro a number to calculate factorial: ");
        int number = console.nextInt();
        int factorial = 1;

        for (int i=number; i >= 1; i--){
            factorial = factorial * i;
        }

        System.out.println("Factorial "+number+"! = "+factorial);
    }
}
