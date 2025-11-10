package basic2.ref.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orders = {createOrder("두부", 1000, 4), createOrder("김치", 4000, 5)};
        printOrders(orders);
        int totalPrice = getTotalPrice(orders);
        System.out.println(totalPrice);

    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + " " + order.price + " " + order.quantity);
        }
    }
    static int getTotalPrice(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
