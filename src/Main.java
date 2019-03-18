import Calculator.Calculator;
import Calculator.OperatiLogice;
import animalrescue.Animal;
import animalrescue.Cat;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        OperatiLogice op = new OperatiLogice();
        Calculator calc = new Calculator();


        // exercitiul 1
         int[] test =  op.countToHundreadArray();



        //exercitiul 2

        System.out.println(calc.averageArrays(test));

        //exercitiul 3
        op.printLinesArray();

       // exercitiul 4
        int n1 = 5;

        op.checkValueArray(n1, test);

       // exercitiul 5


      op.checkIndexArray(test,12);

       // exercitiul 6
        int[] test11 = {1,6,7,8};
        System.out.println(test11[0]);
        System.out.println(test11[1]);
        System.out.println(test11[2]);
        System.out.println(test11[3]);
        test11 = op.removeElementFromArray(test11,2);
        System.out.println(test11[0]);
        System.out.println(test11[1]);
        System.out.println(test11[2]);
        System.out.println(test11[3]);

        //exercitiul 7
        int[] te = {4,5,6,2,1,};
        op.secondSecondSmallestElement(te);

       // exercitiul 8

        int[] firstArray = {1,4,5,6,};
        int[] second = new int[4];

        op.iterateArray(firstArray,second);

           // exercitiul 9

      op.insertElement(firstArray,2,56);

       // exercitiul 10

        int[] array = {3,4,6,10,56,1};
        op.findMaxAndMinInArray(array);
        //exemple override
        Animal flori = new Cat();
        flori.mananca();

























        }


    }


































