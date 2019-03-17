package project.concurrency;

public class ClassConcurrency {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("Main thread stats");
        Thread.sleep(5000);
        System.out.println("Main thread is still running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");
    }
}
