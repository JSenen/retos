import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.

 */
public class Chalenge11 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("INTRO A STRING 1: ");
        String str1 = console.nextLine();
        System.out.println("INTRO A STRING 2: ");
        String str2 = console.nextLine();

        ArrayList<String> out1 = new ArrayList<>();
        ArrayList<String> out2 = new ArrayList<>();
        ArrayList<String> out3 = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            String ch1 = String.valueOf(str1.charAt(i));
            out1.add(i,ch1);
            out3.add(i,ch1);
        }
        for (int u = 0; u < str2.length(); u++){
            String ch2 = String.valueOf(str2.charAt(u));
            out2.add(u,ch2);
        }


        out1.removeAll(out2);
        System.out.println("CHARACTERS OF STRING 1 THAT ARE NOT IN STRING 2 "+out1);

        out2.removeAll(out3);
        System.out.println("CHARACTERS OF STRING 2 THAT ARE NOT IN STRING 1 "+out2);

    }

}
