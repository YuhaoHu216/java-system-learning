import java.util.Scanner;
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("判断输入两个数是否相同：");
        int a = sc.nextInt();
        int b = sc.nextInt();

        String c = a == b ? "相同" : "不同";
        System.out.println(c);
    }
}
