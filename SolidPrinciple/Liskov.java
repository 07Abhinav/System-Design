package SolidPrinciple;

abstract class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

abstract class EngineVehicle extends Vehicle {
    public void startEngine() {
        System.out.println("Engine started");
    }
}

abstract class NonEngineVehicle extends Vehicle{

}

class Car extends EngineVehicle {
    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}
class Bicycle extends NonEngineVehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is pedaling");
    }
}
public class Liskov {
    public static void main(String[] args) {
        EngineVehicle car = new Car();
        car.move();
        car.startEngine();

        NonEngineVehicle bicycle = new Bicycle();
        bicycle.move();
    }
}
