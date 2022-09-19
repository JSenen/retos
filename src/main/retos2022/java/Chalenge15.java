import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Reto #15
 * ¿CUÁNTOS DÍAS?
 * Fecha publicación enunciado: 11/04/22
 * Fecha publicación resolución: 18/04/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Chalenge15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /* Recibe las fechas en formato String */

        System.out.print("Insert a date (dd/MM/yyyy): ");
        String fecha1 = console.nextLine();
        System.out.print("Insert a second date (dd/MM/yyyy): ");
        String fecha2 = console.nextLine();

        // TODO /* Convertir fechas de String a valor*/


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        LocalDate fechaInicio = LocalDate.parse(fecha1,formatter);
        LocalDate fechaFin = LocalDate.parse(fecha2,formatter);

        System.out.println(fechaInicio);
        System.out.println(fechaFin);




    }

}
