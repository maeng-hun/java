package basic2.construct;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book();
        book.displayInfo();

        Book book2 = new Book("안녕", "안녕");
        book2.displayInfo();

        Book book3 = new Book("안녕2", "안녕2", 2);
        book3.displayInfo();
    }
}
