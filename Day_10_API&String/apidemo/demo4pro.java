package apidemo;
import java.util.Scanner;

public class demo4pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个不超过7位的金额来转换为大写金额:");
        int money = sc.nextInt();
        //判断数据是否合理用下while循环



        String[] arr1 = {"佰","拾","万","仟","佰","拾","元"};

        String moneystr = "";

        while(money > 0){
            int ge = money % 10;
            money = money / 10;
            moneystr = bigger(ge) + moneystr;
        }
//        System.out.println(moneystr);
        String result = "";
        for(int i = 7-moneystr.length();i>0;i--){
            result = '零' + result;
        }
        moneystr = result + moneystr;
//        System.out.println(moneystr);

        String outcome = "";
        for (int i = 0; i < 7; i++) {
            outcome = outcome + moneystr.charAt(i) + arr1[i];
        }

        System.out.println(outcome);
    }

    public static String bigger(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
