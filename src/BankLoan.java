/*
The Metro Bank provides various types of loans such as car loans, business loans and house loans
to its account holders, i.e., customers.

Implement a program to determine the eligible loan amount and the EMI that the bank can provide to
its customers based on their salary and the loan type they expect to avail.

The values required for determining the eligible loan amount and the EMI are:

account number of the customer

account balance of the customer

salary of the customer

loan type

expected loan amount

expected no. of EMIs

The following validations should be performed:

The account number should be of 4 digits and its first digit should be 1

The customer should have a minimum balance of $1000 in the account

Display appropriate error messages if the validations fail.

If the validations pass, determine whether the bank would provide the loan or not.

The bank would provide the loan, only if the loan amount and the number of EMIs expected
by the customer is less than or equal to the loan amount and the number of EMIs decided by the bank respectively.
The bank decides the eligible loan amount and the number of EMIs based on the below table.

         +----------+-----------+----------------------+-------------+
         | Salary   | Loan Type | Eligible Loan Amount | No. of EMIs |
         +----------+-----------+----------------------+-------------+
         | >25000   | Car       | 500000               | 36          |
         | >50000   | House     | 6000000              | 60          |
         | >75000   | Business  | 7500000              | 84          |
         +----------+-----------+----------------------+-------------+

Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.

Display an appropriate message if the bank does not provide the loan.

Sample Input and Output

 Sample Input
 accountNumber = 1001
 salary = 40000
 accountBalance = 250000
 loanType = Car
 loanAmountExpected = 300000
 emisExpected = 30


 Expected Output
 eligibleLoanAmount = 500000
 eligibleEmis = 36
*/
import java.util.Scanner;

public class BankLoan {

    // Validation for account number and balance
    static boolean validation(int acc, int balance) {
        // Account number should be 4 digits and start with 1
        if (acc < 1000 || acc > 9999 || (acc / 1000) != 1) {
            System.out.println("Invalid account number");
            return false;
        }
        // Account balance should be at least $1000
        if (balance < 1000) {
            System.out.println("Insufficient account balance");
            return false;
        }
        return true;
    }

    // Loan processing
    static void processLoan(int accountNumber, int salary, String loanType, int loanAmountExpected, int emisExpected) {
        int eligibleLoanAmount = 0;
        int eligibleEmis = 0;

        if (loanType.equalsIgnoreCase("Car") && salary > 25000) {
            eligibleLoanAmount = 500000;
            eligibleEmis = 36;
        } else if (loanType.equalsIgnoreCase("House") && salary > 50000) {
            eligibleLoanAmount = 6000000;
            eligibleEmis = 60;
        } else if (loanType.equalsIgnoreCase("Business") && salary > 75000) {
            eligibleLoanAmount = 7500000;
            eligibleEmis = 84;
        } else {
            System.out.println("Loan not eligible based on salary or loan type");
            return;
        }

        if (loanAmountExpected <= eligibleLoanAmount && emisExpected <= eligibleEmis) {
            displayLoanDetails(accountNumber, eligibleLoanAmount, eligibleEmis, loanAmountExpected, emisExpected);
        } else {
            System.out.println("The bank will not provide the loan for the requested amount or EMIs");
        }
    }

    // Output method
    private static void displayLoanDetails(int accountNumber, int eligibleLoanAmount, int eligibleEmis, int requestedLoanAmount, int requestedEmis) {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Eligible loan amount: " + eligibleLoanAmount);
        System.out.println("Eligible EMIs: " + eligibleEmis);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account balance: ");
        int accountBalance = sc.nextInt();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter loan type (Car/House/Business): ");
        String loanType = sc.next();

        System.out.print("Enter expected loan amount: ");
        int loanAmountExpected = sc.nextInt();

        System.out.print("Enter expected number of EMIs: ");
        int emisExpected = sc.nextInt();

        if (validation(accountNumber, accountBalance)) {
            processLoan(accountNumber, salary, loanType, loanAmountExpected, emisExpected);
        }
        sc.close();
    }
}
