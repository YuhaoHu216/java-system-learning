import java.util.Scanner;
public class Damo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("晚饭想吃什么(输入q来退出)：");
            String dinner = sc.next();
            if (dinner == "q")
                break;

            switch (dinner) {
                case "凉面","方便面":
                    System.out.println("吃\n");
                    break;
                case "拌饭":
                    System.out.println("吃\n");
                    break;
                case "铁牛牛肉面":
                    System.out.println("吃\n");
                    break;
                case "掉渣饼":
                    System.out.println("吃\n");
                    break;
                default:
                    System.out.println("你他妈来找茬的吧\n");
                    break;
            }

        }
    }
}
