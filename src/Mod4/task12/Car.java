package Mod4.task12;


import java.util.List;

public class Car {
    private String carBrand;
    private List<Wheel> wheels;
    private Engine engine;
    private int fuel;
    //поле марка авто

    public Car(String carBrand, List<Wheel> wheels, int fuel, Engine engine) {
        this.carBrand = carBrand;
        this.wheels = wheels;
        this.fuel = fuel;
        this.engine = engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void refuelingTheCar(int litres) {
        this.fuel = this.fuel + litres;
        System.out.println("Машина " + carBrand + " заправлена");
    }

    public void moving() {
        if (this.fuel > 0 && this.engine != null) { //with 0 not working
            System.out.println(carBrand + " движется");
        }
    }

    public void changingTypeOfWheel(String winterSeason) {
        for (Wheel wheel : this.wheels) {
            wheel.setWheelSeason(winterSeason);
        }
        System.out.println("Колеса поменяны на сезон: " + winterSeason);
    }


}
