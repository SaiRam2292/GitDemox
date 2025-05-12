package Split;

import java.util.Arrays;

public class Split {


    public static void main(String[] args){

        String[] options ={"New York Bulls","Los Angeles Kings","Golden State Warriros","Huston Rocket"};


        for(int i=0; i< options.length;i++) {
            String[] words = options[i].split(" ", 2);
            if (words.length > 1) {
                options[i] = words[1]; // this will print the second word
            }
        }

    System.out.println("The second word of each option is: " + Arrays.toString(options));// [York Bulls, Angeles Kings, State Warriros, Rocket]
    }
}
