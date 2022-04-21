import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class SavingsAccountTest {
    SavingsAccount savingsAccount = new SavingsAccount("Hermione Granger", 10500);
    SavingsAccount savingsAccount1 = new SavingsAccount("Harry Potter", 14700);

    @Test
    void calculateMonthlyInterestTest() {
        SavingsAccount.modifyInterestRate(0.01);
        assertEquals(8.75, savingsAccount.calculateMonthlyInterest());
    }

    @Test
    void transferFundsTest(){
        SavingsAccount.transferFunds(savingsAccount1, savingsAccount, 4300);
        assertEquals(14800, savingsAccount.getSavingsBalance());
        assertEquals(10400.0, savingsAccount1.getSavingsBalance());
    }

    @Test
    void invalidDataTransferFundsTest() {
        assertEquals(0, SavingsAccount.transferFunds(savingsAccount1, savingsAccount, 20485));
    }


}
