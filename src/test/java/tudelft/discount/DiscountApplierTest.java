package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void DiscApply(){
        Product product1 = new Product("name", 25.5, "BUSINESS");
        Product product2 = new Product("name", 25.5, "HOME");
        ProductDao dao = new ProductDao() {
            @Override
            public List<Product> all() {
                List<Product> products = new ArrayList<Product>();
                products.add(product1);
                products.add(product2);

                return products;
            }
        };
        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

        Assertions.assertEquals(product1.getPrice(), 22.95);
        Assertions.assertEquals(product2.getPrice(), 28.05);
    }

}
