package vendingMachine.model;

public class Inventory
{
    private ItemShelf[] inventory;

    public Inventory(int itemCount)
    {
        inventory = new ItemShelf[itemCount];
        initializeEmptyInventory();
    }

    private void initializeEmptyInventory()
    {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++)
        {
            inventory[i] = new ItemShelf();
            inventory[i].setCode(startCode);
            inventory[i].setSoldOut(true);
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception
    {
        for (ItemShelf itemShelf: inventory)
        {
            if(itemShelf.getCode() == codeNumber)
            {
                if(itemShelf.isSoldOut())
                {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                }
                else
                {
                    throw new Exception("Item is already present, you cannot add item here");
                }
            }
        }
    }

    public ItemShelf[] getInventory()
    {
        return inventory;
    }

    public Item getItem(int codeNumber) throws Exception
    {
        for (ItemShelf itemShelf: inventory)
        {
            if(itemShelf.getCode() == codeNumber)
            {
                if(itemShelf.isSoldOut())
                    throw new Exception("Item SOLD OUT !!");

                return itemShelf.getItem();
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber)
    {
        for (ItemShelf itemShelf: inventory)
        {
            if (itemShelf.getCode() == codeNumber)
            {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
