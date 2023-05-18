package shop.data.datasource.catalog;

import shop.data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSource extends CatalogDataSource {
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("id1", "SmartPhone", "Best SmartPhone", 1000, true));
        products.add(new Product("id2", "Laptop", "Best Laptop", 2000, true));
        products.add(new Product("id3", "Watch", "Best Watch", 500, true));
        products.add(new Product("id4", "Phone", "Best Phone", 100, true));
        return products;
    }
}
