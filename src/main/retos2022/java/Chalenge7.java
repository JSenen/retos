/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */


import java.util.Scanner;

public class Chalenge7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("INTRO PHRASE: ");
        String str = console.nextLine();
        str = str.toUpperCase();
        System.out.println("INTRO WORD TO COUNT: ");
        String wrd = console.nextLine();
        wrd = wrd.toUpperCase();

        int times = 0;

        /** El método startsWith() compara si la cadena comienza con los caracteres de la cadena dada.
         * Para i = 0 el método str.substring(0) obtiene una subcadena en el índice 0 y comprueba si startsWith(wrd)
         *  y si coincide, incrementará times en 1; de lo contrario, no aumentará.
         */

        for (int i=0; i<=str.length(); i++){
            if (str.substring(i).startsWith(wrd)){
                times ++;
            }
        }
        System.out.println("Word "+wrd+" it's "+times+" times in the phrase");



    }
}
