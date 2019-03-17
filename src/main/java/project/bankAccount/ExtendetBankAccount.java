package project.bankAccount;

public class ExtendetBankAccount extends BankAccount {

    private int interestRate;

    public ExtendetBankAccount(int sum, int interestRate) {
        super(sum);

        this.interestRate = interestRate;
    }
    public void addMontlyInterst(){
        super.addAmount(super.getSum()* interestRate/100);

    }

}
