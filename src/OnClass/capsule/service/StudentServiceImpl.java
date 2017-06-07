package OnClass.capsule.service;

import OnClass.capsule.po.Student;
import OnClass.capsule.util.Px;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/1.
 */
public class StudentServiceImpl implements StudentService{
    Student student = new Student();
    Px p = new Px();
    @Override
    public void input(Student[] stu, Scanner input) {
        for(int i=0;i<stu.length;i++){
            double score = input.nextDouble();
            student.setScore(score);
            stu[i] =  student;
        }
    }
    @Override
    public void output(Student[] students) {
        for (Student a : students) {
            System.out.println(a.getScore());
        }
    }

    @Override
    public void minScore(Student[] students) {
        p.sort(students);
        System.out.println(students[students.length]);
    }

    @Override
    public void maxScore(Student[] students) {
        p.sort(students);
        System.out.println(students[0]);
    }

    @Override
    public void sumSore(Student[] students) {
        double sum=0;
        for (Student a:students) {
            sum+=a.getScore();
        }
        System.out.println(sum);
    }

    @Override
    public void sort(Student[] students) {
        p.sort(students);
        for (Student a:students) {
            System.out.println(a.getScore());
        }
    }
}
