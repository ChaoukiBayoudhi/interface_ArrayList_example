package Entities;

import Enumerations.CarConstructor;

import java.util.Objects;

public class Car {
    //attributs
    //contructors
    //getters/setters
    //redefinition de equals and hashCode
    //redefinition de toString()
    //eventuellement quelques autres méthodes à implementer
    private int id;
    private static int lastId=0;
    private String CarNumber;
    private CarConstructor brand;
    private int nbrPlaces;
    private boolean automatic;
    public Car()
    {
        this.id=lastId++;
    }

    public int getId() {
        return id;
    }

    public static int getLastId() {
        return lastId;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    public CarConstructor getBrand() {
        return brand;
    }

    public void setBrand(CarConstructor brand) {
        this.brand = brand;
    }

    public int getNbrPlaces() {
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces) {
        this.nbrPlaces = nbrPlaces;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getCarNumber().equals(car.getCarNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarNumber());
    }

    @Override
    //toString retourne une chaine de caractères avec les caracteristiques
    //de l'objet
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", CarNumber='" + CarNumber + '\'' +
                ", brand=" + brand +
                ", nbrPlaces=" + nbrPlaces +
                ", automatic=" + automatic +
                '}';
    }
}
