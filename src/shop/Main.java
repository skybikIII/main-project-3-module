package shop;

import shop.common.AppView;
import shop.common.PageLoop;
import shop.data.datasource.cart.CartDataSource;
import shop.data.datasource.cart.MockCartDataSource;
import shop.data.datasource.catalog.CatalogDataSource;
import shop.data.datasource.catalog.MockCatalogDataSource;
import shop.data.datasource.order.MockOrderDataSource;
import shop.data.datasource.order.OrderDataSource;
import shop.data.services.ShopService;
import shop.view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CartDataSource cartDataSource = new MockCartDataSource();
        CatalogDataSource catalogDataSource = new MockCatalogDataSource();
        OrderDataSource orderDataSource = new MockOrderDataSource();
        ShopService shopService = new ShopService(catalogDataSource, cartDataSource, orderDataSource);

        AppView appToCartView = new AddToCartView(shopService);

        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(appToCartView);
        AppView catalogView = new CatalogView(shopService, catalogChildren);
        AppView cartView = new CartView(shopService);
        AppView orderView = new OrderView(shopService);

        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        AppView mainView = new MainView(mainChildren);

        new PageLoop(mainView).run();
    }
}
