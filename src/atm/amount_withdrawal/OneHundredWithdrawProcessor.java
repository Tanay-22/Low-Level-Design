package atm.amount_withdrawal;

import atm.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor
{
    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor)
    {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount)
    {
        int required = remainingAmount / 100;
        int balance = remainingAmount % 100;

        if (required <= atm.getNoOfOneHundredNotes())
        {
            atm.deductOneHundredNotes(required);
        }
        else
        {
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance += (required - atm.getNoOfOneHundredNotes()) * 100;
        }
        if (balance != 0)
        {
            System.out.println("Something went wrong");
        }
    }
}
