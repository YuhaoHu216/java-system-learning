import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你自己的时髦度：");
        int myfashion = sc.nextInt();
        System.out.println("输入对象的时髦度：");
        int girlfashion = sc.nextInt();

        boolean outcome = myfashion > girlfashion;
        System.out.println(outcome);
    }
}
