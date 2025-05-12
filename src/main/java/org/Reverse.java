package org;

public class Reverse {


    public static void main(String[] args){

        String str ="Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());

        int num = 12345;

        int Reversenum =Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());

        System.out.println(Reversenum);

    }
}
