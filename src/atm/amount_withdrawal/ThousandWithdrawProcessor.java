package atm.amount_withdrawal;

import atm.ATM;

public class ThousandWithdrawProcessor extends CashWithdrawProcessor
{
    public ThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor)
    {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount)
    {
        int required = remainingAmount / 1000;
        int balance = remainingAmount % 1000;

        if (required <= atm.getNoOfThousandNotes())
        {
            atm.deductThousandNotes(required);
        }
        else
        {
            atm.deductThousandNotes(atm.getNoOfThousandNotes());
            balance += (required - atm.getNoOfThousandNotes()) * 1000;
        }
        if (balance != 0)
        {
            super.withdraw(atm, balance);
        }
    }
}
