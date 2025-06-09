import java.util.ArrayList;
import java.util.Arrays;

public class phonetest {
    public static void main(String[] args) {
        ArrayList<phone> list = new ArrayList<>();

        phone p1 = new phone("小米",1999);
        phone p2 = new phone("花为",6999);
        phone p3 = new phone("绿机",2099);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (int i = 0; i < getPhoneInfo(list).size(); i++) {
            phone p = getPhoneInfo(list).get(i);
            System.out.println(p.getPrize() + p.getName());
        }
    }

    public static ArrayList<phone> getPhoneInfo(ArrayList<phone> list){
        ArrayList<phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            phone p = list.get(i);
            int prize = p.getPrize();
            if(prize < 3000){
                result.add(p);
            }
        }
        return result;
    }
}
