package splitwise.expense;

import splitwise.expense.split.EqualExpenseSplit;
import splitwise.expense.split.ExpenseSplit;
import splitwise.expense.split.PercentageExpenseSplit;
import splitwise.expense.split.UnequalExpenseSplit;

public class SplitFactory
{
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType)
    {
        return switch (splitType)
        {
            case EQUAL -> new EqualExpenseSplit();
            case UNEQUAL -> new UnequalExpenseSplit();
            case PERCENTAGE -> new PercentageExpenseSplit();
            default -> null;
        };
    }
}
