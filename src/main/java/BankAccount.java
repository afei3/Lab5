import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * type of account.
     */
    public enum BankAccountType {
        /**
         * Type of account.
         */
        CHECKINGS,
        /**
         * Type of account.
         */
        SAVINGS,
        /**
         * Type of account.
         */
        STUDENT,
        /**
         * Type of account.
         */
        WORKPLACE
    }

    /**
     * account number.
     */
    private int accountNumber;
    /**
     * account type.
     */
    private BankAccountType accountType;
    /**
     * account balance.
     */
    private double accountBalance;
    /**
     * owner's name.
     */
    private String ownerName;
    /**
     * Interest rate.
     */
    private double interestRate;

    /**
     * amount earned through interest.
     */
    private double interestEarned;

    /**
     * creates a bank account.
     * @param name is the name on the account
     * @param accountCategory is the type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        accountBalance = 0;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double deposit(final double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    public void widthdraw(final double amount) {
        accountBalance -= amount;
    }

    public void setOwnerName(final String name) {
        ownerName = name;
    }
}
