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
        // Dividiomos la frase morse en palabras y la asignamos a un ArrayList
        int longPhrase = (phrase.length())-1;
        ArrayList<String> phrase2 = new ArrayList<>();
        String word = phrase.toUpperCase();
        System.out.println("FRASE: "+word);
        String complet = "";
        for (int i=0; i <= longPhrase; i++){

            String letter = String.valueOf(word.charAt(i));
            if (!letter.equalsIgnoreCase(" ")){
                complet = complet+letter;
            }else if (letter.equalsIgnoreCase("  ")){
                phrase2.add("||");
            }else{
                phrase2.add(complet);
                phrase2.add(" ");
                complet = "";
            }
        }
        // Recorremos el Array y traducimos a alfabetico
        System.out.println(phrase2);
        for (String letters:phrase2) {
            if (letters.equalsIgnoreCase(".-")){
                System.out.print("A");
            } else if (letters.equalsIgnoreCase("-...")) {
                System.out.print("B");
            } else if (letters.equalsIgnoreCase("-.-.")){
                System.out.print("C");
            } else if (letters.equalsIgnoreCase("-..")){
                System.out.print("D");
            }else if (letters.equalsIgnoreCase(".")) {
                System.out.print("E");
            }else if (letters.equalsIgnoreCase("..-.")) {
                System.out.print("F");
            }else if (letters.equalsIgnoreCase("--.")) {
                System.out.print("G");
            }else if (letters.equalsIgnoreCase("....")) {
                System.out.print("H");
            }else if (letters.equalsIgnoreCase("..")) {
                System.out.print("I");
            }else if (letters.equalsIgnoreCase(".---")) {
                System.out.print("J");
            }else if (letters.equalsIgnoreCase("-.-")) {
                System.out.print("K");
            }else if (letters.equalsIgnoreCase(".-..")) {
                System.out.print("L");
            }else if (letters.equalsIgnoreCase("--")) {
                System.out.print("M");
            }else if (letters.equalsIgnoreCase("-.")) {
                System.out.print("N");
            }else if (letters.equalsIgnoreCase("--.--")) {
                System.out.print("Ñ");
            }else if (letters.equalsIgnoreCase("---")) {
                System.out.print("O");
            }else if (letters.equalsIgnoreCase(".--.")) {
                System.out.print("P");
            }else if (letters.equalsIgnoreCase("--.-")) {
                System.out.print("Q");
            }else if (letters.equalsIgnoreCase(".-.")) {
                System.out.print("R");
            }else if (letters.equalsIgnoreCase("...")) {
                System.out.print("S");
            }else if (letters.equalsIgnoreCase("-")) {
                System.out.print("T");
            }else if (letters.equalsIgnoreCase("..-")) {
                System.out.print("U");
            }else if (letters.equalsIgnoreCase("...-")) {
                System.out.print("V");
            }else if (letters.equalsIgnoreCase(".--")) {
                System.out.print("W");
            }else if (letters.equalsIgnoreCase("-..-")) {
                System.out.print("X");
            }else if (letters.equalsIgnoreCase("-.--")) {
                System.out.print("Y");
            }else if (letters.equalsIgnoreCase("--..")) {
                System.out.print("Z");
            }else if (letters.equalsIgnoreCase("-----")) {
                System.out.print("0");
            }else if (letters.equalsIgnoreCase(".----")) {
                System.out.print("1");
            }else if (letters.equalsIgnoreCase("..---")) {
                System.out.print("2");
            }else if (letters.equalsIgnoreCase("...--")) {
                System.out.print("3");
            }else if (letters.equalsIgnoreCase("....-")) {
                System.out.print("4");
            }else if (letters.equalsIgnoreCase(".....")) {
                System.out.print("5");
            }else if (letters.equalsIgnoreCase("-....")) {
                System.out.print("6");
            }else if (letters.equalsIgnoreCase("--...")) {
                System.out.print("7");
            }else if (letters.equalsIgnoreCase("---..")) {
                System.out.print("8");
            }else if (letters.equalsIgnoreCase("----.")) {
                System.out.print("9");
            }else if (letters.equalsIgnoreCase(".-.-.-")) {
                System.out.print(".");
            }else if (letters.equalsIgnoreCase("--..--")) {
                System.out.print(",");
            }else if (letters.equalsIgnoreCase("..--..")) {
                System.out.print("?");
            }else if (letters.equalsIgnoreCase("  ")) {
                System.out.print("||");
            }

        }
    }



}
