package project.testBankAccount;

import org.junit.Assert;
import org.junit.Test;
import project.bankAccount.BankAccount;
import project.bankAccount.ExtendetBankAccount;

public class TestBankAccount {

    @Test
    public void testBankAccount(){

        BankAccount client1 = new ExtendetBankAccount(1000, 2);
        client1.extractAmount(100);
        ((ExtendetBankAccount) client1).addMontlyInterst();

        client1.print();
        Assert.assertEquals(918, client1.getSum());




    }
}
