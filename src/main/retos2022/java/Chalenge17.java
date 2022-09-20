/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.lang.reflect.Array;
import java.util.Scanner;

public class Chalenge17 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean salir = false;
        do {
            System.out.println("Introduce pista (- SUELO , | VALLA) separado por comas");
            String pistaGame = console.nextLine();
            String[] pista= pistaGame.split(",");

            System.out.println("Introduce movimiento atleta (run,jump) separado por comas");
            String atletaGame = console.nextLine();
            String[] atleta = atletaGame.split(",");

            if (pista.length == atleta.length){
                System.out.println(Compare(pista,atleta));
                salir = true;
            }
        }while (salir = false);

    }
    public static String Compare(String[] pista, String[] atleta){
        System.out.println(pista);
        System.out.println(atleta);
        int contador = 0;
        String resultado;
        for (int i = 0; i < pista.length; i++){
            if (((pista[i] == "-") && (atleta[i] == "run")) || ((pista[i]=="|") && (atleta[i]=="jump"))){
                contador++;
            }
        }
        if(contador == pista.length){
            return resultado = "SUPERA PISTA";
        }else {
            return resultado = "NO SUPERA PISTA";
        }


    }
}
