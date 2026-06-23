// Product Interface
interface Vehicle {
    void drive();
}

// Concrete Product 1
class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a Car");
    }
}

// Concrete Product 2
class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a Bike");
    }
}

// Factory Class
class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        }

        if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }

        return null;
    }
}

// Main Class
public class Factory_Method_Pattern {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("CAR");
        v1.drive();

        Vehicle v2 = VehicleFactory.getVehicle("BIKE");
        v2.drive();
    }
}