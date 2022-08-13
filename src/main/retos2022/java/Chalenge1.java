import java.util.Scanner;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */
public class Chalenge1 {
    public static void main(String[] args) {
        String word1;
        String word2;
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter a WORD: ");
        word1 = console.next();
        System.out.println("Enter other WORD: ");
        word2 = console.next();

        if (word1.equalsIgnoreCase(word2)){
            System.out.println("THIS IS NOT AN ANAGRAM");
        }
        /** Recorremos la palabra 1 **/
        for (int i=0; i<word1.length(); i++){

            /**Comparamos la palabra 1 con la 2 caracter a caracter */
            if (!word2.contains(String.valueOf(word1.charAt(i)))){
                System.out.println("THIS IS NOT AN ANAGRAM");
                return;
            }
        }
        System.out.println("THIS IS AN ANAGRAM");
    }
}
