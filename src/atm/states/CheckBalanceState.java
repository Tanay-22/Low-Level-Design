package atm.states;

import atm.ATM;
import atm.Card;

public class CheckBalanceState extends ATMState
{
    @Override
    public void displayBalance(ATM atm, Card card)
    {
        System.out.println("Your current balance is: ₹" + card.getBankAccount().getBalance());
    }
}
