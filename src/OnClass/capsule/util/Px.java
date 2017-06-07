package OnClass.capsule.util;

import OnClass.capsule.po.Student;

/**
 * Created by 29185 on 2017/6/1.
 */
public class Px {
    //排序由大到小
    public void sort(Student[] student){
        for(int i = 0;i<student.length-1;i++){
            for(int j = 0;j<student.length-1-i;j++){
                if(student[j].getScore()<student[j+1].getScore()){
                    Student temp;
                    temp = student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }
        }
    }
}
