//字符串倒序
package apidemo;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverse(str));
    }

    public static String reverse(String a){
        String c = "";
        for(int i = a.length() - 1; i >= 0 ; i--){
            char b = a.charAt(i);
            c = c + b;
        }
        return c;
    }
}
