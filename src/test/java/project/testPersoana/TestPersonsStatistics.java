package project.testPersoana;

import org.junit.Assert;
import org.junit.Test;
import project.persoana.Person;
import project.persoana.PersonsStatitics;

public class TestPersonsStatistics {

    @Test
    public void testOldestManReturnsSuccess() {
        Person p1 = new Person(19, "Victor", "M", "Necasatorit");
        Person p2 = new Person(29, "George", "M","Casatorit");
        Person p3 = new Person(67, "Maria", "F", "Necasatorit");
        Person p4 = new Person(26, "Gabriela", "F","Casatorit");
        Person p5 = new Person(34, "Dragos", "M","Necasatorit");
        Person p6 = new Person(18, "Andreea", "F","Necasatorit");
        Person p7 = new Person(70, "Mihai", "M","Casatorit");
        Person p8 = new Person(42, "Andina", "F","Casatorit");

        Person[] per = new Person[]{p1, p2, p3, p4, p5, p6,p7,p8};

        PersonsStatitics actualResult = new PersonsStatitics(per);

        Assert.assertEquals(67, actualResult.oldestWoman());
        Assert.assertEquals(70, actualResult.oldestMan());
        Assert.assertEquals(4, actualResult.womenCount());
        Assert.assertEquals(38, actualResult.averageManAge());
        Assert.assertEquals(38, actualResult.averageWomanAge());
        Assert.assertEquals(4, actualResult.numberOfMarriedPeople());



    }
}
