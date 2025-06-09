import java.util.Scanner;



public class Damo3 {

    //1.整数初始化值为0
    //2.小数初始化为0.0
    //3.字符初始化为'/u0000'(空格)
    //4.boolean初始化为false
    //5.引用初始化为null
        public static void main(String[] args) {
//        int[] arr0 = {1,2,4,56,6,0};
//        for(int i = 0;i<6;i++){
//            System.out.println(arr0[i]);
//        }
            Scanner sc = new Scanner(System.in);
            int[] arr1 = new int[50];
            for(int j = 0;j < 10;j++){
                arr1[j] = sc.nextInt();

            }
            int a = 0;
            int b = arr1.length;
            while(a<b){
                System.out.println(arr1[a]);
                a++;
            }

        }


}
