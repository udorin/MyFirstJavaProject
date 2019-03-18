package Calculator;

import java.util.Scanner;

public class Calculator {

             public int scadere(int primulNumar, int alDoileaNumar) {
        int scadere1 = primulNumar - alDoileaNumar;
        return scadere1;
    }
    //polymorph
             public int scadere(int primulNumar, int alDoileaNumar, int alTreilea) {
        int scadere1 = primulNumar - alDoileaNumar - alTreilea;
        return scadere1;
    }



             public int inmultire(int pN, int aN) {
        int rezultatInmultire = pN * aN;
        return rezultatInmultire;
    }

    //polymorph

            public int inmultire(int pN, int aN, int NN) {
        int rezultatInmultire = pN * aN * NN;
        return rezultatInmultire;
    }



            public double impartire(double impartire1, double impartire2) {
        double rezultateImpartire = impartire1 / impartire2;
        return rezultateImpartire;


    }

    //polymorph

            public double impartire(double impartire1, double impartire2, double impartire3) {
        double rezultateImpartire = impartire1 / impartire2 / impartire3;
        return rezultateImpartire;


    }


    //Primul exercitiu
             public int adunareDouaNumere(int first, int second) {


        int first1 = first;

        int second1 = second;
        int rezAdunare = first1 + second;
        System.out.println("rezultatul adunari este: ");
        return rezAdunare;


    }
    //polymorph

             public int adunareDouaNumere(int first, int second, int third) {



        int rezAdunare = first + second + third;
        System.out.println("rezultatul adunari este: ");
        return rezAdunare;


    }



    //Exercitiul 3
            public double averageThreeNumbers(int f1, int f2, int f3) {
        System.out.println("Exercitul 3");


        int f11 = f1;

        int f22 = f2;
        System.out.println("Media este: ");
        int f33 = f3;
        int suma = f1 + f2 + f3;
        float average1 = suma / 3f;
        return average1;

    }
    //polymorph

            public double averageThreeNumbers(int f1, int f2, int f3, int f4) {
        System.out.println("Exercitul 3");



        System.out.println("Media este: ");

        int suma = f1 + f2 + f3 + f4;
        float average1 = suma / 4f;
        return average1;

    }

    //exercitiul 5
    public void printOperati(int first, int second) {
        Scanner scan = new Scanner(System.in);
        System.out.println("exercitiul 5: Printeza operatile");

        int firstNumber = first;

        int secondNumber = second;
        int adunare11 = firstNumber + secondNumber;
        int scadere11 = firstNumber - secondNumber;
        int inmultire11 = firstNumber * secondNumber;
        int impartire11 = firstNumber / secondNumber;
        int modulul11 = firstNumber % secondNumber;
        System.out.println("Rezultatul adunari este :  " + adunare11);
        System.out.println("Rezultatul scaderi este :  " + scadere11);
        System.out.println("Rezultatul inmultiri este:  " + inmultire11);
        System.out.println("Rezultatul  impartiri este : " + impartire11);
        System.out.println("Restul impartiri este : " + modulul11);
    }

    //Exercitiul 6
    public void convertFahrenheitToCelsius(int tempFahren) {

        System.out.println("exercitiul 6");

        int temp = tempFahren;
        int temp1 = temp - 32;
        float tem2 = (temp1 * 5) / 9f;
        System.out.println("temperatura in grade Celsius este " + tem2);
    }

    //Exrecitiul 7
    public void convertInchesToMeter(int inches2) {

        System.out.println("Exercitiul 7: Convert inches to meter ");

        float inches = inches2;
        float num1 = 0.0254f;
        float inchesrez = inches * num1;
        System.out.println("Rezultatul in metri este " + inchesrez);
    }

    //Exercitiul 8
    public void distance(int metri, int ora1, int minute1, int secunde2) {
        System.out.println("exercitiul 8 ");


        float metters = metri;

        int ora = ora1;

        int minute = minute1;

        int secunde = secunde2;
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
    public void squareLift(int n) {


        int number = n;
        int squareLift = number * 2;
        System.out.println("Numarul ridicat la patrat este: " + squareLift);

    }

    //exercitiul 13
    public void divisionResult(int firstNumber, int secondNumber) {


        int number = firstNumber;
        System.out.println("introdu al doilea numar");
        int number1 = secondNumber;
        float division = number / number1;
        System.out.println("resultatul impartiri este: " + division);


    }

    //exercitiul 14
    public void divisionResult1(int first, int second) {


        int number = first;
        System.out.println("introdu al doilea numar");
        int number1 = second;
        float division = number % number1;
        System.out.println("resultatul impartiri este: " + division);


    }

    //exercitiul 4
    public void sumAndAverage(int number) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            count++;
        }
        System.out.println("the sum is : " + sum);
        System.out.println("the average is " + sum / count);
    }


    public void sumOddNumbers() {
        int maxNumber, sum, counter;
        counter = 0;
        maxNumber = 100;
        sum = 0;
        while (counter <= maxNumber) {

            if (counter % 2 != 0) {
                sum += counter;

            }
            counter++;

        }
        System.out.println(sum);
        System.out.println("Average is : " + sum / 50);


    }

    //exercitiul 1
    public void sumAndAverage1(int number) {
        int count = 0;
        int sum = 0;
        int i = 0;
        while (i <= number) {
            sum += i;
            i++;
            count++;
        }
        System.out.println(sum);
        System.out.println("average : " + sum / count);

    }

    //exercitiul 2
    public void sumAndAverage2(int number) {
        int count = 0;
        int i = 0;
        int sum = 0;
        do {
            sum += i;
            i++;
            count++;

        } while (i <= number);
        System.out.println(sum);
        System.out.println("Average: " + sum / count);
    }

    //exercitiul 4
    public void sumAndAverage3(int number) {
        int count = 1;

        int sum = 0;
        for (int i = 111; i <= number; i++) {
            sum += i;
            count++;
        }
        System.out.println(sum);
        System.out.println("Count : " + count);
        System.out.println(sum);

        System.out.println("Average : " + sum / count);
    }

    //exercitiul 5
    public void divisibleWith7(int number) {
        int count = 1;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 7 == 0) {
                sum += i;
                count++;

            }

        }
        System.out.println("sum is " + sum);
        System.out.println("count is : " + count);
        System.out.println("average is " + sum / count);
    }

    //exercitiul 6
    public void fibonacciNumbers() {
        System.out.println(0);
        System.out.println(1);
        int n = 17, first = 0, second = 1;

        for (int i = 0; i <= n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
            System.out.println(second);

        }


    }

    public int averageArrays(int[] myArrays) {
        int sum = 0;


        for (int i = 0; i < myArrays.length; i++) {

            sum = sum + myArrays[i];


        }
        System.out.println("The Average of the array is: ");

        return sum / myArrays.length;

    }
}
