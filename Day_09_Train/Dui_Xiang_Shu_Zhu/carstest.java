import java.util.Scanner;

public class carstest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cars[] arr = new cars[3];
        int count = 1;
        for(int i = 0;i < arr.length;i++){
            cars c = new cars();

            System.out.println("请输入第" + count  + "辆车名");
            String name = sc.next();
            c.setName(name);
            System.out.println("请输入第" + count  + "辆车颜色");
            String color = sc.next();
            c.setColor(color);
            System.out.println("请输入第" + count  + "辆车价格");
            int prize = sc.nextInt();
            c.setPrize(prize);
            arr[i] = c;

            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            cars c = arr[i];
            System.out.println(c.getName());
            System.out.println(c.getColor());
            System.out.println(c.getPrize());


        }

    }
}
