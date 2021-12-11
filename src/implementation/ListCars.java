package implementation;

import Entities.Car;
import Entities.Icar;

import java.util.ArrayList;
import java.util.List;
//si une classe implemente une interface => 2 possibilités
//1-soit la classe implemente toutes les méthodes de l'interface
//2-si au moins une des méthodes de l'interface n'est pas implementée
// alors la classe doit être declarée abstract
public class ListCars implements Icar{
    private List<Car> lstCars=new ArrayList<>();
    @Override
    public void showCar(int id) {

    }

    @Override
    //ajoute une voiture à la fin de la liste
    public boolean addCar(Car c1) {
       if(lstCars.contains(c1))
           return false;
        return  lstCars.add(c1);
    }

    @Override
    public boolean removeCar(int id) {
        return false;
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

        @Override
    public List<Car> getCarsByBrand(String brand) {
        return null;
    }
}
