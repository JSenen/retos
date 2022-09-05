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
        System.out.println("INTRO PHRASE (MORSE OR ALPHABET) : ");
        String phrase = console.nextLine();
        boolean alphabetic;
        if (phrase.toUpperCase().matches("[a-zA-Z_0-9\\s]*")){ /* REGEX permite conocer si texto es Alfabetico o Morse */
            System.out.println("IN NEXT LINE YOU HAVE THE MORSE PHRASE");
            alphaToMorse(phrase);
        }else {
            System.out.println("INT NEXT LINE YOU HAVE ALPHABETIC PHRASE");
            morseToAlpha(phrase);
        }



    }
    public static void alphaToMorse(String phrase){
        int longphrase =(phrase.length())-1;
        ArrayList<String> changePhrase = new ArrayList<>();
        for (int i = 0; i <= longphrase; i++){
            String word = String.valueOf(phrase.charAt(i));
            if(word.equalsIgnoreCase("A")){
                changePhrase.add(".-");
            } else if (word.equalsIgnoreCase("B")) {
                changePhrase.add("-...");
            }else if (word.equalsIgnoreCase("C")) {
                changePhrase.add("-.-.");
            }else if (word.equalsIgnoreCase("D")) {
                changePhrase.add("-..");
            }else if (word.equalsIgnoreCase("E")) {
                changePhrase.add(".");
            }else if (word.equalsIgnoreCase("F")) {
                changePhrase.add("..-.");
            }else if (word.equalsIgnoreCase("G")) {
                changePhrase.add("--.");
            }else if (word.equalsIgnoreCase("H")) {
                changePhrase.add("....");
            }else if (word.equalsIgnoreCase("I")) {
                changePhrase.add("..");
            }else if (word.equalsIgnoreCase("J")) {
                changePhrase.add(".---");
            }else if (word.equalsIgnoreCase("K")) {
                changePhrase.add("-.-");
            }else if (word.equalsIgnoreCase("L")) {
                changePhrase.add("-.--");
            }else if (word.equalsIgnoreCase("M")) {
                changePhrase.add("--");
            }else if (word.equalsIgnoreCase("N")) {
                changePhrase.add("-.");
            }else if (word.equalsIgnoreCase("Ñ")) {
                changePhrase.add("--.--");
            }else if (word.equalsIgnoreCase("O")) {
                changePhrase.add("---");
            }else if (word.equalsIgnoreCase("P")) {
                changePhrase.add(".--.");
            }else if (word.equalsIgnoreCase("Q")) {
                changePhrase.add("--.-");
            }else if (word.equalsIgnoreCase("R")) {
                changePhrase.add("-.-");
            }else if (word.equalsIgnoreCase("S")) {
                changePhrase.add("...");
            }else if (word.equalsIgnoreCase("T")) {
                changePhrase.add("-");
            }else if (word.equalsIgnoreCase("U")) {
                changePhrase.add("..-");
            }else if (word.equalsIgnoreCase("V")) {
                changePhrase.add("...-");
            }else if (word.equalsIgnoreCase("W")) {
                changePhrase.add(".--");
            }else if (word.equalsIgnoreCase("X")) {
                changePhrase.add("-..-");
            }else if (word.equalsIgnoreCase("Y")) {
                changePhrase.add("-.--");
            }else if (word.equalsIgnoreCase("Z")) {
                changePhrase.add("--.");
            }else if (word.equalsIgnoreCase("0")) {
                changePhrase.add("-----");
            }else if (word.equalsIgnoreCase("1")) {
                changePhrase.add(".----");
            }else if (word.equalsIgnoreCase("2")) {
                changePhrase.add("..---");
            }else if (word.equalsIgnoreCase("3")) {
                changePhrase.add("...--");
            }else if (word.equalsIgnoreCase("4")) {
                changePhrase.add("....-");
            }else if (word.equalsIgnoreCase("5")) {
                changePhrase.add(".....");
            }else if (word.equalsIgnoreCase("6")) {
                changePhrase.add("-....");
            }else if (word.equalsIgnoreCase("7")) {
                changePhrase.add("--...");
            }else if (word.equalsIgnoreCase("8")) {
                changePhrase.add("---..");
            }else if (word.equalsIgnoreCase("9")) {
                changePhrase.add("----.");
            }else if (word.equalsIgnoreCase(".")) {
                changePhrase.add(".-.-.-");
            }else if (word.equalsIgnoreCase(",")) {
                changePhrase.add("--..--");
            }else if (word.equalsIgnoreCase("?")) {
                changePhrase.add("..--..");
            }else if (word.equalsIgnoreCase("\"")) {
                changePhrase.add(".-..-.");
            }else if (word.equalsIgnoreCase("/")) {
                changePhrase.add("-..-.");
            }else {
                changePhrase.add("  ");
            }
        }
        for (int i=0; i <=longphrase; i++){
            System.out.print(changePhrase.get(i)+" ");
        }
    }
    public static void morseToAlpha(String phrase){
        int longPhrase = (phrase.length())-1;
        ArrayList<String> phrase2 = new ArrayList<>();
        String word = phrase.toUpperCase();
        String complet = "";
        for (int i=0; i <= longPhrase; i++){
            String letter = String.valueOf(word.charAt(i));
            if (letter.equalsIgnoreCase(".")){
                complet = complet+letter;
            }else{
                phrase2.add(complet);
            }
            complet = "";

        }
        System.out.println(phrase2);
    }



}
