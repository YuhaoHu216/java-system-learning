public class Damo5 {
    public static void main(String[] args) {
        //0.1mm的纸折多少次达成珠穆朗玛峰的高度
        double height = 0.1;
        int a = 0;
        loop:while (height < 8844430){
            height = height*2;
            a++;

        }
        System.out.println("次数：" + a);
    }
}
