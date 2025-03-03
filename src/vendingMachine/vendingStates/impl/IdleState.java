package vendingMachine.vendingStates.impl;

import vendingMachine.model.Coin;
import vendingMachine.model.Item;
import vendingMachine.model.VendingMachine;
import vendingMachine.vendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State
{
    public IdleState()
    {
        System.out.println("Currently Vending Machine is in idle state");
    }

    public IdleState(VendingMachine machine)
    {
        System.out.println("Currently Vending Machine is in idle state");
        machine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception
    {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception
    {
        throw new Exception("First, you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception
    {
        throw new Exception("You cannot insert Coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        throw new Exception("You cannot choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception
    {
        throw new Exception("You cannot get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        throw new Exception("Product cannot be dispensed in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception
    {
        throw new Exception("You cannot get refunded in idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception
    {
        machine.getInventory().addItem(item, codeNumber);
    }
}
