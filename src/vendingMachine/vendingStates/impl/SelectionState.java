package vendingMachine.vendingStates.impl;

import vendingMachine.model.Coin;
import vendingMachine.model.Item;
import vendingMachine.model.VendingMachine;
import vendingMachine.vendingStates.State;

import java.util.List;

public class SelectionState implements State
{
    public SelectionState()
    {
        System.out.println("Currently Vending Machine is in Selection State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception
    {
        throw new Exception("You cannot click on insert coin button in Selection State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception
    {
        // do nothing
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception
    {
        throw new Exception("You cannot insert coin in Selection State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        // 1. get item of codeNumber
        Item item = machine.getInventory().getItem(codeNumber);

        // 2. total amount paid by user
        int paidByUser = 0;
        for (Coin coin: machine.getCoins())
        {
            paidByUser += coin.getValue();
        }
        // 3. compare product price and amount paid by user
        if (paidByUser < item.getPrice())
        {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice());
            refundFullMoney(machine);
            throw new Exception("Insufficient Amount");
        }
        if (paidByUser > item.getPrice())
        {
            getChange(paidByUser - item.getPrice());
        }
        machine.setVendingMachineState(new DispenseState(machine, codeNumber));
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception
    {
        System.out.println("Returned the change in the Coin Dispense Tray");
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        throw new Exception("Product cannot be dispensed Selection State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception
    {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception
    {
        throw new Exception("Inventory cannot be updated in Selection State");
    }
}
