package basic2.ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int choice = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[choice];
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String productName = sc.next();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }
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
