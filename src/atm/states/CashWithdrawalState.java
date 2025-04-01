package atm.states;

import atm.ATM;
import atm.Card;
import atm.amount_withdrawal.CashWithdrawProcessor;
import atm.amount_withdrawal.FiveHundredWithdrawProcessor;
import atm.amount_withdrawal.OneHundredWithdrawProcessor;
import atm.amount_withdrawal.ThousandWithdrawProcessor;

public class CashWithdrawalState extends ATMState
{
    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount)
    {
        if (atm.getBalance() < withdrawalAmount)
        {
            System.out.println("Insufficient balance in ATM");
        }
        else if (card.getBankAccount().getBalance() < withdrawalAmount)
        {
            System.out.println("Insufficient balance in your Bank Account");
        }
        else
        {
            card.getBankAccount().withdraw(withdrawalAmount);
            atm.deductATMBalance(withdrawalAmount);

            CashWithdrawProcessor withdrawProcessor = new ThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(
                    new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atm, withdrawalAmount);
        }
        exit(atm);
    }
}
