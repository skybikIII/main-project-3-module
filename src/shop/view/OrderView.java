package shop.view;

import shop.common.AppView;
import shop.data.services.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView extends AppView {

    ShopService shopService;
    public OrderView(ShopService shopService) {
        super("Ordering", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your phone: ");
        String phone = scanner.nextLine();          //������� �����
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        shopService.createOrder(name, phone, address, "���", "opt");
    }
}
