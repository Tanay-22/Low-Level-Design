package book_my_show.model.enums;

public enum SeatCategory
{
    SILVER (200),
    GOLD (350),
    PLATINUM (500);

    private int price;

    SeatCategory(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
