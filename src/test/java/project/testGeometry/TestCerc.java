package project.testGeometry;

import org.junit.Assert;
import org.junit.Test;
import project.geometry.Cerc;

public class TestCerc {
    @Test
    public void calculeazaAria(){
        Cerc actualResult = new Cerc(5);
        Assert.assertEquals(78.53981633974483, actualResult.calculeazaAri(),0.0);

    }
    @Test
    public void calculeazaCircumferinta(){

    Cerc actualResult = new Cerc(5);
        Assert.assertEquals(31.41592653589793, actualResult.calculeazaCircumferinta(),0.0);


    }
}
