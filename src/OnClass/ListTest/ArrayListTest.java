package OnClass.ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 29185 on 2017/6/6.
 */
public class ArrayListTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(250);
        student.setName("ligoudan");

        List arrayList = new ArrayList();
        arrayList.add("zzx");
        arrayList.add(23);
        arrayList.add(true);
        arrayList.add(student);
        System.out.println(arrayList.get(2));
        System.out.println("------------------------------------------");
        for (int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("----------------");
        arrayList.set(1,"zmy");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object v:arrayList //为什么只能用object
             ) {
            System.out.println(v+"`");
        }
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }
}
