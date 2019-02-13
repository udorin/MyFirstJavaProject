import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Homework Java 1.

        //Exercitiul 1 .
       /*
        System.out.println("Hello");
        System.out.println("Dorin");


        //exercitiul 2
        System.out.println("The addition of 7 and 8 is : " + (7 +8));

        //exercitiul 3

        int x = 10;
        int y = 2;
        int divide = x / y;
        System.out.println(divide);
        //sau
        System.out.println(10 / 2);

        //exercitiul 4.
        int a = -5 + 8 * 6;
        System.out.println("The resultat from a is : " + a);
        int b = (55 + 9) % 9;
        System.out.println("The resultat from b is : " + b);
        float c = (-3 * 5) / 8f;
        double cfinal = c + 20;


        System.out.println("The resultat from cfinal  is : "+ cfinal);
        int d = (5 + ((15 / 3) * 2)) - (8 % 3);
        System.out.println("The resultat from d is " + d);
        */


        int resultatScadere = scadere(5, 7);
        System.out.println(resultatScadere);

        int rezInmultire = inmultire(4, 6);
        System.out.println(rezInmultire);
        double rezImpartire = impartire(11, 5);
        System.out.println(rezImpartire);





    }

    public static int scadere(int primulNumar, int alDoileaNumar) {
        int scadere1 = primulNumar - alDoileaNumar;
        return scadere1;

    }

    public static int inmultire(int pN, int aN) {
        int rezultatInmultire = pN * aN;
        return rezultatInmultire;
    }

    public static double impartire(double impartire1, double impartire2) {
        double rezultateImpartire = impartire1 / impartire2;
        return rezultateImpartire;
    }

}
