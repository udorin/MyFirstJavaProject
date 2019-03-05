import java.util.Scanner;

public class OperatiLogice {
    //Homework 3 Java
    //Exercitiul 1
    public void checkNumbers(int number1, int number2) {

        int num1 = number1;

        int num2 = number2;
        if (num1 < num2) {
            System.out.println("Second number  is the bigger");
        } else {
            System.out.println("First number is the bigger");
        }
    }

    //Exercitiul 2
    public void checkFastTrack() {
        Scanner scan = new Scanner(System.in);
        System.out.println("introdu Textul");
        String nameF = scan.next();
        String nameFast = "FastTrack";
        if (nameF.equals(nameFast)) {
            System.out.println("Learning text comparision");

        } else {
            System.out.println("Got to try some more");
        }
    }

    //exercitiul 3\
    public void checkGreater(int firstN) {

        int number = firstN;
        if (number >= 2 && number <= 8) {
            System.out.println(number);
        } else {
            System.out.println("The number is not bettwen 2 and 8 ");
        }
    }

    //exercitiul 4
    public void checkNumberAndText(String text11, int number11) {
        Scanner scan = new Scanner(System.in);
        String text1 = "FastTrack";
        int number1 = 3;

        System.out.println("Introdu textul");
        String text = text11;


        System.out.println("introdu un numar");
        int number = number11;

        if (text1.equals(text) && number <= number1) {
            System.out.println(text + " " + number);
        } else {
            System.out.println(number + " " + text);
        }


    }

    //exericitul 5
    public void checkNumber(int n) {



        int number = n;

        if (number > 8 || number == 6) {
            System.out.println("The amount of snow this winter was(cm): " + number);
        } else {
            System.out.println("The forecast snow is(cm): " + number);
        }


    }

    //exercitiul 6
    public void checkGreaterNumber(double n) {
        Scanner scan = new Scanner(System.in);

        System.out.println("introdu un numar");
        double number = n;

        if (number > 3 && number != 4) {
            System.out.println("The number is grater then 3 but not equal to 4");
        } else if (number == 4) {
            System.out.println("the number is equal to 4");
        } else if (number < 3) {
            System.out.println("The number is smaller then 3");
        } else {
        }
    }

    //exercitiul 7
    public void checkNumberSwitchMethod(int n) {

        int number = n;

        switch (number) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
            default:
                System.out.println("Not allowed");
                break;
        }

    }

    //exercitiul 8
    public void checkEvenNumber(int n) {
     ;
        int number = n;

        if (number % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is uneven");
        }
    }

    //exercitiul 9
    public void checkEligibleForVote(int age1) {

        int age = age1;

        if (age >= 18) {
            System.out.println("you are eligible for vote");

        } else {
            System.out.println("you are not eligible for vote");

        }
    }

    //exercitiul 10
    public void checkGreaterNumer1(int first, int second, int third) {
        int number = first;
        int number1 = second;
        int number2 = third;
        System.out.println("Avem 3 numere date, Verifica care este mai mare ");
        if (number > number1 && number > number2) {
            System.out.println("the first number is the greater " + number);

        } else if (number1 > number && number1 > number2) {
            System.out.println("the second number is the greater " + number1);

        } else {
            System.out.println("The third number is the greater " + number2);
        }
    }

    //exercitiul 11
    public void readNumber(int n) {

        int number = n;
        System.out.println(number);
    }

    //exercitiul 15
    public void checkThreeNumbers(int n1, int n2, int n3) {


        int first = n1;

        int second = n2;

        int third = n3;

        if (first > second && first > third) {
            System.out.println("Maximul este" + first);
        } else if (second > first && second > third) {
            System.out.println("Maximul este " + second);
        } else {
            System.out.println("Maximul este" + third);
        }
    }

    //exercitiul 16
    public void checkFourNumbers(int n1, int n2, int n3, int n4) {

        int first = n1;

        int second = n2;

        int third = n3;

        int fourth = n4;

        if (first > second && first > third && first > fourth) {
            System.out.println("Maximul este" + first);
        } else if (second > first && second > third && second > fourth) {
            System.out.println("Maximul este " + second);
        } else if (third > first && third > second && third > fourth) {
            System.out.println("Maximul este" + third);
        } else {
            System.out.println("maximul este : " + fourth);
        }
    }

    //exercitiul 17
    public void checkFourNumbersMinimAndMaxim(int n1, int n2, int n3, int n4) {

        int first = n1;

        int second = n2;

        int third = n3;

        int fourth = n4;

        if (first > second && first > third && first > fourth) {
            System.out.println("Maximul este" + first);
        } else if (second > first && second > third && second > fourth) {
            System.out.println("Maximul este " + second);
        } else if (third > first && third > second && third > fourth) {
            System.out.println("Maximul este" + third);
        } else if (fourth > first && fourth > second && fourth > third) {
            System.out.println("maximul este " + fourth);
        } else if (first < second && first < third && first < fourth) {
            System.out.println("Minimul  este" + first);
        } else if (second < first && second < third && second < fourth) {
            System.out.println("Minimul este " + second);
        } else if (third < first && third < second && third < fourth) {
            System.out.println("Minimul  este" + third);
        } else {
            System.out.println("minimul  este " + fourth);
        }
    }

    //exercitiul 18
    public void ordonateTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("introdu primul numar");
        int first = scan.nextInt();
        System.out.println("introdu al doilea numar");
        int second = scan.nextInt();

        if (first > second){
            System.out.println(second + " " + first);
        }else{
            System.out.println(first + " " + second);
        }


    }

public void countToHundread(int number){

    System.out.println("Introdu un numar: " );

    for (int i = number; i <= 100;i++){
        System.out.println(i);
    }
}

public void countBetweenTwoNumbers(int first, int second){




    for(int i = first;i >= second;i--){
        System.out.println(i);
}

}
public void printStar(){
    for(int PatternB = 0; PatternB <=7; PatternB++) { // outer loop Pattern B
        for(int PatternBI = 6; PatternBI >= PatternB; PatternBI--) { //Inner Loop
            System.out.print("*");
        }
        System.out.println();
    }
}

//exercitiul 1
public  void equalOrLowerThen(int number ){
    int number2 = 100;
    if(number <= number2){
        System.out.println(number);

    }        }



//exercitiul 7
public  void CozaLozaWoza(){
    int count = 0;
    for(int i  = 0;i <= 110;i++){
        if(i % 3 == 0 && i % 5 == 0){
            System.out.print(" Coza Loza");
        }else if(i % 5 == 0 && i % 7 == 0){
            System.out.print(" loza woza");
        }else if(i % 7 == 0){
            System.out.print(" Woza");
        }else if( i % 3 == 0 ){
            System.out.print(" Coza ");
        }else if(i % 5 == 0 ){
            System.out.print(" loza ");
        }
        else{
            System.out.print(" " + i);
        }
        count++;
        if(i % 11 == 0){
            System.out.println(" ");
        }
    }


}
}

