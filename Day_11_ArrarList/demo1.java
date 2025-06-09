import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //删除元素
        boolean result1 = list.remove("aaa");
        System.out.println(result1);
        String arr = list.remove(0); //会返回值

        //修改元素
        String result = list.set(1,"ddd");

        //查询元素
        list.get(1);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        System.out.println(list);


    }

}
