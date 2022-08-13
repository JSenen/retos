/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?

 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 * Los números primos son aquellos que solo son divisibles entre ellos mismos y el 1, es decir,
 * que si intentamos dividirlos por cualquier otro número, el resultado no es entero
 *

 */
    public class Chalenge3 {
    public static void main(String[] args) {
        System.out.println("PRIME NUMBERS");
        int numero;

        for (int i = 0; i <= 100; i++) {
            numero = i;
            if (esPrimo(i)){
                System.out.println("Number "+i+" ES PRIMO");
            }else{
                System.out.println("Number "+i+" NO ES PRIMO");
            }
        }
    }

    public static boolean esPrimo(int numero){
        int contador = 0;
        if (numero<=1){
            return false;
        }else{
            for (int i=1; i <= numero; i++){
                if (numero % i == 0){
                    contador = contador +1;
                }else{
                    contador = contador;
                }
            }
            if (contador > 2){
                return false;
            }else{
                return true;
            }
        }

    }
}