package basic2.com.helloshop.order;

import basic2.com.helloshop.product.Product;
import basic2.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
