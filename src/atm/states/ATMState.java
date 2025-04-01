package atm.states;

import atm.ATM;
import atm.Card;
import atm.TransactionType;

public abstract class ATMState
{
    public void insertCard(ATM atm, Card card)
    {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin)
    {
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType type)
    {
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount)
    {
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card)
    {
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard()
    {
        System.out.println("Please collect your card");
    }

    public void exit(ATM atm)
    {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exiting the ATM");
    }

    public void changePin(ATM atm, Card card, int oldPin, int newPin)
    {
        System.out.println("OOPS!! Something went wrong");
    }
}
