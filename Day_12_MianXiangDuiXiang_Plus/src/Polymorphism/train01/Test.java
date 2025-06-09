package Polymorphism.train01;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("老王",20);
        Dog d1 = new Dog(2,"黑");

        p1.keepPet(d1,"骨头");


        Person p2 = new Person("老李",18);
        Cat c1 = new Cat(1,"白");

        p2.keepPet(c1,"鱼干");

    }
}
