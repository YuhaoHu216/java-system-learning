import java.sql.*;

public class JDBCtest1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url= "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql
//        String sql = "insert into employee( id, name, gender, salary) values (2,'HJH','M',100)";
        String sql = "select * from mployee;";

        //获取执行sql的对象Statement
        Statement stmt = conn.createStatement();

        //执行sql
        int count = stmt.executeUpdate(sql); //返回受影响的行数
          //返回受影响的行数

        //处理结果
        System.out.println(count);

        //释放资源
        stmt.close();
        conn.close();
    }
}
