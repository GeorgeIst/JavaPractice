package project.lambda;

import java.util.function.Function;

public class LambdaFunctio {

    public static void main(String[] args) {
        Function<String, Integer> function = s->s.length();
        System.out.println(function.apply("ABCDE"));

        Function<String,String> repleaceCOmadnWIthDotsFunction = s->s.replace(",", ".");
        System.out.println(repleaceCOmadnWIthDotsFunction.apply("a,b,c"));
    }
}
