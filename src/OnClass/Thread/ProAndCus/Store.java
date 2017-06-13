package OnClass.Thread.ProAndCus;

import java.util.ArrayList;

/**
 * Created by 29185 on 2017/6/8.
 */
public class Store {
    public static int num = 0;
    public static final int size = 100;
    public static ArrayList<String> store = new ArrayList<>();

    public static int getNum() {
        return num;
    }
    public ArrayList<String> getStore() {
        return store;
    }

    public static int getSize() {
        return size;
    }

    public static void addNum(int num) {
        Store.num += num;
    }
    public static void deleteNum(int num){
        Store.num -= num;
    }

    public static void setStore(String store) {
        Store.store.add(store);
    }
    public static void deleteStroe(String store){
        Store.store.remove(store);
    }
}
