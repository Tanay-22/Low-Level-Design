package inventory_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Inventory
{
    private final List<ProductCategory> productCategories;

    public Inventory()
    {
        this.productCategories = new ArrayList<>();
    }

    public List<ProductCategory> getProductCategories()
    {
        return productCategories;
    }

    public void addProduct(Product product, int productCategoryId)
    {
        Optional<ProductCategory> productCategoryOptional = productCategories.stream()
                .filter(productCategory -> productCategory.getId() == productCategoryId)
                .findFirst();
        productCategoryOptional.ifPresent(productCategory -> productCategory.addProduct(product));
    }
}
