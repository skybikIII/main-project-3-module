package shop.view;

import shop.common.AppView;
import shop.data.models.Cartitem;
import shop.data.services.ShopService;

import java.util.ArrayList;

public class CartView extends AppView {

    final ShopService shopService;

    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<Cartitem> cart = shopService.getCart();
        for (Cartitem item : cart) {
            System.out.println("(" + item.product.id + ") " + item.product.title + "\nPrice: " + item.product.price);     //просмотреть корзину
        }
        System.out.println();
    }
}
