package shop.data.datasource.catalog;

import shop.data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    public abstract ArrayList<Product> getCatalog();
}
