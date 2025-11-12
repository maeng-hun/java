package basic2.access;

public class ShopingCart {
    private Item[] items = new Item[10];
    private int itemCount;

   public void addItem(Item item) {
       if(itemCount >= items.length) {
           System.out.println("장바구니가 초과 했습니다.");
       } else {
           items[itemCount] = item;
           itemCount++;
       }
   }

   public void displayItems() {
       System.out.println("장바구니 상품 출력");
       int cartTotalPrice = 0;
       for (int i = 0; i < itemCount; i++) {
           System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].totalPrice());
           cartTotalPrice += items[i].totalPrice();
       }
       System.out.println("전체 가격 합 : " + cartTotalPrice);
   }

}
