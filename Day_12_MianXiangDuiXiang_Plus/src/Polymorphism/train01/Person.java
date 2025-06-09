package Polymorphism.train01;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    //养猫
    public void keepPet(Cat cat,String something){
        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() +
                "岁的猫");
        cat.eat(something);
    }

    //养狗
    public void keepPet(Dog dog,String something){
        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() +
                "岁的狗");
        dog.eat(something);
    }
    */
    //多态实现
    public void keepPet(Animal a,String something){
        if(a instanceof Dog d){
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + a.getColor() + "颜色的" + a.getAge() +
                    "岁的狗");
            a.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getColor() + "颜色的" + c.getAge() +
                    "岁的猫");
            c.eat(something);
        }else{
            System.out.println("没有这种动物");
        }
    }

}
