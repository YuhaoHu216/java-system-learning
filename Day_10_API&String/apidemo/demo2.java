//字符串的拆分
package apidemo;
import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String a = sc.next();


        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.println(c);
        }
    }
}
