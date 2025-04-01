package atm.amount_withdrawal;

import atm.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor
{
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor)
    {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount)
    {
        int required = remainingAmount / 500;
        int balance = remainingAmount % 500;

        if (required <= atm.getNoOfFiveHundredNotes())
        {
            atm.deductFiveHundredNotes(required);
        }
        else
        {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance += (required - atm.getNoOfFiveHundredNotes()) * 500;
        }
        if (balance != 0)
        {
            super.withdraw(atm, balance);
        }
    }
}
