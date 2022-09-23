
import java.util.Scanner;

/*
 * Reto #18
 * TRES EN RAYA
 * Fecha publicación enunciado: 02/05/22
 * Fecha publicación resolución: 09/05/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea una función que analice una matriz 3x3 compuesta por "X" y "O" y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta. O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta. Se podría representar con un vacío "", por ejemplo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Chalenge18 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[][] matriz = new String[3][3];

        /** Pedir al usuario introduzca valores de la matriz */
        System.out.println("Introduce los simbolos correspondientes a la matriz de 3x3");
        for (int i=0; i < 3; i++){
            for (int u = 0; u < 3; u++){
                System.out.print("Simbolo fila "+(i+1)+" columna "+(u+1));
                String simbolo = console.nextLine();
                matriz[i][u]=simbolo.toUpperCase();
            }
        }
        /** Dibujar matriz */
        System.out.println();
        System.out.println("MATRIZ SELECCIONADA");
        for (int i=0; i < 3; i++){
            for(int u=0; u < 3; u++){
                System.out.print("|"+matriz[i][u]+"|");
            }
            System.out.println();
        }
        /** Llamada metodo analizar resultados y mostrar el mismo*/
        System.out.println("RESULTADO DE LA MATRIZ PROPUESTA: ");
        System.out.println(Resultados(matriz));

    }
    public static String Resultados(String[][] matriz){
        /** Analizar resultados*/
        String resultado ="";
        int x=0;
        int y=0;
        if ((matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) || (matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")) || (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X"))){
            x=1;
        } else if ((matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")) || (matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")) || (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X"))) {
            x=1;
        } else if ((matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) || (matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X"))) {
            x=1;

        } else if ((matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O")) || (matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O")) || (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O"))) {
            y=1;
        }else if ((matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O")) || (matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O")) || (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O"))) {
            y = 1;
        }else if ((matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) || (matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O"))) {
            y = 1;
        }
        if (x==1 && y<1){
            resultado = "\"X\" GANAN";
        } else if (y==1 && x<1) {
            resultado = "\"O\" GANAN";

        }else{
            resultado="EMPATE";
        }

        return resultado;
    }

}
