package OnClass.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 29185 on 2017/6/6.
 */
public class HashMapTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(001);
        student.setName("goudan");

        Map hashMap = new HashMap();
        //put
        hashMap.put("name","zhangzhixiong");
        hashMap.put("age","23");
        hashMap.put("sex","male");
        System.out.println(hashMap);
        //改
        hashMap.put("name","zhangdashuai");
        System.out.println(hashMap);
        //get
        System.out.println(hashMap.get("name"));
        //display
        //1.for 不能实现，因为它是根据key来存取的
        for (int i =0;i<hashMap.size();i++){
            System.out.println(hashMap.get(i));
        }
        // keySet()
        //返回此映射中所包含的键的 Set 视图。
        System.out.println("keySet()"+hashMap.keySet());
        System.out.println("entrySet()"+hashMap.entrySet());
        //2.foreach
        for (Object o:hashMap.keySet()//这里的也要用keySet（）通过键值来获取
             ) {
            System.out.println("keySet()真正输出的"+o);
            System.out.println("get(keySet())"+hashMap.get(o));
        }
        //Iterator 注意我们要通过key值来选取
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()){
            System.out.println("it.next()真正输出的："+it.next());
            System.out.println("get(it.next())：:"+hashMap.get(it.next()));
        }
    }
}
