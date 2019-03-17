package project.lambda;

public class Lambda2 {
    public static void main(String[] args) {

        LambdaInterface power = q -> q*q;
        System.out.println(power.something(10));
        LambdaInterface power2 = q -> q*q*q;
        System.out.println(power2.something(10));
    }
}
