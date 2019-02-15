import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Homework Java 1.

        //Exercitiul 1 .

//       System.out.println("Hello");
//        System.out.println("Dorin");
//
//
//       // exercitiul 2
//        System.out.println("The addition of 7 and 8 is : " + (7 +8));
//
//        exercitiul 3
//
//         int x = 10;
//        int y = 2;
//        int divide = x / y;
//        System.out.println(divide);
//        //sau
//        System.out.println(10 / 2);
//
//        exercitiul 4.
//        int a = -5 + 8 * 6;
//        System.out.println("The resultat from a is : " + a);
//        int b = (55 + 9) % 9;
//        System.out.println("The resultat from b is : " + b);
//        float c = (-3 * 5) / 8f;
//        double cfinal = c + 20;
//
//
//        System.out.println("The resultat from cfinal  is : "+ cfinal);
//        int d = (5 + ((15 / 3) * 2)) - (8 % 3);
//        System.out.println("The resultat from d is " + d);*/


        // int resultatScadere = scadere(5, 7);
        //System.out.println(resultatScadere);

        // int rezInmultire = inmultire(4, 6);
        //double rezImpartire = impartire(11, 5);
        //System.out.println(rezInmultire);
        //System.out.println(rezImpartire);


//Homework JAVA 2
        //Primul Exercitiu
        int rezAdunare1 = adunareDouaNumere();
        System.out.println(rezAdunare1);


        // Al doilea exercitiu
        System.out.println("Al doilea exercitiu");

        printeazaJava();

        //exercitiul 3 Average
        double retAverage = averageThreeNumbers();

        System.out.println("Media este :  " + retAverage);
        //Exercitiul 4
        printPattern();

        //Exercitiul 5;
        printOperati();
        //Exercitiul 6
        convertFahrenheitToCelsius();
        //Exercitiul 7
        convertInchesToMeter();
        //Exercitiul 8
        distance();
            //homework Objects
        ///Object dog1
        Dog dog1 = new Dog();
        dog1.nume = "Rex";
        dog1.greutate = 10;
        dog1.rasa ="Bichon";
        dog1.varsta = 12;
        dog1.doarme();

        //object dog 2

        Dog dog2 = new Dog();
        dog2.nume = "Rex";
        dog2.greutate = 10;
        dog2.rasa ="Bichon";
        dog2.varsta = 12;


        //object Human
        Human human1 = new Human();
        human1.nume ="Andreea";
        human1.culoareOchi = "Caprui";
        human1.culoarePar = "Brunet";
        human1.greutate = 56;
        human1.inaltime = 1.65;
        human1.sex = "Feminin";


        //object MedicalStaff
        MedicalStaff medic = new MedicalStaff();
        medic.nume ="Andrei";
        medic.culoareOchi = "Caprui";
        medic.culoarePar = "Brunet";
        medic.greutate = 70;
        medic.inaltime = 1.70;
        medic.sex = "Masculin";


    }

//    public static int scadere(int primulNumar, int alDoileaNumar) {
//        int scadere1 = primulNumar - alDoileaNumar;
//        return scadere1;
//
//    }
//
//    public static int inmultire(int pN, int aN) {
//        int rezultatInmultire = pN * aN;
//        return rezultatInmultire;
//    }
//
//    public static double impartire(double impartire1, double impartire2) {
//        double rezultateImpartire = impartire1 / impartire2;
//        return rezultateImpartire;


    //    }
