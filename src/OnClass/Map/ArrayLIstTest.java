package OnClass.Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 29185 on 2017/6/6.
 * 数组类型的一个挨一个
 */
public class ArrayLIstTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(001);
        student.setName("goudan");
        List arrayList = new ArrayList();
        //add
        arrayList.add("zzx");
        arrayList.add(94010);
        arrayList.add(student);
        System.out.println(arrayList+"\n--------------------");
        //set
        arrayList.set(0,"zmy");
        System.out.println(arrayList+"\n--------------------");
        //display  只能用object

        //Iterator
        System.out.println("Iterator!");
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n--------------------");

        //1.foreach

        for (Object o:arrayList) {
            System.out.println(o);
        }
        System.out.println("\n--------------------");
        //for
        System.out.println("for xun huan");
        for(int i =0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        //remove
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.remove(student);
        System.out.println(arrayList+"\n--------------------");
        //clear
        arrayList.clear();
        System.out.println(arrayList+"\n--------------------");

    }
}
