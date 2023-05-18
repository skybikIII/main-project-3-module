package shop.view;

import shop.common.AppView;
import shop.data.models.Product;
import shop.data.services.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {

    final ShopService shopService;

    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        super("Catalog", children);
        this.shopService = shopService;
    }

    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product p : catalog) {
            System.out.println("(" + p.id + ") " + p.title + "\nPrice: " + p.price);    //просмотреть каталог
        }
        System.out.println();
    }
}
