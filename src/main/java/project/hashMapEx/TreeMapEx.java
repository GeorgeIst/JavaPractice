package project.hashMapEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Map<Integer, String> tree = new TreeMap<Integer, String>();
        tree.put(4,"Miau");
        tree.put(1,"Bau");
        tree.put(2,"Ciau");
        tree.put(5,"Vreau");
        tree.put(3,"Dau");

        System.out.println(tree.toString());
        System.out.println(((TreeMap<Integer, String>) tree).descendingKeySet());
        System.out.println(((TreeMap<Integer, String>) tree).descendingMap());
    }



}
