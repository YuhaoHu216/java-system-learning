package 内部类.匿名内部类;

public class Test {
    public static void main(String[] args) {

        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了Swim方法");
            }
        };

        new Animal(){

            @Override
            public void eat(){
                System.out.println("重写eat方法 ");
            }
        };

        method(
                new Animal(){

                    @Override
                    public void eat() {
                        System.out.println("狗吃");
                    }
                }
        );
    }

    private static void method(Animal a) {
        a.eat();
    }
}
