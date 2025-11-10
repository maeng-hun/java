package basic2.class1;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder order = new  ProductOrder();
        order.productName = "김치";
        order.price = 200;
        order.quantity = 1;

        ProductOrder order2 = new  ProductOrder();
        order2.productName = "두부";
        order2.price = 400;
        order2.quantity = 3;

        ProductOrder order3 = new  ProductOrder();
        order3.productName = "콜라";
        order3.price = 4400;
        order3.quantity = 10;
        ProductOrder[] orders = {order, order2, order3};



        int totalAmount = 0;
        for (ProductOrder od : orders) {
            System.out.println(od.productName + " " + od.price + " " + od.quantity);
            totalAmount += od.price * od.quantity;
        }
        System.out.println("총 가격 : " + totalAmount);

    }
}
