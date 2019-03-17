package project.concurrency;

public class Bench {
    private int availableSeats;

    public Bench(int avaibleSeats) {
        this.availableSeats = avaibleSeats;
    }

    public void takeASeat() {
        synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("Taking a seat ");
                availableSeats--;
                System.out.println("Free seats left " + availableSeats);
            } else {
                System.out.println("There are no available seats :(");
            }
        }
    }
}
