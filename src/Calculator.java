import java.util.Scanner;

public class Calculator {

    public  int scadere(int primulNumar, int alDoileaNumar) {
        int scadere1 = primulNumar - alDoileaNumar;
       return scadere1;
   }
    public  int inmultire(int pN, int aN) {
        int rezultatInmultire = pN * aN;
        return rezultatInmultire;
    }
    public  double impartire(double impartire1, double impartire2) {
        double rezultateImpartire = impartire1 / impartire2;
        return rezultateImpartire;


           }
           //Primul exercitiu
    public  int adunareDouaNumere() {
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

    //Exercitiul 3
    public  double averageThreeNumbers() {
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

    //exercitiul 5
    public  void printOperati() {
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
    public  void convertFahrenheitToCelsius() {
        Scanner scan = new Scanner(System.in);
        System.out.println("exercitiul 6");
        System.out.println("Introdu temperatura in Fahrenheit: ");
        int temp = scan.nextInt();
        int temp1 = temp - 32;
        float tem2 = (temp1 * 5) / 9f;
        System.out.println("temperatura in grade Celsius este " + tem2);
    }
    //Exrecitiul 7
    public  void convertInchesToMeter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Exercitiul 7: Convert inches to meter ");
        System.out.println("Introdu inches : ");
        float inches = scan.nextFloat();
        float num1 = 0.0254f;
        float inchesrez = inches * num1;
        System.out.println("Rezultatul in metri este " + inchesrez);
    }

    //Exercitiul 8
    public  void distance() {
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
        float metriSecunda = metters / totalTime;
        float kmPerHour = (float) (metters * 3.600000);
        //convert din metru in mila roamana
        float convertMetriToMiles = (float) (metters * 0.00062137);


        float milesPerHour = convertMetriToMiles * 3600;


        System.out.println("Viteza in metri pe secunda este : " + metriSecunda);
        System.out.println("Viteza in kilometri pe ora este: " + kmPerHour);
        System.out.println("Daca dinstanta este sub 1609 metri vorbim de yard");
        System.out.println(" Viteza in mile pe ora este : " + milesPerHour);

    }
    //homowork 3
    //exercitiul 12
    public void squareLift(){
        Scanner scan = new  Scanner(System.in);
        System.out.println("introdu un numar");
        int number = scan.nextInt();
        int squareLift = number * 2;
        System.out.println("Numarul ridicat la patrat este: " + squareLift);

    }

    //exercitiul 13
    public void divisionResult(){
        Scanner scan = new Scanner(System.in);
        System.out.println("introdu primul numar");
        int number = scan.nextInt();
        System.out.println("introdu al doilea numar");
        int number1 = scan.nextInt();
        float division = number / number1;
        System.out.println("resultatul impartiri este: " + division);



    }

    //exercitiul 14
    public void divisionResult1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("introdu primul numar");
        int number = scan.nextInt();
        System.out.println("introdu al doilea numar");
        int number1 = scan.nextInt();
        float division = number % number1;
        System.out.println("resultatul impartiri este: " + division);



    }












}
