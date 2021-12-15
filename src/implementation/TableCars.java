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
    public void showCar(String carNumber) {
        int i=0;
        boolean found=false;
        while(i<tabCars.length&&!found)
        {
            if(tabCars[i].getCarNumber().equalsIgnoreCase(carNumber))
                found = true;
            else
                i++;
        }
        if(found)
            System.out.println(tabCars[i]);
        else
            System.out.println("Verify the carNum");

    }

    @Override
    public boolean addCar(Car c1) {
        return false;
    }

    @Override
    public boolean removeCar(String carNumber) {
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
