package project.testMyStack;

import org.junit.Assert;
import org.junit.Test;
import project.stack.MyStack;

public class TestMystack {



    @Test
    public void testToString() {
        MyStack stack = new MyStack(10);
        System.out.println(stack.toString());

    }

    @Test
    public void testToPush() {
        MyStack stack = new MyStack(5);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
        }catch (ArrayIndexOutOfBoundsException a){
            stack = new MyStack(stack);
            stack.push(6);
        }
        int lastElem = stack.peek();
        Assert.assertEquals(6,lastElem);
        int[]expected = {1,2,3,4,5,6,0};
        Assert.assertArrayEquals(expected, stack.getElements() );
        System.out.println(stack.toString());

    }


}
