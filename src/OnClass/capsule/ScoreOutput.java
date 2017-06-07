package OnClass.capsule;

import OnClass.Rank;
import OnClass.StudentSop;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/23.
 */
public class ScoreOutput {
    public static void main(String [] args){

        StudentSop [] studentSop = new StudentSop[5];

        System.out.println("***************************************");
        System.out.println("*************学生成绩管理系统***********");
        System.out.println("***************************************");
        while (true){
        System.out.println("1.请输入成绩");
        System.out.println("2.输出成绩");
        System.out.println("3.输出最高成绩");
        System.out.println("4.输出最低成绩");
        System.out.println("5.输出总成绩");
        System.out.println("6.输出平均成绩");
        System.out.println("7.排序");
        System.out.println("0.退出系统");

        Scanner input = new Scanner(System.in);
        int flag = input.nextInt();
        switch (flag){
            case 1:
                System.out.println("请输入语文、数学、英语、化学、生物成绩：");
                for(int i = 0;i<5;i++) {
                    StudentSop stu = new StudentSop();
                    float studentNum = input.nextFloat();
                    stu.setStudentNum(studentNum);
                    studentSop[i] = stu;
                }
                break;
            case 2:
                for ( StudentSop v: studentSop)
                {System.out.println(v.getStudentNum());}
                break;
            case 3:
                float max =  studentSop[0].getStudentNum();
                for(int i = 0;i<studentSop.length;i++){
                    if(studentSop[i].getStudentNum()>max){
                        max = studentSop[i].getStudentNum();
                    }
                }
                System.out.println("最高成绩："+max);
                break;
            case 4:
                float min = studentSop[0].getStudentNum();
                for(int i = 0;i<studentSop.length ;i++){
                    if(min > studentSop[i].getStudentNum()){
                        min = studentSop[i].getStudentNum();
                    }
                }
                System.out.println("最低成绩："+min);
                break;
            case 5:
                float sum = 0;
                for(StudentSop a:studentSop){
                    sum+=a.getStudentNum();
                }
                System.out.println("总成绩："+sum);
                break;
            case 6:
                float aver = 0;
                for(StudentSop a:studentSop){
                    aver+=a.getStudentNum();
                }
                System.out.println("平均成绩："+aver/studentSop.length);
                break;
            case 7:
                //由大到小
                Rank rank = new Rank();
                rank.rankLittle(studentSop);
                rank.rankBig(studentSop);
                /*for(int i = 0;i<studentSop.length-1;i++){
                    for(int j = 0;j<studentSop.length-i-1;j++){
                        float temp;
                        if(studentSop[j].getStudentNum()<studentSop[j+1].getStudentNum()){
                            temp = studentSop[j].getStudentNum();
                            studentSop[j].setStudentNum(studentSop[j+1].getStudentNum());
                            studentSop[j+1].setStudentNum(temp) ;
                        }
                    }
                }

                for(StudentSop a:studentSop){
                    System.out.println(a.getStudentNum());
                }*/
                break;
                default:
                    break;
        }}
    }
}
