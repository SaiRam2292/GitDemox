package org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsetdemo {

    public static void main(String[] args){

        HashSet myset = new HashSet();
        //Set myset = new HashSet(); we can define like this also
       // HashSet<String> myset = new HashSet<String>(); we can define like this also
        myset.add("Java");
        myset.add(true);
        myset.add(10.5);
        myset.add(100);
        myset.add(null);
        myset.add(null);
        myset.add('A');
        myset.add('A');


        System.out.println("The HashSet elements are: "+myset);

        myset.size();
        System.out.println("The HashSet elements after clearing all elements are: "+myset);

    // inserting element is not possible
        // Access specific element is not possible

        // converting hashset to array

        ArrayList list = new ArrayList(myset);
        System.out.println("The ArrayList elements are: "+list);

        // Read data from hashset using for each loop

        for(Object ele:myset){
            System.out.println("The elements are: "+ele);
        }


        // using iterator

        Iterator itr = myset.iterator();
        while(itr.hasNext()){
            System.out.println("The elements are: "+itr.next());
        }

        myset.clear();
        System.out.println("The HashSet elements after clearing all elements are: "+myset);

    }
}
