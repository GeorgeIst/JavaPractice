package project.testFormaGeometrica;

import org.junit.Test;

public class GenericTest {

    @Test
    public void something() {
        Generic<String> a = new Generic<>("A", "B");
        Generic<Integer> b = new Generic<>(1,2);
        Generic c = new Generic(new Cerc(2), new Cerc(5));

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}