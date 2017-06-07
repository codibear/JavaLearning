package OnClass.Map;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 29185 on 2017/6/6.
 */
public class LinkedListTest {
    public static void main(String [] args) {

        Student student = new Student();
        student.setId(001);
        student.setName("goudan");


        List linkedList = new LinkedList();
        //add
        linkedList.add("zhangzhixiong");
        linkedList.add(23);
        linkedList.add('男');
        linkedList.add("baskt");
        linkedList.add(student);
        //get
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);
        System.out.println("---------------------");
        //set-------------------------set不能超过已有的范围
        linkedList.set(3,"football");
        //display
        //1.Iterator
        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //2.foreach
        System.out.println("--------------------------");
        for(Object o : linkedList){
            System.out.println(o);
        }
        //3.for
        System.out.println("-------------------------");
        for (int i = 0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        //delete
        linkedList.remove("zhangzhixiong");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);


    }
}
