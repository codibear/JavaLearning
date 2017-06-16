package jdbc.jdbcOOP.test;

import jdbc.jdbcOOP.util.DButil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 29185 on 2017/6/14.
 */
public class DButilTest {
    static ResultSet rs=null;
    public static void main(String[] args) {
        DButil dButil =  new DButil();
       /*
       String sql = "insert into student(sid,studentNum,studentName,age,sex)values(?,?,?,?)";

        增加------问：bid和ssid怎么添加

        Student student = new Student();
        Banji banji = new Banji();
        banji.setbId(2);
        banji.setbName("计算机科学与技术");

        student.setStudentNum("4140206231");
        student.setSex('男');
        student.setBanji(banji);
        student.setStudentName("张志雄");
        Object [] objects = {1,"4140206231","张志雄",23,"男"};
        new DButil().insert(sql,objects);*/




        //查询--教师2所交的班级
       /*String sql = "select * from teacher";
        List<Teacher> teachers = new ArrayList<>();

        ResultSet rs = new DButil().select(sql,null);
        try {
            while (rs.next()){
                List<Banji> banjis = new ArrayList<>();
                Teacher teacher = new Teacher();
                teacher.setTeacherName( rs.getString("teacherName"));
                teacher.setTeacherNum( rs.getString("teacherNum"));
                teacher.settId( rs.getInt("tid"));
                System.out.println(teacher);

                String string = "select * from banji,teacher_banji where banji.bid = teacher_banji.bid and teacher_banji.tid=?";
                Object [] objects = {teacher.gettId()};
                ResultSet rs2 = new DButil().select(string,objects);
                while (rs2.next()){
                    Banji banji = new Banji();
                    banji.setbId(rs2.getInt("bid"));
                    banji.setbName(rs2.getString("bname"));

                    banjis.add(banji);
                }
                teacher.setBanjis(banjis);
                teachers.add(teacher);
            }
            for (Teacher t : teachers){
                int id = t.gettId();
                String tname = t.getTeacherName();
                String tnum = t.getTeacherNum();
                List <Banji> list = t.getBanjis();
                System.out.print(id+"\t\t"+tname);
                for (Object o:list) {
                    Banji banji = (Banji)o;
                    System.out.print("\t\t"+banji.getbId()+banji.getbName());
                }
                System.out.println("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

       //查询教每一班的老师都有谁

        String sql = "select * from banji";

        rs = dButil.select(sql,null);
        try {
            while(rs.next()){
                rs.getInt("bid");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
