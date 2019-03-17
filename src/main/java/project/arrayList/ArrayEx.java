package project.arrayList;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayEx {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> anotherList = new ArrayList<>(Arrays.asList(9,8,7,8,9));
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        System.out.println(list);
        System.out.println(list.remove(2));
        list.sort(Integer::compareTo);
        System.out.println(list);
        System.out.println(list.contains(5));
        list.addAll(anotherList);
        System.out.println(list);
        Collections.swap(list,1,2);
        System.out.println(list);



    }

}
