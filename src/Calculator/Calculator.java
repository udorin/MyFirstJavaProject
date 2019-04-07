package Calculator;

import java.util.Scanner;

public class Calculator {

             public int  subtraction(int firstNumber, int secondNumber) {
                 System.out.println("The result of subtraction is :");

       return firstNumber - secondNumber;
    }
    //polymorph
    public int subtraction(int firstNumber, int secondNumber,  int thirdNumber) {

        return firstNumber - secondNumber - thirdNumber;
    }



             public int multiplication(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    //polymorph

    public int multiplication(int firstNumber, int secondNumber, int thirdNumber) {

        return firstNumber * secondNumber * thirdNumber;
    }



            public double division(double firstNumber, double secondNumber) {

        return firstNumber / secondNumber;


    }

    //polymorph

    public double division(double firstNumber, double secondNumber, double thirdNumber) {

        return firstNumber / secondNumber / thirdNumber;


    }


    //Primul exercitiu
             public int addition(int first, int second) {



        System.out.println("The result of Addition is :  ");
        return first + second  ;


    }
    //polymorph

    public int addition(int first, int second, int third) {



        System.out.println("rezultatul adunari este: ");
        return first + second + third ;


    }


    //Exercitiul 3
            public double averageNumbers(int n1, int n2, int n3) {
        System.out.println("Exercitul 3");



        System.out.println("Media este: ");

        return (n1 + n2 + n3)/3;
    }
    //polymorph

    public double averageNumbers(int n1, int n2, int n3, int n4) {
        System.out.println("Exercitul 3");



        System.out.println("Media este: ");

        return (n1 + n2 + n3 + n4)/4;
    }

    //exercitiul 5
    public void printOperation(int first, int second) {
        Scanner scan = new Scanner(System.in);
        System.out.println("exercitiul 5: Printeza operatile");


        int adittion = first + second ;
        int subtraction = first - second  ;
        int multiplication = first * second;
        int division = first / second;
        int module =first % second;
        System.out.println("Rezultatul adunari este :  " + adittion);
        System.out.println("Rezultatul scaderi este :  " + subtraction);
        System.out.println("Rezultatul inmultiri este:  " + multiplication);
        System.out.println("Rezultatul  impartiri este : " + division);
        System.out.println("Restul impartiri este : " + module);
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
