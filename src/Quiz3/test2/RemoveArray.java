package Quiz3.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/9.
 */
public class RemoveArray {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList();
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ccc");

        Scanner scanner = new Scanner(System.in);
        System.out.println("数组列表中有重复数据：aaa、bbb、ccc\n请输入想移除的数据名字");
        System.out.println(arrayList);
        String name = scanner.next();
        //通过循环判断
        if(arrayList.indexOf(name)==arrayList.lastIndexOf(name)){
            System.out.println("您输入的数据不存在数据重复");
        }else {
            int i = 0;
            for (Object o:arrayList) {
                if(name.equals(o)){
                    i++;
                }
            }
            if(i>1){
                for(int j = 0;j<i-1;j++){
                    arrayList.remove(name);
                }
            }
        }

        System.out.println(arrayList);
    }
}
