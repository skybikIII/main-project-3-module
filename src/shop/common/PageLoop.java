package shop.common;

import java.util.Scanner;

public class PageLoop {
    final AppView view;
    public PageLoop(AppView view) {
        this.view = view;
    }

    public void run() {
        while (true) {
            view.action();
            displayChildren();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose a page: ");
            int value = scanner.nextInt();
            if (value < 0 || value > view.children.size() + 1)
                System.out.println("Wrong value");          //запуск разделов и подразделов
            else if (value == view.children.size() + 1)
                break;
            else {
                AppView selectedView = view.children.get(value - 1);
                new PageLoop(selectedView).run();;
            }
        }
    }

    void displayChildren() {
        System.out.println(view.title);
        System.out.println("Chose from 1 to " + (view.children.size() + 1) + " ");
        for (int i = 0; i < view.children.size(); i++) {
            AppView vview = view.children.get(i);
            System.out.println(i + 1 + " - " + vview.title);        //меню для разделов и подразделов
        }
        System.out.println(view.children.size() + 1 + " - Back");
    }
}
