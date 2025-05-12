package org;

public class Addthenumbers {

    public static void main (String[] args){

        int num =12344564;
        String strnum = String.valueOf(num); // convert into a string;
        char[] chars =strnum.toCharArray();// coverting string to char array;
        int sum=0;

        for(int i=0; i<chars.length;i++){
            char ch =chars[i];

            if(Character.isDigit(ch)){

                sum+= Character.getNumericValue(ch);


            }
        }
System.out.println("The sum of the digits in the number is: "+sum);

    }
}
