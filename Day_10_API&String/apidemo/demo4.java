package apidemo;
import java.util.Scanner;

//金额转换
public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个不超过7位的金额来转换为大写金额");
        String money = sc.next();

        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String[] arr1 ={"0","0","0","0","0","0","0"};
        int num = arr1.length;
        int j = 0;
        for (int i = money.length() - 1; i >= 0 ; i--) {
             arr1[num - j -1] = String.valueOf(money.charAt(i));
             j++;
        }


        for (int i = 0; i < 7; i++) {
            if(arr1[i].equals("0")){
                arr1[i] = arr[0];
            }
            if(arr1[i].equals("1")){
                arr1[i] = arr[1];
            }
            if(arr1[i].equals("2")){
                arr1[i] = arr[2];
            }
            if(arr1[i].equals("3")){
                arr1[i] = arr[3];
            }
            if(arr1[i].equals("4")){
                arr1[i] = arr[4];
            }
            if(arr1[i].equals("5")){
                arr1[i] = arr[5];
            }
            if(arr1[i].equals("6")){
                arr1[i] = arr[6];
            }
            if(arr1[i].equals("7")){
                arr1[i] = arr[7];
            }
            if(arr1[i].equals("8")){
                arr1[i] = arr[8];
            }
            if(arr1[i].equals("9")){
                arr1[i] = arr[9];
            }

        }

        System.out.println(arr1[0]+'佰'+arr1[1]+'拾'+arr1[2]+'万'+arr1[3]+'仟'+arr1[4]+'佰'+arr1[5]+'拾'+arr1[6]+'元' + " ");

    }

}
