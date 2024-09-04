package Coupling.LooseCoupling;

interface Engine{
    public void show();
}

class ElectricEngine implements Engine{
    @Override
    public void show(){
        System.out.println("I am Electric Engine");
    }
}
class PetrolEngine implements Engine{
    @Override
    public void show(){
        System.out.println("I am Petrol Engine");
    }
}
class Diesel implements Engine{
    @Override
    public void show(){
        System.out.println("I am Diesel Engine");
    }
}
class Petrol implements Engine{
    public void show(){
        System.out.println("I am Petrol Engine");
    }
}

class Car {
    public String body;
    public  Engine engine;

    public Car(String body, Engine engine) {
        this.body = body;
        this.engine = engine;
    }

    public void start(){
        engine.show();
        System.out.println("Now You have idea so you can start");
    }
}

public class LooseCouplingDemo {
    public static void main(String[] args) {
        Car TeslaModeX = new Car("body on chice",new ElectricEngine());
        TeslaModeX.start();
    }
}
