package Traitement;

import Entities.Car;
import Entities.Icar;
import Enumerations.CarConstructor;
import implementation.ListCars;
import implementation.TableCars;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void getCar(Car c1)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Car Number ? : ");
//        String cn=sc.next();
//        c1.setCarNumber(cn);
        //ou bien
        c1.setCarNumber(sc.next());
        System.out.println("select the car brand:");
        System.out.println("1-BMW\n2-MERCEDES\n3-KIA\n4-FORD\n5-RENAULT\n6-PORSCHE,\n" +
                "7-AUDI,\n" +
                "8-TOYOTA,\n" +
                "9-OTHER");
        int choice=sc.nextInt();
        CarConstructor brand=CarConstructor.OTHER;
        switch(choice) {
            case 1:
                brand = CarConstructor.BMW;
                break;
            case 2:
                brand = CarConstructor.MERCEDES;
                break;
            case 3:
                brand = CarConstructor.KIA;
                break;
            case 4:
                brand = CarConstructor.FORD;
                break;
            case 5:
                brand = CarConstructor.RENAULT;
                break;
            case 6:
                brand = CarConstructor.PORSCHE;
                break;
            case 7:
                brand = CarConstructor.AUDI;
                break;
            case 8:
                brand = CarConstructor.TOYOTA;
                break;
            default:
                brand = CarConstructor.OTHER;
        }//fin switch
        c1.setBrand(brand);
        System.out.println(" Places Count ? ");
        c1.setNbrPlaces(sc.nextInt());
        System.out.println("Automatic Car ? (y/n)");
        char automatic=sc.next().charAt(0);
        c1.setAutomatic(false);
        if(automatic=='y')
            c1.setAutomatic(true);
    }
    public static void main(String[] args)
    {
        int choice;
        do {
            System.out.println("Selctionnez un choix : ");
            System.out.println("1-tableau des voitures");
            System.out.println("2-liste des voitures");
            System.out.println("3-Quitter l'application");

            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("votre choix : ");
                choice = scanner.nextInt();
            } while (choice < 1 || choice > 2);
            Icar cars;
            if (choice == 1) {
                System.out.println("Donner le nombre de cars : ");
                int N = scanner.nextInt();
                cars = new TableCars(N);
            } else
                cars = new ListCars();
            //1-créer une instance
            Car c1=new Car();
            //2-saisir les propriétés de l'instance
            getCar(c1);//appel d'une méthode static dans le main
            cars.addCar(c1);
            getCar(c1);//appel d'une méthode static dans le main
            cars.addCar(c1);
            //lister les cars
            cars.listAllCars();
        }while(choice !=3);


    }
}
