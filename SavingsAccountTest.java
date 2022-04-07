import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {
    SavingsAccount savingsAccount = new SavingsAccount("Hermione Granger", 10500);
    SavingsAccount savingsAccount1 = new SavingsAccount("Harry Potter", 14700);

    @Test
        public void CalculateMonthlyInterestTest() {
        SavingsAccount.modifyInterestRate(0.01);
        assertEquals(9.00, savingsAccount.calculateMonthlyInterest());
    }

    @Test
    public void transferFundsTest(){
        SavingsAccount.transferFunds(savingsAccount1, savingsAccount, 4300);
        assertEquals(14800, savingsAccount.getSavingsBalance());
        assertEquals(10400.0, savingsAccount1.getSavingsBalance());
    }

    @Test
    public void compareSavingsBalanceTest(){
        assertFalse(savingsAccount.getSavingsBalance() > savingsAccount1.getSavingsBalance());
    }

    @DisplayName("Not the same object reference.")
    @Test
    public void compareObjectReferencesTest(){
            assertSame(10500.0, savingsAccount.getSavingsBalance());
    }



}
