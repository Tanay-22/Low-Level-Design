package atm;

public class BankAccount
{
    private int balance;

    public BankAccount(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    public void withdraw(int amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn");
        }
    }
}
