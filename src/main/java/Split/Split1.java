package Split;

public class Split1 {

    public static void main(String[] args){

        String words ="This, is, a, comma,delimited, list, of, words";

        String[] results =words.split(",\\s*",6);

        for(String w : results){
            System.out.println(w);
        }
    }
}
