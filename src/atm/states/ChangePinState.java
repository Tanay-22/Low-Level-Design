package atm.states;

import atm.ATM;
import atm.Card;

public class ChangePinState extends ATMState
{
    @Override
    public void changePin(ATM atm, Card card, int oldPin, int newPin)
    {
        if (card.isCorrectPin(oldPin))
        {
            card.setPin(newPin);
            System.out.println("Pin changed successfully");
            atm.setCurrentATMState(new SelectOperationState());
        }
    }
}
