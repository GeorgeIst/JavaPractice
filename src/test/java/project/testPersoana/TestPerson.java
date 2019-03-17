package project.testPersoana;

import org.junit.Assert;
import org.junit.Test;
import project.persoana.Person;

public class TestPerson {
    @Test
    public void TestPersoana(){

        Person persons1 = new Person(30, "Razvan", "M","Necas.");
        int expectedResult = 30;
        int actualResult = persons1.getVarsta();
        persons1.getNume();
        persons1.getSex();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void TestPersoana2(){

        Person persons2 = new Person(27, "Maria", "F","Casat.");
        int expectedResult = 27;
        int actualResult = persons2.getVarsta();
        persons2.getNume();
        persons2.getSex();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void TestPersoana3(){
        Person persons3 = new Person(18, "George", "M", "neca");
        int expectedResult = 18;
        int actualResult = persons3.getVarsta();
        persons3.getNume();
        persons3.getSex();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public  void TestPeroana4(){
        Person persons4 = new Person(35, "Dominic", "M", "casat");
        int expectedResult = 35;
        int actualResult = persons4.getVarsta();
        persons4.getNume();
        persons4.getSex();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(persons4.toString());
    }

}
