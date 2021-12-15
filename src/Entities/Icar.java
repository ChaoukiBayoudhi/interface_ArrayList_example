package Entities;

import java.util.List;

public interface Icar {
    void showCar(String carNumber);
    boolean addCar(Car c1);
    boolean removeCar(String carNumber);
    void listAllCars();
    List<Car> getCarsByBrand(String brand);
}
