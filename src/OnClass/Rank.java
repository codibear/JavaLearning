package OnClass;

/**
 * Created by 29185 on 2017/5/24.
 */
public class Rank {

    public void rankLittle(StudentSop[] studentSop) {
        for (int i = 0; i < studentSop.length - 1; i++) {
            for (int j = 0; j < studentSop.length - i - 1; j++) {
                float temp;
                if (studentSop[j].getStudentNum() > studentSop[j + 1].getStudentNum()) {
                    temp = studentSop[j].getStudentNum();
                    studentSop[j].setStudentNum(studentSop[j + 1].getStudentNum());
                    studentSop[j + 1].setStudentNum(temp);
                }
            }
        }
        System.out.println("由小到大：");
        for (StudentSop a : studentSop) {
            System.out.println(a.getStudentNum());
        }
    }
    public void rankBig(StudentSop[] studentSop) {
        for (int i = 0; i < studentSop.length - 1; i++) {
            for (int j = 0; j < studentSop.length - i - 1; j++) {
                float temp;
                if (studentSop[j].getStudentNum() < studentSop[j + 1].getStudentNum()) {
                    temp = studentSop[j].getStudentNum();
                    studentSop[j].setStudentNum(studentSop[j + 1].getStudentNum());
                    studentSop[j + 1].setStudentNum(temp);
                }
            }
        }
        System.out.println("由大到小：");
        for (StudentSop a : studentSop) {
            System.out.println(a.getStudentNum());
        }
    }
}
