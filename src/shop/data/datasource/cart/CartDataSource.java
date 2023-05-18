package shop.data.datasource.cart;

import shop.data.models.Cartitem;
import shop.data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    public abstract void addToCart(Product product, int count);
    public abstract ArrayList<Cartitem> getCart();
}
