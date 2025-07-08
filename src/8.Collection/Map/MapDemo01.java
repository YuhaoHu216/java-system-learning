import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","HYH");
        map.put("002","胡宇浩");

        System.out.println(map);
        System.out.println(map.get("001"));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
