/*
 * Signo del zodíaco
 * Crea que al introducir el año que naciste te devuelva
tu signo del zodíaco chino.
Para conocer el signo del horóscopo chino, debemos
dividir el año de nacimiento entre 12. El resto, entre
0 y 11, está asociado a un signo según la siguiente
tabla:
0 -Mono
1- Gallo
2 -Perro
2 - Cerdo
4 -Rata 
5- Buey 
6 - Tigre
7 - Conejo
8 - Dragón
9 -Serepiente
10- Caballo
11 - Cabra 
 */

 import java.util.Scanner;

 public class ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Cual es tu fecha de nacimiento?");
        Scanner sc = new Scanner(System.in);
        int fecha = sc.nextInt();
        int numero = fecha % 12;
        switch (numero) {
            case 0: horoscopo = "Mono"; break;
            case 1: horoscopo = "Gallo"; break;
            case 2: horoscopo = "Perro"; break;
            case 3: horoscopo = "Cerdo"; break;
            case 4: horoscopo = "Rata"; break;
            case 5: horoscopo = "Buey"; break;
            case 6: horoscopo = "Tigre"; break;
            case 7: horoscopo = "Conejo"; break;
            case 8: horoscopo = "Dragón"; break;
            case 9: horoscopo = "Serpiente"; break;
            case 10: horoscopo = "Caballo"; break;
            case 11: horoscopo = "Cabra"; break;   
        }
        System.out.println("Signo del zodiaco: " +horoscopo);
    }
 }
