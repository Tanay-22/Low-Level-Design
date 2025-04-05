package behavioral.template;

public class PayToMerchantFlow extends PaymentFlow
{
    @Override
    public void validateRequest()
    {
        System.out.println("Validate logic of PayToMerchant");
    }

    @Override
    public void calculateFees()
    {
        System.out.println("2% fees charged");
    }

    @Override
    public void debitAmount()
    {
        System.out.println("Debit the Amount logic of PayToMerchant");
    }

    @Override
    public void creditAmount()
    {
        System.out.println("Credit the remaining amount");
    }
}
