package OnClass.Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 29185 on 2017/6/6.
 * HashMap没有顺序可言，内容不重复，不保证顺序---------------------------------------------------------------------------
 */
public class HashSetTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(001);
        student.setName("goudan");

        Set set = new HashSet();
        //add
        set.add(student);
        set.add("zhangzhixiong");
        set.add("zhangzhixiong");
        set.add(23);
        System.out.println(set.contains("zhangzhixiong"));
        //get   无get方法，只能循环，迭代器取出

        //set  无set方法，没法改

        //display
        //1.for  因为没有get方法，所以也不能单纯用for循环取出

        //2.foreach
        for (Object o:set
             ) {
            System.out.println(o);
        }
        System.out.println("____________________________________");
        //3.Iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        /**
         * 注意hashSet内部不会存储重复的值
         */
        System.out.println("不会存储重复的值！");
        set.add("zhangzhixiong");
        set.add(student);
        for (Object o:set
                ) {
            System.out.println(o);
        }
        System.out.println("____________________________________");

        //remove
        set.remove("zhangzhixiong");
        for (Object o:set
                ) {
            System.out.println(o);
        }
        System.out.println("____________________________________");

        //clear
        set.clear();
        for (Object o:set
                ) {
            System.out.println(o);
        }
        System.out.println("____________________________________");
    }
}
