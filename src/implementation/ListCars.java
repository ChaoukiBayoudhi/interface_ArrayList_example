package implementation;

import Entities.Car;
import Entities.Icar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//si une classe implemente une interface => 2 possibilités
//1-soit la classe implemente toutes les méthodes de l'interface
//2-si au moins une des méthodes de l'interface n'est pas implementée
// alors la classe doit être declarée abstract
public class ListCars implements Icar{
    private List<Car> lstCars=new ArrayList<>();
    @Override
    public void showCar(String carNumber) {
        try {
            Car c1 = new Car();
            c1.setCarNumber(carNumber);
            int index = lstCars.indexOf(c1);
            if(index==-1)
                throw new Exception("Verify th car number. This car does not exist");
            System.out.println(lstCars.get(index));
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }

    @Override
    //ajoute une voiture à la fin de la liste
    public boolean addCar(Car c1) {
       if(lstCars.contains(c1))
           return false;
        return  lstCars.add(c1);
    }

    @Override
    public boolean removeCar(String carNumber) {
        try {
            Car c1 = new Car();
            c1.setCarNumber(carNumber);
            int index = lstCars.indexOf(c1);
            if(index==-1)
                throw new Exception("Verify th car number. This car does not exist");
            lstCars.remove(index);
            System.out.println("Car has been successfully removed");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            return false;
            //e.printStackTrace();
        }
        return true;
    }

    //1ère méthode :
//    @Override
//    public void listAllCars() {
//        //parcours des indices d'une liste
//        System.out.println("List of Cars :");
//        for(int i=0;i<lstCars.size();i++)
//            System.out.println(lstCars.get(i));
//            //ceci est equivalent un un appel implicite de toString()
//            //comme si on a ecrit ceci
//            //System.out.println(lstCars.get(i).toString());
//    }

    //2éme méthode
    @Override
    public void listAllCars() {
        //parcours du contenu
        System.out.println("List of Cars :");
        for (Car c1:lstCars) {
            System.out.println(c1);
        }
    }

//        @Override
//    public List<Car> getCarsByBrand(String brand) {
//        List<Car> brandCars=new ArrayList<>();
//            for (Car x:lstCars) {
//                if(x.getBrand().toString().equalsIgnoreCase(brand))
//                    brandCars.add(x);
//            }
//        return brandCars;
//    }
    //secon method
    @Override
    public List<Car> getCarsByBrand(String brand) {

        return lstCars.stream()
                .filter(x->x.getBrand().toString().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }
}
