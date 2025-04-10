package inventory_management;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private int id;
    private String name;
    private final List<Address> addresses;
    private final Cart cart;
    private final List<Order> orders;

    public User()
    {
        this.addresses = new ArrayList<>();
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Address> getAddresses()
    {
        return addresses;
    }

    public Cart getCart()
    {
        return cart;
    }

    public List<Order> getOrders()
    {
        return orders;
    }
}
