//被private修饰的变量只能在该类中使用,一般是为了安全性考虑.
//利用方法使其能在其他类中使用.
public class GFPrivate {
    private String name;
    private int age;
    private String attribute;
    public void setName(String n){
        name = n;
    }
    public String showName(){
        return name;
    }

    public void setAge(int a){
        if(a>=18 && a<30){
            age = a;
        }else if(a<18 && a>0){
            System.out.println("想吃捞饭是吧");
        }else if(a<0){
            System.out.println("你他妈来找茬是吧");
        }else if(a>=30){
            System.out.println("你是真饿了");
        }
    }
    public int showAge(){
        return age;
    }
//构造方法用于直接赋初始值,有时不知道初始值的时候空参构造就很有比要了
    //这里用了方法的重载
    public GFPrivate(){

    }
    public GFPrivate(int age,String name){
        this.age = age;
        this.name = name;
    }

}
