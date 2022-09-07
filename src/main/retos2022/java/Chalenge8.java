/*
 * Reto #8
 * DECIMAL A BINARIO

 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario.

 */

import java.util.Scanner;

public class Chalenge8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("INTRO DECIMAL NUMBER: ");
        String number = console.nextLine();

        int decimal = Integer.parseInt(number);

        String binary="";
        String result="";

        while (decimal / 2 >= 1) {
            result=result+(String.valueOf(decimal%2));
            decimal = decimal/2;
        }
        result=result+(String.valueOf(decimal/2));
        for (int i=result.length()-1; i>0; i--){
            binary=binary+(result.charAt(i));
        }
        System.out.println("NUMBER "+number+" TO BINARY IT IS "+binary);


    }
}
