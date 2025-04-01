package atm;

public class Card
{
    private final long number;
    private final int cvv;
    private final String holderName;
    private final BankAccount bankAccount;
    private int pin;

    public Card(long number, int cvv, String holderName, BankAccount bankAccount, int pin)
    {
        this.number = number;
        this.cvv = cvv;
        this.holderName = holderName;
        this.bankAccount = bankAccount;
        this.pin = pin;
    }

    public long getNumber()
    {
        return number;
    }

    public int getCvv()
    {
        return cvv;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public BankAccount getBankAccount()
    {
        return bankAccount;
    }

    public void setPin(int pin)
    {
        this.pin = pin;
    }

    public boolean isCorrectPin(int pin)
    {
        return this.pin == pin;
    }
}
