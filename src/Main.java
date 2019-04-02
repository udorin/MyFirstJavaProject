import Calculator.Calculator;
import Calculator.OperatiLogice;

import animalrescue.Cat;
import animalrescue.MedicalStaff;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        OperatiLogice op = new OperatiLogice();
        Calculator calc = new Calculator();

        List<Integer> list =  new ArrayList();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(12);
        list.add(13);



        //exercise 1
        op.addElementToList(list,34);

        //exercise 2

        op.printList(list );

        //exercise 3
        op.printListStartFromNumber(list,22);

        //exercise 4
        op.printReverseList(list);


        //exercise 5

        List<String> listStrings =  new ArrayList<>();
        listStrings.add("Hello");
        listStrings.add("morning");
        listStrings.add("night");

        op.addElementSpecificPositionList(listStrings,2,"words");

        //exercise 6
        op.addIntFirstPositionList(list,12);

        //exercise 7
        op.showPositionAndValueList(list);

        //exercise 8
       op.changePositionList(list,0,2);

        //exercise 9

        op.findGratestNumberInAList(list);

        //exercise 10
        op.findEvenNumbers(list);

        //exercise 11
        op.sortList(list);

        MedicalStaff corina = new MedicalStaff();









        }





        }

































































