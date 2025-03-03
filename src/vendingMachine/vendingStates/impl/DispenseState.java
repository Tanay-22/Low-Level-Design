package vendingMachine.vendingStates.impl;

import vendingMachine.model.Coin;
import vendingMachine.model.Item;
import vendingMachine.model.VendingMachine;
import vendingMachine.vendingStates.State;

import java.util.List;

public class DispenseState implements State
{
    public DispenseState(VendingMachine machine, int codeNumber) throws Exception
    {
        System.out.println("Currently Vending Machine is in Dispense State");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception
    {
        throw new Exception("insert coin button cannot be clicked in Dispense State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception
    {
        throw new Exception("Product selection button cannot be clicked in Dispense State");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception
    {
        throw new Exception("Coin cannot be inserted in Dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        throw new Exception("Product selection cannot be done in Dispense State");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception
    {
        throw new Exception("Change cannot be returned in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));

        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception
    {
        throw new Exception("Refund is not available in Dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception
    {
        throw new Exception("Inventory cannot be updated in Dispense state");
    }
}
