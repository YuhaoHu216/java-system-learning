import pojo.employee;

import java.sql.*;
import java.util.ArrayList;

public class JDBCtest5_resultset {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql = "select * from employee";

        //获取statement对象
        Statement stmt = conn.createStatement();

        //执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //创建职员列表
        ArrayList<employee> emp = new ArrayList<>();

        //处理结果
        while(rs.next()){
            employee a = new employee();

            a.setId(rs.getInt("id"));
            a.setName(rs.getString("name"));
            a.setGender(rs.getString("gender"));
            a.setSalary(rs.getInt("salary"));

            emp.add(a);
        }

        //看结果
        System.out.println(emp);
        //释放资源
        rs.close();
        stmt.close();
        conn.close();

    }
}
