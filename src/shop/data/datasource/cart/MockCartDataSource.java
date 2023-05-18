package shop.data.datasource.cart;

import shop.data.models.Cartitem;
import shop.data.models.Product;

import java.util.ArrayList;

public class MockCartDataSource extends CartDataSource {

    private ArrayList<Cartitem> cart = new ArrayList<>();
    @Override
    public void addToCart(Product product, int count) {
        cart.add(new Cartitem(product, count));
    }

    @Override
    public ArrayList<Cartitem> getCart() {
        return cart;
    }
}
