public class user {
    //属性
    private String username;
    private String password;
    private String gender;
    private int age;

    //构造方法
    public user(){

    }
    public user(String username,String passwoed,String gender,int age){
        this.username = username;
        this.password = passwoed;
        this.gender = gender;
        this.age = age;
    }

    //行为
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String showUsername(){
        return this.username;
    }

    public String showPassword(){
        return this.password;
    }

    public String showGender(){
        return this.gender;
    }

    public int showAge(){
        return this.age;
    }
}
