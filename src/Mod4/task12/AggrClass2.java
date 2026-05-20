package Mod4.task12;

import java.util.ArrayList;
import java.util.List;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля
 */
public class AggrClass2 {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Лето");
        Wheel wheel1 = new Wheel("Лето");
        Wheel wheel2 = new Wheel("Лето");
        Wheel wheel3 = new Wheel("Лето");

        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel);
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);

        Engine engine = new Engine("Бензин");

        Car car = new Car("BMW", wheels, 20, engine);
        car.refuelingTheCar(20);
        car.moving();
        car.changingTypeOfWheel("Зима");

    }
}
