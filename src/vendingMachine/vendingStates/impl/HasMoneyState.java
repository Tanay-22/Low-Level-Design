package vendingMachine.vendingStates.impl;

import vendingMachine.model.Coin;
import vendingMachine.model.Item;
import vendingMachine.model.VendingMachine;
import vendingMachine.vendingStates.State;

import java.util.List;

public class HasMoneyState implements State
{
    public HasMoneyState()
    {
        System.out.println("Currently Vending Machine is in  HasMoney State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception
    {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception
    {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception
    {
        System.out.println("Accepted the coin");
        machine.getCoins().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        throw new Exception("You need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception
    {
        throw new Exception("You cannot get change in HasMoney State");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        throw new Exception("Product cannot be dispensed in HasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception
    {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState());

        return machine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception
    {
        throw new Exception("You cannot update inventory in HasMoney State");
    }
}
