package atm;

import java.util.Arrays;

public enum TransactionType
{
    CASH_WITHDRAWAL,
    BALANCE_CHECK,
    PIN_CHANGE;

    public static void showAllTransactionTypes()
    {
        Arrays.stream(TransactionType.values()).forEach(System.out::println);
    }
}
