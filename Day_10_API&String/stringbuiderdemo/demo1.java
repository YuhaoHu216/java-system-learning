package stringbuiderdemo;

public class demo1 {
    public static void main(String[] args) {
        String id = "511304200507032810";
        char gender = id.charAt(16);
        String birthday = id.substring(6,14);
        System.out.println(birthday);

        int num = gender - 48;
        if(num % 2 == 0){
            gender = '女';
        }else{
            gender = '男';
        }
        System.out.println(gender);
    }
}
