package implementation;

import Entities.Car;
import Entities.Icar;

import java.util.ArrayList;
import java.util.List;

public class ListCars implements Icar{
    private List<Car> lstCars=new ArrayList<>();
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
        for(int i=0;i<)

    }

    @Override
    public List<Car> getCarsByBrand(String brand) {
        return null;
    }
}
