package org;
import java.util.ArrayList;
import java.util.Collections;

public class Smallestnumber {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(15);
        numbers.add(3);
        numbers.add(100);
        numbers.add(1);
        numbers.add(25);

        // Find the smallest number

        int smallest = Collections.min(numbers);
        System.out.println("The smallest number is: " + smallest);
//        int largest= Collections.max(numbers);
//        System.out.println("The largest number is: " + largest);




    }
}
