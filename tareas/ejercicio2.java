/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”
 */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es el nombre de la primera persona que quiere ser saludada?");
        int nombre1 = sc.nextInt();

        System.out.println("¿Cuál es el nombre de la segunda persona que quiere ser saludada?");
        int nombre2 = sc.nextInt();

        System.out.println("¿Cuál es el nombre de la tercera persona que quiere ser saludada?");
        int nombre3 = sc.nextInt();

        System.out.println("¿Cuál es el nombre de la cuarta persona que quiere ser saludada?");
        int nombre4 = sc.nextInt();

        System.out.println("¡Hola " +nombre1 ", " +nombre2 ", " +nombre3 ", " +nombre4 "!");
    }
}
