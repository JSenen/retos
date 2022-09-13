import java.util.ArrayList;
import java.util.Scanner;

/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */
public class Chalenge10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> eq1 = new ArrayList<>();

        System.out.println("INTRO A EQUATION: ");
        String equation = console.nextLine();

        for (int i=0; i < equation.length(); i++){
            eq1.add(String.valueOf(equation.charAt(i)));
        }

        int bra = 0;
        int corc = 0;

        for (int i = 0; i < eq1.size(); i++){
            if (eq1.get(i).equals("[") || eq1.get(i).equals("]")){
                bra++;
            }else if (eq1.get(i).equals("(") || eq1.get(i).equals(")")){
                corc++;
            }
        }
        System.out.println(bra);
        System.out.println(corc);
        if ((bra % 2 == 0) && (corc % 2 == 0)){
            System.out.println("EQUATION BALANCED");
        }else{
            System.out.println("EQUATION NOT BALANCED");
        }
    }
}
