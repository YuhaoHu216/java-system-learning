//字符串比较
package apidemo;
import java.util.Scanner;

public class logtest {
    public static void main(String[] args) {
        String userName = "HYH";
        String userPassword = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名:");
            String inputUsername = sc.next();
            System.out.println();
            System.out.print("请输入密码:");
            String inputUserpassword = sc.next();

            if(userName.equals(inputUsername) && userPassword.equals(inputUserpassword)){
                System.out.println("登录成功");
                break;
            }else {
                if(i == 2){
                    System.out.println("你他妈玩呢");
                    break;
                }
                System.out.println("你™还有" + (2-i) + "次机会,知道吗");
            }
        }

    }
}
