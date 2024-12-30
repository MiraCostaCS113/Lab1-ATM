import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void shouldInitializeSavingsAccountWithZeroBalance() {
        // Arrange
        Adult accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);

        // Act
        double initialBalance = savingsAccount.getBalance();

        // Assert
        Assertions.assertEquals(0, initialBalance, "Initial balance should be zero.");
    }

    @Test
    public void validateDepositToSavingAccount() {
        // Arrange
        Adult accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);

        savingsAccount.deposit(100);

        Assertions.assertEquals(103, savingsAccount.getBalance(), "Balance should be 100.");
    }
}