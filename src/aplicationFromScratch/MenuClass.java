package aplicationFromScratch;

import Calculator.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuClass {

    Calculator calc = new Calculator();


    String name;
    int chooseOption;
    int numberChosen;
    int arrayNumber;



    public void checkUser(){
        boolean checkOption = true;
        String userTrue =  "user";
        String passwordTrue = "user1";
    do{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the user name");
        String user = scan.next();
        System.out.println("Enter the password: ");
        String password = scan.next();

           if(user.contains(userTrue) && password.contains(passwordTrue)){
               checkOption = false;

               introductionMeniu();
               basicMeniu();
           }else{
               System.out.println("Try again ");
           }
       }while (checkOption);





    }


    public String introductionMeniu() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello\n" +
                "My name is Dodo\n" +
                "What is your name?");

        name = scan.nextLine();

        return name;

    }

    ;

    public void  basicMeniu() {

        boolean check = true;


        System.out.println(" Thanks for your name\n" +
                "Now lets do something useful " + name);
        System.out.println(" Please select an option from the list below\n" +
                "1.Calculator\n" +
                "2.Arrays\n" +
                "3.Lists\n" +
                "0.Quit");


        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Introdu optiunea aleasa: ");
                chooseOption = scan.nextInt();
                check = false;

            } catch (InputMismatchException e) {
                System.err.println("You must introduce a number, dont be a jackass");

            }
        } while (check);
        //Check Option
        checkOption();
        //make oparation
        makeOperation();


    }

    public int checkOption() {

        boolean check = true;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                switch (chooseOption) {
                    case 1:
                        System.out.println("Please choose an option: \n" +
                                "1.Adition\n" +
                                "2.Subtraction\n" +
                                "3.Multiplication\n" +
                                "4.Division\n" +
                                "0.Quit\n"
                        );
                        numberChosen = scan.nextInt();

                        check = false;
                        break;

                    case 2:
                        System.out.println("The Array section will be implemented in the future , Dont worry!\n" +
                                "5.Go back\n" +
                                "0.Exit");
                       do {
                           try {
                               Scanner scan1 = new Scanner(System.in);
                               numberChosen = scan1.nextInt();
                               check = false;
                           } catch (InputMismatchException e) {
                               System.out.println("Please enter a number not a word\n" +
                                       "You can enter only 5 and 0");
                           }

                       } while ( check);
                       goBackFromArray();

                      break;



                    case 3:
                        System.out.println("Will be implemented in the future ");
                        System.exit(0);
                        break;
                    case 0:
                        System.exit(0);

                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter the option , you need to enter a number from 1 to 4!!!!!!");
            }
        } while (check);

        return numberChosen;

    }

    public void  makeOperation() {
        int firstNumber;
        int secondNumber;
        boolean checkValue = true;
        boolean checkValue1 = true;


        switch (numberChosen) {

            case 1:


                do {
                    try {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Introduce the first number");
                        firstNumber = scan.nextInt();
                        checkValue = false;
                        System.out.println("introduce the second number :");
                        secondNumber = scan.nextInt();
                        checkValue1 = false;

                        System.out.println(calc.addition(firstNumber, secondNumber));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter a number not a word or string!!!");
                    }
                } while (checkValue || checkValue1);

                break;

            case 2:

                do {
                    try {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Introduce the first number");
                        firstNumber = scan.nextInt();
                        checkValue = false;
                        System.out.println("introduce the second number :");
                        secondNumber = scan.nextInt();
                        checkValue1 = false;

                        System.out.println(calc.subtraction(firstNumber, secondNumber));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter a number not a word or string!!!");
                    }
                } while (checkValue || checkValue1);
                break;

            case 3:


                do {
                    try {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Introduce the first number");
                        firstNumber = scan.nextInt();
                        checkValue = false;
                        System.out.println("introduce the second number :");
                        secondNumber = scan.nextInt();
                        checkValue1 = false;

                        System.out.println(calc.multiplication(firstNumber, secondNumber));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter a number not a word or string!!!");
                    }
                } while (checkValue || checkValue1);
                break;


            case 4:


                do {
                    try {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Introduce the first number");
                        firstNumber = scan.nextInt();
                        checkValue = false;
                        System.out.println("introduce the second number :");
                        secondNumber = scan.nextInt();
                        checkValue1 = false;

                        System.out.println(calc.division(firstNumber, secondNumber));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter a number not a word or string!!!");
                    }
                } while (checkValue || checkValue1);
                break;

            case 0:
                System.exit(0);
                break;


        }


    }


    public void goBackFromArray(){




        switch (numberChosen){
            case 5:
                basicMeniu();
                break;
            case 0 :
                System.exit(0);
        }
        }



    }









