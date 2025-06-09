import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url= "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql3 = "insert into employee( id, name, gender, salary) values (4,'HPH','M',1800)";
//        String sql1 = "select * from mployee;";
        String sql2 = "insert into employee( id, name, gender, salary) values (3,'HOH','F',500)";

        String sql = "update employee set salary = 300 where id = 2";

        //获取执行sql的对象Statement
        Statement stmt = conn.createStatement();

        try {
            //开启事务
            conn.setAutoCommit(false);
            //执行sql
            int count = stmt.executeUpdate(sql); //返回受影响的行数

//            int i = 1/0;//报错回滚事务将已经修改的数据复原
            int count2 = stmt.executeUpdate(sql3); //返回受影响的行数


            //处理结果
            System.out.println(count);
            System.out.println(count2);
            //提交事务
            conn.commit();
        } catch (Exception throwables) {
            //回滚事务
            conn.rollback();
            throwables.printStackTrace();
        }

        //释放资源
        stmt.close();
        conn.close();
    }
}
