
/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI

 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *

 *
 */public class Chalenge2 {
    public static void main(String[] args) {
        System.out.println("FIBONNANCI SERIE");

        int n0 = 0; /** Valor inicial */
        int n1 = 1; /** Valor siguiente */
        int fib; /** Contador total de arrastre */
        for (int i = 0; i<=50; i++){
            System.out.println(n0); /** 1º el valor de la serie */
            fib = n0 + n1; /** Valor de arrastre = valor serie + el siguiente */
            n0 = n1; /** Valor inicio pasa a tomar el valor siguiente*/
            n1 = fib; /** Valor siguiente pasa a tomar el valor de fibonanci*/

        }
    }
}
