import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入酒量：");
        int a = sc.nextInt();
        if (a>10)
        {
          System.out.println("6666");
        }
        else if(a>5 && a <= 10){
            System.out.println("将就。");

        }
        else{
            System.out.println("行不行啊，细狗？");
        }
    }
}
