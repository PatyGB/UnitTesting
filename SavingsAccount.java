public class SavingsAccount {

    private String identifier;
    static double annualInterestRate = 0.0;
    private double savingsBalance;

    SavingsAccount(String identifier, double savingsBalance) {
        this.identifier = identifier;
        this.savingsBalance = savingsBalance;
    }

    public String getIdentifier() {
        return identifier;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double calculateMonthlyInterest() {
        double monthlyBenefit = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyBenefit;
        return monthlyBenefit;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static void transferFunds(SavingsAccount account1, SavingsAccount account2, double amount) {
        if (account1.savingsBalance > amount || account1.savingsBalance == amount) {
            account2.savingsBalance += amount;
            account1.savingsBalance -= amount;
        } else {
            System.out.println("Sorry, not enough money in the account.");
        }
    }
}