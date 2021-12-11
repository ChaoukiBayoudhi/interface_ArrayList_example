package implementation;

import Entities.Car;
import Entities.Icar;

import java.util.List;

//si au moins une des méthodes de l'interface n'est pas implementée
//la classe devient abstraite
//implements est sorte d'heritage (on hérite les signatures des méthodes)
//une classe peut implementer une ou plusieurs interfaces.
public class TableCars implements Icar {
    private Car[] tabCars;
    public TableCars(int N)
    {
        tabCars=new Car[N];
    }
    @Override
    public void showCar(int id) {

    }

    @Override
    public boolean addCar(Car c1) {
        return false;
    }

    @Override
    public boolean removeCar(int id) {
        return false;
    }

    @Override
    public void listAllCars() {

    }

    @Override
    public List<Car> getCarsByBrand(String brand) {
        return null;
    }
}
