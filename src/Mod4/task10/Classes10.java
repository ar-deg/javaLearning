package Mod4.task10;

/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и  get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора
данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Classes10 {
    public static void main(String[] args) {
        Airline[] airlines = new Airline[4];
        airlines[0] = new Airline("Minsk", 1, "Boeing", 12, 45, "Mon");
        airlines[1] = new Airline("Moskow", 2, "Airbus", 13, 20, "Tue");
        airlines[2] = new Airline("Minsk", 3, "Boeing", 10, 10, "Fri");
        airlines[3] = new Airline("Dubai", 4, "Airbus", 11, 15, "Mon");

        AirlineInfo airlineInfo = new AirlineInfo(airlines);
        System.out.println("Список рейсов для Minsk:");
        airlineInfo.findDestination("Minsk");

        System.out.println("Список рейсов для Mon:");
        airlineInfo.findDaysOfTheWeek("Mon");

        System.out.println("Список рейсов для Mon, время вылета которых больше 11:00");
        airlineInfo.departureTime("Mon",11,0);
    }

}
