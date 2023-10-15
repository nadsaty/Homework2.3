import service.ServiceStation;
import service.Serviceable;
import transports.Bicycle;
import transports.Car;
import transports.Truck;

public class Main {
    public static void main(String[] args) {


        Bicycle bicycle = new Bicycle("\n Stels \n", 2);

        Car car = new Car("\n Toyota \n", 4);

        Truck truck = new Truck("\n Kamaz \n", 4);
    }
}