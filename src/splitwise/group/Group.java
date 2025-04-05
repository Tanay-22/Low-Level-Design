package splitwise.group;

import splitwise.Expense;
import splitwise.expense.split.Split;
import splitwise.user.User;
import splitwise.expense.ExpenseController;
import splitwise.expense.ExpenseSplitType;

import java.util.ArrayList;
import java.util.List;

public class Group
{
    private final int id;
    private String name;
    private final List<User> groupMembers;
    private final List<Expense> expenses;
    private final ExpenseController expenseController;

    public Group(int id)
    {
        this.id = id;
        this.groupMembers = new ArrayList<>();
        this.expenses = new ArrayList<>();
        this.expenseController = new ExpenseController();
    }

    public void addMember(User member)
    {
        this.groupMembers.add(member);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<User> getGroupMembers()
    {
        return groupMembers;
    }

    public List<Expense> getExpenses()
    {
        return expenses;
    }

    public ExpenseController getExpenseController()
    {
        return expenseController;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, List<Split> splitDetails,
                                 ExpenseSplitType splitType, User paidByUser)
    {
//        Expense expense = expenseController.
        return null;
    }
}
