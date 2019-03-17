package project.testInsertion;

import org.junit.Test;
import project.insertionIntArray.InsertionIntArray;

import java.util.Arrays;

public class TestInsertion {

    @Test
    public void test(){

        int[] list = {4,6,2,8,9,10};
        InsertionIntArray is = new InsertionIntArray();
        is.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
