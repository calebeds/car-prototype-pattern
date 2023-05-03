import cache.BasicCarCache;
import cars.BasicCar;
import cars.Ford;
import cars.Nano;

public class PrototypePatterEx {
    public static void main(String[] main) throws CloneNotSupportedException {
        loadCars();
        BasicCar car1 = BasicCarCache.getCar("Green Ford");
        System.out.println("Car is: " + car1.getName() + " and its price is R$ " + car1.getPrice());

        BasicCar car2 = BasicCarCache.getCar("Yellow Nano");
        System.out.println("Car is: " + car2.getName() + " and its price is R$ " + car2.getPrice());
    }

    private static void loadCars() {
        BasicCar car = new Ford();
        car.setName("Green");
        BasicCarCache.putCar(car);

        BasicCar car2 = new Nano();
        car2.setName("Yellow");
        BasicCarCache.putCar(car2);
    }
}
