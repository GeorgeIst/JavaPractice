package project.testBubbleSort;

import org.junit.Assert;
import org.junit.Test;
import project.bubbleSort.BubbleSort;

public class TestBubbleSort {

    @Test
    public void testBubbleSort(){

        int[] list = {10,7,5,3,1};
        BubbleSort sortare = new BubbleSort();
        int[] actual = sortare.sortareArray(list);
        int [] expected = {1,3,5,7,10};

        Assert.assertArrayEquals(expected,actual);


    }
}
