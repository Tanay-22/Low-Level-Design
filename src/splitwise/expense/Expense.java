package splitwise.expense;

import splitwise.expense.split.Split;
import splitwise.user.User;

import java.util.List;

public class Expense
{
    private int id;
    private String description;
    private double expenseAmount;
    private User paidByUser;
    private ExpenseSplitType splitType;
    List<Split> splitDetails;

    public Expense(int id, String description, double expenseAmount, User paidByUser, ExpenseSplitType splitType, List<Split> splitDetails)
    {
        this.id = id;
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails = splitDetails;
    }
}
