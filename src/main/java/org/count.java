package org;

public class count {


    public static void main(String[] args) {
        int num = 1234566;
        int count = 0;

        while (num > 0) {

            num = num / 10;
            count++;
        }
        System.out.println("The length of the number is: " + count);
    }
}
