package atm;

import atm.states.ATMState;
import atm.states.IdleState;

public class ATM
{
    private static ATM atmInstance;
    ATMState currentATMState;

    private int balance;
    private int noOfThousandNotes;
    private int noOfFiveHundredNotes;
    private int noOfOneHundredNotes;

    private ATM()
    {
    }

    public void initializeATM(int nThousandNotes, int nFiveHundredNotes, int nOneHundredNotes)
    {
        this.noOfThousandNotes = nThousandNotes;
        this.noOfFiveHundredNotes = nFiveHundredNotes;
        this.noOfOneHundredNotes = nOneHundredNotes;
        this.balance = 1000 * nThousandNotes + 500 * nFiveHundredNotes + 100 * nOneHundredNotes;
        atmInstance = new ATM();
        this.currentATMState = new IdleState();
    }

    public static ATM getAtmInstance()
    {
        if (atmInstance == null)
            atmInstance = new ATM();

        return atmInstance;
    }

    public ATMState getCurrentATMState()
    {
        return currentATMState;
    }

    public void setCurrentATMState(ATMState currentATMState)
    {
        this.currentATMState = currentATMState;
    }

    public int getBalance()
    {
        return balance;
    }

    public void deductATMBalance(int amount)
    {
        balance -= amount;
    }

    public int getNoOfThousandNotes()
    {
        return noOfThousandNotes;
    }

    public int getNoOfFiveHundredNotes()
    {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes()
    {
        return noOfOneHundredNotes;
    }

    public void deductThousandNotes(int number)
    {
        noOfThousandNotes = noOfThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number)
    {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number)
    {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printCurrentATMStatus()
    {
        System.out.println("1000 - " + noOfThousandNotes);
        System.out.println("500 - " + noOfFiveHundredNotes);
        System.out.println("100 - " + noOfOneHundredNotes);
    }
}
