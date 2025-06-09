import java.util.Scanner;
//比较两个长方形面积的大小
public class Damo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
//        char flag = 'y';
        while(true) {
            System.out.print("是否继续(1/0)");
            flag = sc.nextInt();
            if(flag == 0){
                break;
            }
            System.out.print("请输入第一个长方形的长与宽：");
            double a1 = sc.nextDouble();
            double a2 = sc.nextDouble();
            System.out.print("请输入第二个长方形的长与宽:");
            double a3 = sc.nextDouble();
            double a4 = sc.nextDouble();
            double s1 = Mian(a1, a2);
            double s2 = Mian(a3, a4);
            if (s1 > s2) {
                System.out.print("第一个长方形面积更大\n" + s1 + ">" + s2 +"\n");
            }else if(s1 == s2){
                System.out.print("两个长方形面积一样大\n" + s1 + "=" + s2 + "\n");
            }else {
                System.out.print("第二个长方形面积更大\n" + s1 + "<" + s2 + "\n");
            }
        }
    }


    public static double Mian(double a1,double a2){
        return a1 * a2;
    }


}
