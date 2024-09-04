package Coupling.TightCoupling;

class ElectricEngine{
    public void show(){
        System.out.println("I am electric engine");
    }
}
class Car {
    public String body;
    //dependent on some other class;
    public ElectricEngine engine;

    public Car(String body, ElectricEngine engine) {
        this.body = body;
        this.engine = engine;
    }

    public void start(){
        engine.show();
        System.out.println("Now You have idea so you can start");
    }
}
public class TightCouplingDemo {
    public static void main(String[] args) {
        Car punch = new Car("body on chice",new ElectricEngine());
        punch.start();
    }
}
