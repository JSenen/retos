/*
 * Reto #8
 * DECIMAL A BINARIO

 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Chalenge8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("INTRO DECIMAL NUMBER: ");
        String number = console.nextLine();

        int decimal = Integer.parseInt(number);

        ArrayList<String> binary = new ArrayList<String>();
        int count = 0;

        while (decimal / 2 > 0) {
            System.out.println(decimal+" %2 ="+decimal%2);
            binary.add(count, String.valueOf((decimal%2)));
            decimal = decimal / 2;
            count++;
        }
        System.out.println(decimal+"\r");
        binary.add(count, String.valueOf(decimal));

        ArrayList<String> binary2 =new ArrayList<String>();
        int contador = 0;

        for (int i = binary.size()-1; i>=0; i--){
            binary2.add(contador, binary.get(i));
            contador++;
        }
        System.out.println("NUMBER "+number+" TO BINARY IT IS "+binary2);


    }
}
