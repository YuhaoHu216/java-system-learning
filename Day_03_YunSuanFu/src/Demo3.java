//有隐式转换和强制转换两种
//byte和short和short会先转换为int再作运算
//隐式转换小转大
//强制转换代码实现（有可能出错）
//有字符串参与的+操作为拼接
public class Demo3 {
    public static void main(String[] args) {
        int b = 5;
        int a = 10;
        short c = 6;
        int e = a + c;
        byte d = (byte)(a + b);
        System.out.println(2.5 + "厉不厉害你鸡哥");
        System.out.println("喜欢唱、跳、Rap、篮球" + "厉不厉害你鸡哥");
        System.out.println('中' + "国人" + '民');
        System.out.println(1 + 2 + "sfg" + 1 + 2);
        System.out.println(1 + 'a');
        System.out.println(1 + "a");
    }
}
