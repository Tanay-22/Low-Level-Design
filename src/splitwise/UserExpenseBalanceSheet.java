package splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet
{
    private Map<String, Balance> userWiseBalance;
    private double totalYourExpense;
    private double totalPayment;
    private double totalYouOwe;
    private double totalYouGetBack;

    public UserExpenseBalanceSheet()
    {
        this.userWiseBalance = new HashMap<>();
        this.totalYourExpense = 0;
        this.totalPayment = 0;
        this.totalYouOwe = 0;
        this.totalYouGetBack = 0;
    }

    public Map<String, Balance> getUserWiseBalance()
    {
        return userWiseBalance;
    }

    public void setUserWiseBalance(Map<String, Balance> userWiseBalance)
    {
        this.userWiseBalance = userWiseBalance;
    }

    public double getTotalYourExpense()
    {
        return totalYourExpense;
    }

    public void setTotalYourExpense(double totalYourExpense)
    {
        this.totalYourExpense = totalYourExpense;
    }

    public double getTotalPayment()
    {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment)
    {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwe()
    {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe)
    {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack()
    {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack)
    {
        this.totalYouGetBack = totalYouGetBack;
    }
}
