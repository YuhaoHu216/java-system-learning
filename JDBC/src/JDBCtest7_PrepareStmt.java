import java.sql.*;

public class JDBCtest7_PrepareStmt {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url= "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);


//        String name = "huyuhao";
//        String pwd = "123456";

        String name = "gjojhsjojio";
        String pwd = "'or'1' = '1";  //mysql注入情况

        //定义sql

        String sql1 = "select * from users where name = ? and password = ?";

        // 获取pstmt对象
        PreparedStatement psmt = conn.prepareStatement(sql1);

//        设置?的值
        psmt.setString(1,"name");
        psmt.setString(2,"pwd");

        //执行sql




        ResultSet rs = psmt.executeQuery();

        if(rs.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }



        //释放资源
        psmt.close();
        conn.close();
        rs.close();
    }
}
