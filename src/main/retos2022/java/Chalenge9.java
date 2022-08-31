/*
 * Reto #9
 * CÓDIGO MORSE
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Chalenge9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("*** MENU ***");
        System.out.println("1) Alphabet to Morse");
        System.out.println("2) Morse to Alphabet");
        System.out.println("OPTION: ");
        String option = console.nextLine();
        String phrase;
        switch (option){
            case("1"):
                System.out.print("Intro phrase: ");
                phrase = console.nextLine();
                alphaToMorse(phrase.toUpperCase());
                System.out.println(phrase);
                break;
            case("2"):
                System.out.print("Intro morse: ");
                phrase = console.nextLine();
                morseToAlpha(phrase);
                break;
        }
    }
    public static ArrayList<String> alphaToMorse(String phrase){
        ArrayList<String> alphaphrase = new ArrayList<>();
        for (int i = 0; i <= phrase.length(); i++){
            String word = String.valueOf(phrase.charAt(i));
            if(word.equalsIgnoreCase("A")){
                alphaphrase.add(i,word);
            }
        }
        return alphaphrase;
    }
    public static String morseToAlpha(String phrase){
        return phrase;
    }
}
