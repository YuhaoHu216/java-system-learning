package apidemo;

//字符串赋值方式
public class demo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(1 + s1);

        String s2 = new String("abc");
        System.out.println(2 + s2);

        char[] arr = {'a','b','c'};
        String s3 = new String(arr);
        System.out.println(3 + s3);

        byte[] bytes = {97,98,99};
        String s4 = new String(bytes);
        System.out.println(4 + s4);

        //比较字符串是否相等
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //忽略大小写比较字符串
        String s5 = "Abc";
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
