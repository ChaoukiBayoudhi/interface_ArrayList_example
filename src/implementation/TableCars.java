package implementation;

import Entities.Car;
import Entities.Icar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//si au moins une des méthodes de l'interface n'est pas implementée
//la classe devient abstraite
//implements est sorte d'heritage (on hérite les signatures des méthodes)
//une classe peut implementer une ou plusieurs interfaces.
public class TableCars implements Icar {
    private Car[] tabCars;
    private int nbCars;
    public TableCars(int N)
    {
        tabCars=new Car[N];
        this.nbCars=0;
    }
    private int findCar(String carNumber)
    {
        int i=0;

        boolean find=false;
        while(i<this.nbCars&&!find)
        {
            if(tabCars[i].getCarNumber().equalsIgnoreCase(carNumber))
                find = true;
            else
                i++;
        }
        if(find)
            return i;
        return -1;
    }
    @Override
    public void showCar(String carNumber) {
        int i=findCar(carNumber);
        if(i!=1)
            System.out.println(tabCars[i]);
        else
            System.out.println("Verify the carNumber !! This car does not exist");

    }

    @Override
    //ajoute une voiture à la fin du tableau
    public boolean addCar(Car c1) {
        try
        {
            if(tabCars.length==nbCars)
                throw new Exception("Impossible to add the car. The table is full.");
            //si nbCars=0 ->ajout dans l'indice=0
            //si nbCars=1 ->ajout dans l'indice=1
            //...
            //==>on ajoute dans l'indice nbCars
            if(findCar(c1.getCarNumber())!=-1)
                throw new Exception("This car aleardy exist.");
            this.tabCars[this.nbCars]=c1;
            this.nbCars++;
            System.out.println("The car has been successfully added.");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeCar(String carNumber) {
        try
        {
            int index=findCar(carNumber);
            if(index==-1)
                throw new Exception("Verify the given car Number. This car does not exist");
            for(int i=index;i<=nbCars-2;i++)
                this.tabCars[i]=this.tabCars[i+1];
            this.nbCars--;
            System.out.println("Car successfully removed.");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void listAllCars() {
        System.out.println("List of Cars :");
        for(Car c:this.tabCars)
            System.out.println(c);
    }
    @Override
    public List<Car> getCarsByBrand(String brand) {
        List<Car> lstRes=new ArrayList<>();
        for(Car c:this.tabCars) {
            if (c.getBrand().toString().equalsIgnoreCase(brand))
                lstRes.add(c);
        }
        return lstRes;
    }
}