//Primul exercitiu
    public static int adunareDouaNumere() {
        System.out.println("Primul Exercitiu \n  Adunarea a doua numere din input");
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdu primul numar: ");
        int first1 = scan.nextInt();
        System.out.println("Introdu al doilea numar");
        int second = scan.nextInt();
        int rezAdunare = first1 + second;
        System.out.println("rezultatul adunari este: ");
        return rezAdunare;


    }

    //Al doilea exercitiu
    public static void printeazaJava() {
        System.out.println("    J      a        V      V         a");
        System.out.println("    J     a a        V    V         a a");
        System.out.println(" J  J    aaaaa        V  V         aaaaa           ");
        System.out.println("  JJ    a     a         V         a     a              ");
    }

    //Exercitiul 3
    public static double averageThreeNumbers() {
        System.out.println("Exercitul 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int f1 = scan.nextInt();
        System.out.println("Introdu al doilea numar");
        int f2 = scan.nextInt();
        System.out.println("Introdu al treilea numar");
        int f3 = scan.nextInt();
        int suma = f1 + f2 + f3;
        float average1 = suma / 3f;
        return average1;

    }

    //Exercitiul 4
    public static void printPattern() {
        System.out.println("Exercitiul 4");
        System.out.println("      +\"\"\"\"\"+                         ");
        System.out.println("    [ | o o | ]               ");
        System.out.println("      |  ^  |                ");
        System.out.println("      |     |                ");
        System.out.println("      | '-' |               ");
        System.out.println("      +-----+                          ");


    }

    //exercitiul 5
    public static void printOperati() {
        Scanner scan = new Scanner(System.in);
        System.out.println("exercitiul 5: Printeza operatile");
        System.out.println("Introdu primul numar: ");
        int a1 = scan.nextInt();
        System.out.println("Introdu al doilea numar :");
        int a2 = scan.nextInt();
        int adunare11 = a1 + a2;
        int scadere11 = a1 - a2;
        int inmultire11 = a1 * a2;
        int impartire11 = a1 / a2;
        int modulul11 = a1 % a2;
        System.out.println("Rezultatul adunari este :  " + adunare11);
        System.out.println("Rezultatul scaderi este :  " + scadere11);
        System.out.println("Rezultatul inmultiri este:  " + inmultire11);
        System.out.println("Rezultatul  impartiri este : " + impartire11);
        System.out.println("Restul impartiri este : " + modulul11);
    }

    //Exercitiul 6
    public static void convertFahrenheitToCelsius() {
        Scanner scan = new Scanner(System.in);
        System.out.println("exercitiul 6");
        System.out.println("Introdu temperatura in Fahrenheit: ");
        int temp = scan.nextInt();
        int temp1 = temp - 32;
        float tem2 = (temp1 * 5) / 9f;
        System.out.println("temperatura in grade Celsius este " + tem2);
    }

    //Exrecitiul 7
    public static void convertInchesToMeter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Exercitiul 7: Convert inches to meter ");
        System.out.println("Introdu inches : ");
        float inches = scan.nextFloat();
        float num1 = 0.0254f;
        float inchesrez = inches * num1;
        System.out.println("Rezultatul in metri este " + inchesrez);
    }

    //Exercitiul 8
    public static void distance() {
        System.out.println("exercitiul 8 ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu distanta in metri: ");
        float metters = scan.nextFloat();
        System.out.println("introdu ora:");
        int ora = scan.nextInt();
        System.out.println("introdu minutele");
        int minute = scan.nextInt();
        System.out.println("introdu secundele: ");
        int secunde = scan.nextInt();
        int convertOraToSeconds = ora * 3600;
        int convertMinutesToSeconds = minute * 60;
        int totalTime = convertOraToSeconds + convertMinutesToSeconds + secunde;
        float metriSecunda =  metters / totalTime;
        float kmPerHour = (float) (metters * 3.600000);
        //convert din metru in mila roamana
        float convertMetriToMiles = (float) (metters * 0.00062137);


        float milesPerHour = convertMetriToMiles * 3600;


        System.out.println("Viteza in metri pe secunda este : " + metriSecunda);
        System.out.println("Viteza in kilometri pe ora este: " + kmPerHour);
        System.out.println("Daca dinstanta este sub 1609 metri vorbim de yard");
        System.out.println(" Viteza in mile pe ora este : " + milesPerHour);

    }

}


