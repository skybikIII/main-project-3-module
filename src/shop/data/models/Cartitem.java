package shop.data.models;

public class Cartitem {
    public final Product product;
    public final int count;
    public Cartitem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
