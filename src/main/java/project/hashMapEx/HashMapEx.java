package project.hashMapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<Integer,String> myMap = new HashMap<Integer, String>();

        myMap.put(1,"Miau");
        myMap.put(2,"Bau");
        myMap.put(3,"Ciau");
        myMap.put(4,"Vreau");

        System.out.println(myMap.containsKey(2));
        System.out.println(myMap.entrySet());
        System.out.println(myMap.get(4));


    }
}
