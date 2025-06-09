public class user_test {
    public static void main(String[] args) {
        user hyh = new user("HYH","hyh666","男",19);
        user hjh = new user();
        hjh.setAge(14);
        hjh.setUsername("HJH");
        hjh.setGender("男");
        hjh.setPassword("159236");
        System.out.println(hyh.showUsername() + " " + hyh.showPassword());
        System.out.println(hjh.showUsername() + " " + hjh.showPassword());
    }
}
