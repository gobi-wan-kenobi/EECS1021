/**
 * Created by Gobi on 2016-03-16.
 */

/**	This class encapsulates (i.e., represents) a bank account that charges
 * 	fees on each successful withdrawal. It inherits from an existing bank
 * 	account class.
 */
public class ChequingAccount extends BankAccountV4
{
    private double fees; //the total fees charged on this account

    public ChequingAccount(String name, String number, String password)
    {
        super(name, number, password);
        fees = 0.0;
    }

    public double getFees()
    {
        return fees;
    }



    /*	Charge a $0.75 fee per withdrawal. */
    public boolean withdraw(double amount)
    {
        boolean isValid = amount < this.balance;
        if (isValid) // only withdraw if sufficient funds
        {
            this.fees += 0.75;
            this.balance -= amount;
        }
        return isValid;
    }

    /*	After the balance, print the fees total. */
    public String toString()
    {
        return "Name: " + name + "; Account No.: " + number +
                "; Balance: $" + String.format("%8.2f", this.balance) +
                "; Fees: $" + String.format("%8.2f", this.fees);
    }



    public static void main(String[] args)
    {
        String name = "James Smith";
        String acctNumber = "123 456 789 0";
        String password = "password123";

        ChequingAccount bankAccount1 = new ChequingAccount(
                name, acctNumber, password);
        System.out.println(bankAccount1);

        bankAccount1.deposit(100.00);
        System.out.println(bankAccount1);

        System.out.print("Withdrawl of $500...");
        if (bankAccount1.withdraw(500))
        {
            System.out.println("Succeeded.");
        }
        else
        {
            System.out.println("Failed!");
        }

        System.out.print("Withdrawl of $22.50...");
        if (bankAccount1.withdraw(22.5))
        {
            System.out.println("Succeeded.");
        }
        else
        {
            System.out.println("Failed!");
        }

        System.out.println(bankAccount1);
    }

}
