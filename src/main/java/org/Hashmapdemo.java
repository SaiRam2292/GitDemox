package org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmapdemo {

    public static void  main (String[] args){
        //Map mymap = new HashMap(); //we can define like this also
        //HashMap mymap = new HashMap(); //we can define like this also
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"Java");
        map.put(4, "C++");
        map.put(5,null);
        map.put(6,null);

        System.out.println("The HashMap elements are: "+map); //{1=Java, 2=Python, 3=Java, 4=C++, 5=null, 6=null}
        System.out.println("The HashMap elements are: "+map.size()) ;//6
        System.out.println("The HashMap elements are: "+map.remove(3)); //Java
        //System.out.println("The HashMap elements are: "+map.replace()); //{1=Java, 2=Python, 4=C++, 5=null, 6=null}

        System.out.println("The HashMap elements are: "+map.get(2)); //Python

        System.out.println("The HashMap elements are: "+map.values()); //[Java, Python, C++, null, null]

        System.out.println("The HashMap elements are: "+map.keySet()); //[1, 2, 4, 5, 6]


        System.out.println("The HashMap elements are: "+map.entrySet()); //[1=Java, 2=Python, 4=C++, 5=null, 6=null]

        // Reading data from hashmap using for each loop

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("The key is: "+entry.getKey()+" The value is: "+entry.getValue());
        }

        // Using iterator

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>)itr.next();
            System.out.println("The key is: "+entry.getKey()+" The value is: "+entry.getValue());
        }

        map.clear();
        System.out.println("The HashMap elements after clearing all elements are: "+map); //{}

    }



}
