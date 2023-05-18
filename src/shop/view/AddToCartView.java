package shop.view;

import shop.common.AppView;
import shop.data.services.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class AddToCartView extends AppView {

    final ShopService shopService;

    public AddToCartView(ShopService shopService) {
        super("Add to cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String productId = scanner.nextLine();
        if (productId == null)
            return;
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        final boolean res = shopService.addToCart(productId, count);     //визуализация и добавление продукта в корзину
        if (res)
            System.out.println("Success");
        else
            System.out.println("Failure");
    }
}
