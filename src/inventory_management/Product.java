package inventory_management;

public class Product
{
    private int id;
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.id = 990;
        this.name = name;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
