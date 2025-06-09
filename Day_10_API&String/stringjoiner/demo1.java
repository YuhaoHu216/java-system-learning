package stringjoiner;

import java.util.StringJoiner;

public class demo1 {
    public static void main(String[] args) {
        //指定间隔符号
        StringJoiner sj = new StringJoiner("-","[","]");

        //添加元素
        sj.add("123").add("456").add("786");

        //长度
        System.out.println(sj.length());

        //变为字符串
        System.out.println(sj.toString());
        System.out.println(sj);
    }
}
