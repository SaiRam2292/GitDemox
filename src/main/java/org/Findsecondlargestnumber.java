package org;

public class Findsecondlargestnumber {


    public static void main(String[] args) {
        int[] num = {10, 99, 88, 109, 220, 12, 45, 35};
        int firstl = num[0]; int secondl =num[0];
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > firstl) {
                secondl=firstl;
                firstl=num[i];
            }
            else if(num[i]>secondl && num[i]!=firstl){
                secondl=num[i];
            }
        }
        System.out.println("The Second largest number is: " + secondl);
    }
}
