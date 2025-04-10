package inventory_management;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory
{
    private int id;
    private String name;
    private final List<Product> products;

    public ProductCategory()
    {
        this.products = new ArrayList<>();
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

    public List<Product> getProducts()
    {
        return products;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }
}
