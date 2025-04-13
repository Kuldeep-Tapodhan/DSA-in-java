package BasicJava;

public class CreditCard {
    // Instance variables
    private String bank;       // name of the bank (e.g., "California Savings")
    private String account;    // account identifier (e.g., "5391037593875309")
    private int limit;         // credit limit (measured in dollars)
    private String customer;   // name of the customer (e.g., "John Bowman")
    protected double balance;  // current balance (measured in dollars)

    // Constructors
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0); // use a balance of zero as default
    }

    // Accessor methods
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    // Update methods
    public boolean charge(double price) { // make a charge
        if (price + balance > limit) { // if charge would surpass limit
            return false; // refuse the charge
        }
        // at this point, the charge is successful
        balance += price; // update the balance
        return true; // announce the good news
    }

    public void makePayment(double amount) { // make a payment
        balance -= amount;
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); // implicit cast
        System.out.println("Limit = " + card.limit);     // implicit cast
    }
    public class PredatoryCreditCard extends CreditCard {
        // Additional instance variable
        private double apr; // annual percentage rate

        // Constructor for this class
        public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
            super(cust, bk, acnt, lim, initialBal); // initialize superclass attributes
            apr = rate;
        }

        // A new method for assessing monthly interest charges
        public void processMonth() {
            if (balance > 0) { // only charge interest on a positive balance
                double monthlyFactor = Math.pow(1 + apr, 1.0 / 12); // compute monthly rate
                balance *= monthlyFactor; // assess interest
            }
        }

        // Overriding the charge method defined in the superclass
        public boolean charge(double price) {
            boolean isSuccess = super.charge(price); // call inherited method
            if (!isSuccess) {
                balance += 5; // assess a $5 penalty
            }
            return isSuccess;
        }
    }

    // Main method for demonstration (optional, add if needed)
    public static void main(String[] args) {
        // Create an array of CreditCard objects
        CreditCard[] wallet = new CreditCard[3];

        // Initialize each CreditCard in the array
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391037593875309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "3485039933951954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391037593875309", 2500, 300);

        // Apply charges to each card in the array
        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val); // Charge 3 times the current iteration value to wallet[0]
            wallet[1].charge(2 * val); // Charge 2 times the current iteration value to wallet[1]
            wallet[2].charge(val);     // Charge the iteration value to wallet[2]
        }

        // Print summary and process payments for each card
        for (CreditCard card : wallet) {
            CreditCard.printSummary(card); // Print the card's details

            // Make payments of $200 until the balance is below $200
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }




    }

}
