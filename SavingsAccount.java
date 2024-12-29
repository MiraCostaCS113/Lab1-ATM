/*
 * SavingsAccount.java
 *
 */
public class SavingsAccount extends Account {

    /** Creates a new instance of SavingsAccount */
    public SavingsAccount(Customer customer) {
        super(customer);
    }

    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * 
     * @param amount double Deposit amount
     * @return double New account balance
     */
    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            this.transactions[this.tranIndex++] = new Transaction(this.customer.getCustomerNumber(),
                    0, amount, "DEP");

            this.balance += amount;

            this.addInterest();
        }
        return balance;
    }

    /***********************************************
     * Substracts amount from balance
     * pre: amount must be a positive value
     * post: balance decreases in amount value
     * 
     * @param amount double Withdrawal amount
     * @return double New account balance
     */
    public double withdrawal(double amount) {

        if (amount > 0) {
            this.transactions[this.tranIndex++] = new Transaction(this.customer.getCustomerNumber(), 0, amount, "CR");
            if (amount > this.balance) {
                amount += this.customer.getOverdraftPenalty();
            }
            this.balance -= amount;
        }
        return balance;
    }

    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * 
     * @return double New account balance
     */
    public double addInterest() {
        double amount = this.balance * this.customer.getSavingInterest();
        this.transactions[this.tranIndex++] = new Transaction(this.customer.getCustomerNumber(), 0, amount, "INT");
        this.balance = this.balance + amount;
        return this.balance;

    }
}