package 内部类.入门程序;

public class Car {
     String carName;
    int carAge;
    String carColor;


    public void show(Car this){
        System.out.println(this.carName);
        //System.out.println(enginName);

        Engine e = new Engine();
        System.out.println(e.engineName);
    }
    class Engine{
        String engineName;
        int engineAge;


        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
