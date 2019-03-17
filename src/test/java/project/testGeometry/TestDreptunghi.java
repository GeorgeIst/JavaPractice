package project.testGeometry;

import org.junit.Assert;
import org.junit.Test;
import project.geometry.Dreptunghi;

public class TestDreptunghi {
    @Test
    public void testCalculeazaAria() {

        Dreptunghi actualResult = new Dreptunghi(20, 10);
        Assert.assertEquals(200, actualResult.calculeazaArie());

    }

    @Test
    public void testCalculeazaPerimetru() {

        Dreptunghi actualResult = new Dreptunghi(20, 10);
        Assert.assertEquals(60, actualResult.calculeazaPerimetru());
    }
}
