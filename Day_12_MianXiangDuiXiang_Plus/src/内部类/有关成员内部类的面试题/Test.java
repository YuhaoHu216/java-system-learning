package 内部类.有关成员内部类的面试题;

public class Test {
    public static void main(String[] args) {
        //创建内部类
        Outer.Inner oi = new Outer().new Inner();

        oi.show();
    }

}
