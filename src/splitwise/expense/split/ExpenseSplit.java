package splitwise.expense.split;

import java.util.List;

public interface ExpenseSplit
{
    void validateSplitRequest(List<Split> splits, double totalAmount);
}
