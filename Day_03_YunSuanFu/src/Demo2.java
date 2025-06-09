import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //先写录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        int gw,sw,bw;
        gw = num % 10;
        sw = num % 100 / 10;
        bw = num / 100;
        System.out.println("该三位数百位：");
        System.out.println(bw);
        System.out.println("该三位数十位：");
        System.out.println(sw);
        System.out.println("该三位数个位：" + gw);
        System.out.println(gw);
    }
}
