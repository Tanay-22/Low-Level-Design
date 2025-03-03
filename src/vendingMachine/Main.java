package vendingMachine;

import vendingMachine.model.*;
import vendingMachine.vendingStates.State;

public class Main
{
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();
        try
        {
            System.out.println("| filling up inventory |");
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("| clicking on Insert Coin Button |");
            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.NICKELS);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("| Clicking on Product Selection Button |");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 104);

            displayInventory(vendingMachine);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine)
    {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++)
        {
            Item newItem = new Item();
            if (i < 3)
            {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }
            else if (i < 5)
            {
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(10);
            }
            else if (i < 7)
            {
                newItem.setType(ItemType.MIRANDA);
                newItem.setPrice(9);
            }
            else
            {
                newItem.setType(ItemType.THUMBS_UP);
                newItem.setPrice(15);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine machine)
    {
        ItemShelf[] slots = machine.getInventory().getInventory();
        for (ItemShelf slot : slots)
        {
            System.out.println("CodeNumber: " + slot.getCode() +
                    " Item: " + slot.getItem().getType().name() +
                    " Price: " + slot.getItem().getPrice() +
                    " isAvailable: " + !slot.isSoldOut());
        }
    }
}
