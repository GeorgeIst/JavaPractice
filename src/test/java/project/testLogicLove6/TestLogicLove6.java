package project.testLogicLove6;

import org.junit.Assert;
import org.junit.Test;
import project.logicLove6.LogicLove6;

public class TestLogicLove6 {

    @Test
    public void testLogicLove() {
        int x = 3; int y =6;
        LogicLove6 love6 = new LogicLove6();
        boolean acutalResult = love6.love6(x, y);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, acutalResult);
        Assert.assertEquals(true, love6.love6(6,8));
    }

}
