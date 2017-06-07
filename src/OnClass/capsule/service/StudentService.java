package OnClass.capsule.service;

import OnClass.capsule.po.Student;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/1.
 */
public interface StudentService {
    public abstract void input(Student[] students, Scanner input);
    public abstract void output(Student[] students);
    public abstract void minScore(Student[] students);
    public abstract void maxScore(Student[] students);
    public abstract void sumSore(Student[] students);
    public abstract void sort(Student[] students);
}
