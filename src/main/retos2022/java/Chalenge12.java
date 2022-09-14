
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Chalenge12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean contin = false;

        do {
            System.out.println("ENTER A TEXT: ");
            String str1 = console.nextLine();
            System.out.println("ENTER ANOTHER TEXT: ");
            String str2 = console.nextLine();

            if (str1.length() == str2.length() ){
                contin = true;
            }else{
                contin = false;
                System.out.println("TEXT 1 AND TEXT 2 MUST HAVE THE SAME LENGHT");
            }

        }while (contin = false);

        System.out.println("ENTER A TEXT: ");
        String str1 = console.nextLine();
        System.out.println("ENTER ANOTHER TEXT: ");
        String str2 = console.nextLine();

        char ch;
        String reverse = "";


        for (int i=0; i < str2.length(); i++){
            ch = str2.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("REVERSE: "+reverse);

        if (str1.equals(str2)){
            System.out.println("TEXT 1 AND TEXT 2 ARE PALINDROME");
        }else{
            System.out.println("TEXT 1 AND TEXT 2 ARE NOT PALINDROME");
        }

    }
}
