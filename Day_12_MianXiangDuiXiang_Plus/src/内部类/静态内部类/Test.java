package 内部类.静态内部类;

public class Test {
    public static void main(String[] args) {
        //调用非静态方法
        Outer.Inner oi = new Outer.Inner();
        oi.show1();
        //调用静态方法
        Outer.Inner.show2();
    }
}
