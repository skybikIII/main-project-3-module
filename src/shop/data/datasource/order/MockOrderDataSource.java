package shop.data.datasource.order;

import shop.data.models.Order;

public class MockOrderDataSource extends OrderDataSource {
    private Order order;
    @Override
    public void createOrder(Order order) {
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
