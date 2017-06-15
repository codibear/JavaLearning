package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by 29185 on 2017/6/14.
 */
public class Etes {
    public static void main(String[] args) {
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epet","root","root");
            if(connection==null){
                System.out.println("fail");
            }else {
                System.out.println("success");
            }
            String sql = "insert into etes(eid,ename)values(?,?)";

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1,1);
            pst.setString(2,"zzx");
            int num = pst.executeUpdate();
            if(num>0) System.out.println("insert success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
