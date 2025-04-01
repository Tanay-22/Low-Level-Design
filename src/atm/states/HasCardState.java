package atm.states;

import atm.ATM;
import atm.Card;
import atm.TransactionType;

public class HasCardState extends ATMState
{
    public HasCardState()
    {
        System.out.println("Enter you card pin");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin)
    {
        if (card.isCorrectPin(pin))
        {
            atm.setCurrentATMState(new SelectOperationState());
        }
        else
        {
            System.out.println("Invalid Pin");
            super.exit(atm);
        }
    }
}
