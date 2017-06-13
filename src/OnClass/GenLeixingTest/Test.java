package OnClass.GenLeixingTest;

import java.util.ArrayList;

/**
 * Created by 29185 on 2017/6/8.
 * 通过foreach循环可以调用类型的方法，但是必须给arraylist指定类型。
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student student = new Student();
        arrayList.add(student);
        for (Student s:arrayList) {

        }
    }
}
