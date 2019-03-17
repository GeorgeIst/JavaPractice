package project.testPrimNumber;

import org.junit.Assert;
import org.junit.Test;
import project.primNumber.PrimNumber;

import java.util.ArrayList;

public class TestPrimNumber {

    @Test
    public void testPrimNumber() {
        PrimNumber nrPrim = new PrimNumber();

        boolean actualResult = nrPrim.checkIfIsPrim(2);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testListOfPrimeNumbers() {

        int[] lista = {2, 3, 5, 7, 10, 12};

        PrimNumber testArray = new PrimNumber();

        ArrayList<Integer> actaulResult = testArray.checkArrayOfPrime(lista);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);

        Assert.assertEquals(expectedResult, actaulResult);
    }

}
