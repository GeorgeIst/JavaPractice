package project.testGenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(4));
        Integer x = list.get(0);
    }

    public <T> List<T> arrayToList(T[] something) {
        List<T> rezultat = new ArrayList<>();
        for (T ceva : something){
            rezultat.add(ceva);
        }return rezultat;

    }

}
