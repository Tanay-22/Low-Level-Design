package atm.states;

import atm.ATM;
import atm.Card;
import atm.TransactionType;

public class SelectOperationState extends ATMState
{
    public SelectOperationState()
    {
        System.out.println("Select the operation of your choice:");
        TransactionType.showAllTransactionTypes();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType type)
    {
        switch (type)
        {
            case CASH_WITHDRAWAL:
                atm.setCurrentATMState(new CashWithdrawalState());
                break;

            case BALANCE_CHECK:
                atm.setCurrentATMState(new CheckBalanceState());
                break;

            case PIN_CHANGE:
                atm.setCurrentATMState(new ChangePinState());
                break;

            default:
                System.out.println("Invalid Option");
                super.exit(atm);
        }
    }
}
