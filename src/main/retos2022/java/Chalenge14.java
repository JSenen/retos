import java.util.Scanner;

/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Chalenge14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("***** AMSTRONG NUMBER *****");
        System.out.print("Intro a number: ");

        double number = console.nextInt();
        String num = String.valueOf(number); // Convertimos el numero a cadena String

        int exp = (int)(Math.log10(number)+1); // Hallamos el exponente
        double total = 0;

        for (int i=0; i < exp; i++){ // Recorre los numeros elevando cada numero al exponente y sumandolo
            String numString = String.valueOf(num.charAt(i)); // Convierte el char del numero (indice) a String
            double numDouble = Double.parseDouble(numString); // Convierte el String a Double
            total = total + Potencia(numDouble, exp); // Llamada a la función calculo exponente
        }
        if (total == number){ // Compara el numero con la suma de sus expoenntes para comprobar si es AMSTRONG
            System.out.println("IT IS AN AMSTRONG NUMBER");
        }else{
            System.out.println("IT IS NOT AN AMSTRONG NUMBER");
        }

    }
    public static double Potencia (double numero, double exponente){
        return  Math.pow(numero,exponente);
    }
}
