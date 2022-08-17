/*
 * Reto #4
 * ÁREA DE UN POLÍGONO

 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * AREA del cuadrado = lado^2
 * AREA del Triangulo = (Base x altura) / 2
 * AREA del Recangulo = base x altura
 */

import java.util.Scanner;

public class Chalenge4 {
    public static void main(String[] args) {
        String chose = "e";
        do {
            Scanner option = new Scanner(System.in);
            System.out.println("## SELECT A POLYGON ##");
            System.out.println("   1 Square");
            System.out.println("   2 Rectangle");
            System.out.println("   3 Triangle");
            System.out.println(" ---------------------");
            System.out.println("  (e) Exit");
            System.out.println(" ---------------------");
            System.out.println(" Choose a number: ");
            chose = option.next();
            switch (chose) {
                case "1":
                    System.out.println("SIDE leght: ");
                    double lado = option.nextDouble();
                    double areasq = poligono(lado, lado);
                    System.out.println(areasq);
                    break;
                case "2":
                    System.out.println("SIDE A:");
                    double ladoa = option.nextDouble();
                    System.out.println("SIDE B:");
                    double ladob = option.nextDouble();
                    double arearec = poligono((ladoa * ladob), 0);
                    System.out.println(arearec/2);
                    break;
                case "3":
                    System.out.println("BASE: ");
                    double base = option.nextDouble();
                    System.out.println("HEIGH:");
                    double heigh = option.nextDouble();
                    double aretri = poligono((base * heigh / 2) , 0);
                    System.out.println(aretri/2);
                    break;
            }
        }while(!chose.equals("e"));

    }
    public static double poligono(double base, double altura){
        double area;
        area = base * base;
        return area;
    }

}


