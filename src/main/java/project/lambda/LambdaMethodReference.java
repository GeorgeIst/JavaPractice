package project.lambda;

import project.persoana.Person;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaMethodReference {
    public static void main(String[] args) {

        Person newPerson = new Person(33, "Gabi","F", "necasatorita" );
        //Supplier
        Supplier<Integer> supplier = () -> new Random().nextInt();
        int randomNumber  = supplier.get();
        System.out.println(randomNumber);
        //Consumer
        Consumer<Double> consumer = i-> System.out.println("My " + i);
        consumer.accept(4.2);
    }
}
