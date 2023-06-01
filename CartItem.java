package data.models;

public class CartItem {
    //Корзина с самим товаром.
    public final Product product;
    public final int count;

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
