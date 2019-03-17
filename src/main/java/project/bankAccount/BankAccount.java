package project.bankAccount;

public class BankAccount {

    private int sum = 0;

    public BankAccount(int amount) {
        this.addAmount(amount);
    }

    public int getSum() {
        return sum;
    }

    public void addAmount(int x) {
        this.sum = sum + x;

    }

    public boolean extractAmount(int x) {
        if (sum >= x) {
            this.sum = sum - x;
            System.out.println("Extraction complete");
        } else {
            System.out.println("Not enough money");
        }
        return false;

    }

    public void acountDebit() {
        System.out.println("Your current amount is: " + this.sum);
    }
    public void print(){
        System.out.println("Basic Account");
    }

}
