package shop.data.services;

import shop.data.datasource.cart.CartDataSource;
import shop.data.datasource.catalog.CatalogDataSource;
import shop.data.datasource.order.OrderDataSource;
import shop.data.models.Cartitem;
import shop.data.models.Order;
import shop.data.models.Product;

import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(CatalogDataSource catalogDataSource, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    public ArrayList<Product> getCatalog() {
        return catalogDataSource.getCatalog();   //получить каталог
    }

    public boolean addToCart(String productID, int count) {
        ArrayList<Product> products = getCatalog();
        for (Product p : products) {
            if (p.id.equals(productID)) {
                cartDataSource.addToCart(p, count);  //добавить продукт в корзину
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cartitem> getCart() {
        return  cartDataSource.getCart();   //получить корзину
    }

    public void createOrder(String name, String phone, String address, String paymentType, String deliveryTime) {
        ArrayList<Cartitem> cart = getCart();
        Order newOrder = new Order(name, phone, address, paymentType, deliveryTime, cart);
        orderDataSource.createOrder(newOrder);     //создать заказ
    }
}
