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
    public enum BankAccountType {
        /**
         * their readily available money.
         */
        CHECKINGS,
        /**
         * long term saving.
         */
        SAVINGS,
        /**
         * the owner.
         */
        STUDENT,
        /**
         * where they work.
         */
        WORKPLACE
    }

    /**
     * their account number.
     */
    private int accountNumber;
    /**
     * the account type.
     */
    public BankAccountType accountType;
    /**
     * the account balance,
     */
    private double accountBalance;
    /**
     * the owner name.
     */
    private String ownerName;
    /**
     * the interest rate.
     */
    public double interestRate;
    /**
     * the interest earnerd.
     */
    private double interestEarned;

    /**
     * constructor that takes a name and accountCategory
     * @param name the name of the account owner
     * @param accountCategory the category type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        this.BankAccountType accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * setter for the interest rate.
     * @param interest interest rate the user sends in
     */
    public void  setInterestRate(final double interest) {
        this.interestRate = interest;
    }

    /**
     * getter that returns the account balance.
     * @return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * setter that sets the account balance.
     * @param balance of the account
     */
    public void setAccountBalance(final double balance) {
        this.accountBalance = balance;
    }
}
