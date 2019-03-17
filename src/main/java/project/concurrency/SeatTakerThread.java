package project.concurrency;

public class SeatTakerThread extends  Thread {
    private Bench bench;

    public SeatTakerThread(Bench bench){
        this.bench = bench;
    }
    public void run(){
        bench.takeASeat();
    }

}
