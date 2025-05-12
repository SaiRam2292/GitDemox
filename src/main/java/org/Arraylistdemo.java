package org;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo {

    String str =" K Sai Ram";

    public static void main(String[] args){
        Arraylistdemo demo = new Arraylistdemo();
        ArrayList<Character> mylist = new ArrayList();

        for(char ch: demo.str.toCharArray()){

            mylist.add(ch);
        }
        Collections.reverse(mylist);

        StringBuilder Sb = new StringBuilder();

        for( char ch: mylist){

            Sb.append(ch);
        }

        System.out.println(Sb.toString());
    }
}
