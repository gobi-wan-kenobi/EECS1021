/**
 * Created by Gobi on 2016-03-16.
 */
import java.io.File;
import java.util.Scanner;

/**	This class encapsulates (i.e., represents) a bank account. Unlike v3,
 * 	its private attributes are made protected to demonstrate inheritance.
 */
public class BankAccountV4
{
    public String name;
    public String number;
    protected String password;
    protected double balance;

    public BankAccountV4(String name, String number, String password)
    {
        this.name = name;
        this.number = number;
        this.password = password;
        this.balance = 0;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public boolean withdraw(double amount)
    {
        boolean isValid = amount < this.balance;
        if (isValid) // only withdraw if sufficient funds
        {
            this.balance -= amount;
        }
        return isValid;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String toString()
    {
        return "Name: " + name + "; Account No.: " + number +
                "; Balance: $" + String.format("%8.2f", this.balance);
    }



    public static void main(String[] args) throws Exception
    {
        String name = "James Smith";
        String acctNumber = "123 456 789 0";
        String password = "password123";

        BankAccountV4 bankAccount1 = new BankAccountV4(
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
