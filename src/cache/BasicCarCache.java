package cache;

import cars.BasicCar;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> cars = new Hashtable<>();

    public static BasicCar getCar(String carName) throws CloneNotSupportedException {
        BasicCar cachedCar = cars.get(carName);
        return (BasicCar) cachedCar.clone();
    }

    public static void putCar(BasicCar car) {
        cars.put(car.getName(), car);
    }
}
