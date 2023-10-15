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


        ServiceStation serviceStation = new ServiceStation();

        System.out.println(bicycle.getModelName());
        serviceStation.checkTransport(bicycle);

        System.out.println(car.getModelName());
        serviceStation.checkTransport(car);

        System.out.println(truck.getModelName());
        serviceStation.checkTransport(truck);
    }
}