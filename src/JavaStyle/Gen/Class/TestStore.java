package JavaStyle.Gen.Class;

/**
 * Created by 29185 on 2017/6/7.
 */
public class TestStore {
    public static void main(String[] args) {
        Book [] roomBook = new Book[]{new Book("java",34),new Book("C",35)};
        Computer[] roomComputer = new Computer[]{new Computer("lenovo",5000),new Computer("ThinkPad",4500),new Computer("Apple",6000)};

        //使用泛型类
        Store bookStore = new Store();//一般我们都这么些
        Store <Book> bookStore1 = new Store<Book>();
        bookStore1.setRoom(roomBook);
        bookStore1.setQuantity(2);
        bookStore1.view();
        System.out.println("------------------------");

        Store<Computer> computerStore = new Store<Computer>();
        computerStore.setRoom(roomComputer);
        computerStore.setQuantity(3);
        computerStore.view();
    }
}
