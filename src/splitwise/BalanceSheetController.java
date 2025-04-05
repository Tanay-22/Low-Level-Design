package splitwise;

import splitwise.expense.split.Split;
import splitwise.user.User;

import java.util.List;

public class BalanceSheetController
{
    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount)
    {
        // update the total amount paid of the expense paid by user
        UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidBy.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalExpenseAmount);

        for (Split split: splits)
        {
//            User userOwe = split.get
        }
    }
}
