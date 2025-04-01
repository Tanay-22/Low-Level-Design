package atm;


public class ATMRoom
{
    private ATM atm;
    private User user;

    private void initialize()
    {
        atm = ATM.getAtmInstance();
        atm.initializeATM(10, 10, 10);
        this.user = createUser();
    }

    private User createUser()
    {
        Card card = createCard();
        return new User(card, card.getBankAccount());
    }

    private Card createCard()
    {
        return new Card(56345345, 567, "Jake Lockley", createBankAccount(), 987456);
    }

    private BankAccount createBankAccount()
    {
        return new BankAccount(5000);
    }

    public static void main(String[] args)
    {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        System.out.println(atmRoom.atm.getCurrentATMState());
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), 987456);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.getCard(), 2800);
        atmRoom.atm.printCurrentATMStatus();

    }

}
