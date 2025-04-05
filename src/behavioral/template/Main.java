package behavioral.template;

public class Main
{
    public static void main(String[] args)
    {
        PaymentFlow payToFriend = new PayToFriendFlow();
        PaymentFlow payToMerchant = new PayToMerchantFlow();

        payToFriend.sendMoney();
        System.out.println("-------------------------------");
        payToMerchant.sendMoney();

    }
}
