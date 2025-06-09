package BagAndFinal.train03;

public class Test {
    public static void main(String[] args) {
        /*
        final 修改基本数据类型：记录的值不能发生改变
        final 修改引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的

         */

        final double PI = 3.14;

        //创建对象
        final Student S = new Student("zhangsan",4);

        S.setAge(3);
        S.setName("lishi");

        //S = new Student("sl",3);
    }
}
