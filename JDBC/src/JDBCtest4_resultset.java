import java.sql.*;

public class JDBCtest4_resultset {
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

        //处理结果
        while(rs.next()){
            //获取数据
//            int id = rs.getInt(1);
//            String name = rs.getString(2);
//            int salary = rs.getInt(4);
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int salary = rs.getInt("salary");


            System.out.println(id);
            System.out.println(name);
            System.out.println(salary);
            System.out.println("-".repeat(10));
        }
        //释放资源
        rs.close();
        stmt.close();
        conn.close();

    }
}
