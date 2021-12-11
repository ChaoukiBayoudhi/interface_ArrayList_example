package Entities;

import Enumerations.CarConstructor;

import java.util.List;

public interface Icar {
    void showCar(int id);
    boolean addCar(Car c1);
    boolean removeCar(int id);
    void listAllCars();
    List<Car> getCarsByBrand(String brand);
}
