package project.testFibonacci;

import org.junit.Assert;
import org.junit.Test;
import project.fibonacci.FibonacciExe;

public class TestFibonacii {
    @Test
    public void testFibo(){
        FibonacciExe exercitiuFibonaci = new FibonacciExe();
        int expectedResult = 0;
        int actualResult = exercitiuFibonaci.fibonaci(0);
        Assert.assertEquals(expectedResult, actualResult);

    }@Test
    public void testFirstFibo(){
        FibonacciExe exercitiuFibonaci = new FibonacciExe();
        int expectedResult = 1;
        int actualResult = exercitiuFibonaci.fibonaci(1);
        Assert.assertEquals(expectedResult, actualResult);

    }@Test
    public void testThirdFibo(){
        FibonacciExe exercitiuFibonaci = new FibonacciExe();
        int expectedResult = 3;
        int actualResult = exercitiuFibonaci.fibonaci(3);
        Assert.assertEquals(expectedResult, actualResult);

    }




}
