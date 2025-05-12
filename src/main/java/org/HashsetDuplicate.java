package org;

import java.util.HashSet;

public class HashsetDuplicate {

    public static void main (String[] args){

        int[] arr ={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        findDuplicate(arr);

    }

    public static void  findDuplicate(int[] arr){

        HashSet seen = new HashSet();
        HashSet Duplicate = new HashSet();

        for (int num: arr){

            if(!seen.add(num)){

                Duplicate.add(num);
            }
        }
    System.out.println("The duplicate elements are: "+Duplicate);

    }
}
