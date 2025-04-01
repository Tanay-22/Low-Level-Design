package atm.states;

import atm.ATM;
import atm.Card;

public class IdleState extends ATMState
{
    public IdleState()
    {
        System.out.println("Insert card ↑");
    }

    @Override
    public void insertCard(ATM atm, Card card)
    {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
