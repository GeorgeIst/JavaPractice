package project.lambda;

import project.persoana.Person;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(29, "George", "M", "Necasatorit");
        Person person2 = new Person(50, "Mihai","M", "Necasatorit");
        Predicate<Person> predicate = u -> u.getVarsta()==29;
        Predicate<String> predicate1 = s->s.startsWith("G");
        System.out.println(predicate1.test("G"));
        System.out.println(predicate1.test("T"));




    }
}
