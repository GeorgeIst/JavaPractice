package project.testGenerics;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void arrayToList() {

        Integer[] intArray = {1,2,3,4,5};
        String [] strArray = {"A", "B", "C"};

       Main a = new Main();
        List<String> actualStrList = a.arrayToList(strArray);
        List<Integer> actualIntList= a.arrayToList(intArray);
        assertEquals("A", actualStrList.get(0));
        assertEquals(new Integer(1),actualIntList.get(0));
    }
}