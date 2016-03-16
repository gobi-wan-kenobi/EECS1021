/**
 * Created by Gobi on 2016-03-16.
 */

/**	This class encapsulates (i.e., represents) a bank account that gives
 * 	reward points for each deposit. It inherits from an existing bank
 * 	account class.
 */
public class RewardAccount extends BankAccountV4
{
    private int points; //the total points awarded on this account

    public RewardAccount(String name, String number, String password)
    {
        super(name, number, password);
        points = 0;
    }

    public int getPointBalance()
    {
        return points;
    }



    /*	Award 100 points per deposit. */
    public void deposit(double amount)
    {
        this.points += 100;
        super.deposit(amount);
    }

    /*	After the balance, print the fees total. */
    public String toString()
    {
        return super.toString() + "; Points: " + this.points;
    }



    public static void main(String[] args)
    {
        String name = "James Smith";
        String acctNumber = "123 456 789 0";
        String password = "password123";

        RewardAccount bankAccount1 = new RewardAccount(
                name, acctNumber, password);
        System.out.println(bankAccount1);

        bankAccount1.deposit(250.00);
        System.out.println(bankAccount1);
    }

}
