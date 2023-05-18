package shop.data.datasource.order;

import shop.data.models.Order;

public abstract class OrderDataSource {
    public abstract void createOrder(Order order);
    public abstract Order getOrder();
}
