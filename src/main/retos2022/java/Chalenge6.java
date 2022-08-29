/*
 * Reto #6
 * INVIRTIENDO CADENAS

 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Chalenge6 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("INSERT A PHRASE OR WORD: ");
        String word = console.nextLine();


        ArrayList<String> words = new ArrayList<>();
        int maxlenght = word.length()-1;

        for (int i = maxlenght; i >= 0; i--){
            words.add(String.valueOf(word.charAt(i)));
        }
        for(int i = 0; i <= maxlenght; i++){
            System.out.print(words.get(i));
        }
    }
}
