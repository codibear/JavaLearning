package JavaStyle.Gen.Interface;

/**
 * Created by 29185 on 2017/6/7.
 * 可能存书也可能存电脑
 */
public class Store <E> {
    private E[] room;
    private int quantity;
    private int index;

    public void setRoom(E[] room){
        this.room = room;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void save(E e){
        if(index>=quantity){
            System.out.println("满了！");
            return;
        }
        room[quantity] = e;
        quantity++;
    }

    public void view(){
        for (E e:room){
            System.out.println(e);
        }
    }
}
