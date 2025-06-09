//StringBuilder的添加，翻转，长度获取，变回字符串
package stringbuiderdemo;

public class demo3 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("abc");

//        sb.append(1);
//        sb.append(1.2);
//        sb.append(true);
//        sb.append("$");
//         sb.append("aaa").append("bbb").append("ccc").append("ddd");

//        System.out.println(sb);

//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.length());

//        String str = sb.toString();
//        System.out.println(str.substring(5,8));
//        StringBuilder stringBuilder = new StringBuilder("adsf.txt");
//        String out = stringBuilder.substring(1,3);

        StringBuilder stringBuilder = new StringBuilder("sdf asd.txt");
        int index = stringBuilder.lastIndexOf(".");
        int chang = stringBuilder.length();
        System.out.println(index);
        System.out.println(chang);
        String sub = stringBuilder.substring(index,chang);

        System.out.println(sub);
    }
}
