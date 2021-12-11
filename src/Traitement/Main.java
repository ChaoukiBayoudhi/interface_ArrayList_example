package Traitement;

import Entities.Icar;
import implementation.ListCars;
import implementation.TableCars;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Selctionnez un choix : ");
        System.out.println("1-tableau des voitures : ");
        System.out.println("2-liste des voitures : ");
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("votre choix : ");
            choice=scanner.nextInt();
        }while(choice<1||choice>2);
        Icar cars;
        if(choice==1) {
            System.out.println("Donner le nombre de cars : ");
            int N=scanner.nextInt();
            cars = new TableCars(N);
        }
        else
            cars=new ListCars();

    }
}
