package Polymorphism.train01;

public class Dog extends Animal{

    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁的"+getColor()+"颜色的狗在吃" + something);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
