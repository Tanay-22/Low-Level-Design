package splitwise.user;

import splitwise.UserExpenseBalanceSheet;

public class User
{
    private final int id;
    private final String name;
    private final UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet()
    {
        return userExpenseBalanceSheet;
    }
}
