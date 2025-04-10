package inventory_management;


import java.util.Map;

public class Order
{
    private final User user;
    private final Address address;
    private final Map<Product, Integer> productQuantityMap;
    private OrderStatus orderStatus;

    public Order(User user, Address address, Map<Product, Integer> productQuantityMap)
    {
        this.user = user;
        this.address = address;
        this.productQuantityMap = productQuantityMap;
    }

    public User getUser()
    {
        return user;
    }

    public Address getAddress()
    {
        return address;
    }

    public Map<Product, Integer> getProductQuantityMap()
    {
        return productQuantityMap;
    }

    public OrderStatus getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus)
    {
        this.orderStatus = orderStatus;
    }
}
