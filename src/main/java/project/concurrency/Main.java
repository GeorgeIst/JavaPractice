package project.concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bench bench = new Bench(1);
        SeatTakerThread seatTakerThread = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread2 = new SeatTakerThread(bench);
        seatTakerThread.start();
        seatTakerThread2.start();


    }
}

