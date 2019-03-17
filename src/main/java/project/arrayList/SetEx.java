package project.arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("luni");
        mySet.add("marti");
        mySet.add("miercuri");
        System.out.println(mySet);
        List<String> second = new ArrayList<>(mySet);
        System.out.println(second);


    }
}
