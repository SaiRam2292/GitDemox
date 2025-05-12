package org;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

    private static String str =" KK SSAAII RRAAMM L";

    private static String st1 = str.replaceAll( " ","");

    public static void main (String[] args) {

        HashMap<Character, Integer> charscount = new HashMap<>();

        for (char ch : Hashmap1.st1.toCharArray()) {

            charscount.put(ch, charscount.getOrDefault(ch, 0) + 1);

        }

        // for repeatead characters
       /* for( char ch: charscount.keySet()){

            if(charscount.get(ch)>1){
                System.out.println("The character "+ch+" is repeated "+charscount.get(ch)+" times");
            }
        }

        // for non repeated characters
        for( char ch: charscount.keySet()){

            if(charscount.get(ch)==1){
                System.out.println("The character "+ch+" is not repeated ");
            }
        }

        */

        for (Map.Entry<Character, Integer> entry:charscount.entrySet()){

            if(entry.getValue()>1){
                System.out.println("The character "+entry.getKey()+" is repeated "+entry.getValue()+" times");
            }else{
                System.out.println("The character "+entry.getKey()+" is not repeated ");
            }
    }
    }
}
