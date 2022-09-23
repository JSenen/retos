/*
 * Reto #19
 * CONVERSOR TIEMPO
 * Fecha publicación enunciado: 09/05/22
 * Fecha publicación resolución: 16/05/22
 * Dificultad: FACIL
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 *

 */

import java.util.Scanner;

public class Chalenge19 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        /** Intro dates*/


        System.out.print("Intro DAYS: ");
        int days = console.nextInt();
        System.out.print("Intro HOURS: ");
        int hours = console.nextInt();
        System.out.print("Intro MINUTS: ");
        int minuts = console.nextInt();
        System.out.print("Intro SECONDS: ");
        int seconds = console.nextInt();

        System.out.println(days+" DAYS "+hours+" HOURS "+minuts+" MINUTS "+seconds+" SECONDS = "+Conversor(days,hours,minuts,seconds)+" MILISECONDS");

    }
    public static int Conversor(int days, int hours, int minuts, int seconds){
        int miliseconds;
        int dayMili = days*24*60*60*1000;
        int hoursMili = hours*60*60*1000;
        int minutsMili = minuts*60*1000;
        int secondsMili = seconds*1000;
        miliseconds = dayMili+hoursMili+minutsMili+secondsMili;
        return miliseconds;
    }
}
