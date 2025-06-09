package 内部类.局部内部类;

import org.w3c.dom.ls.LSOutput;

public class Outer {

    int b = 20;

    public void show(){
        int a = 10;
        class Inner {
            String name;
            int age;

            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method1");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2方法");
            }
        }
        //创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
