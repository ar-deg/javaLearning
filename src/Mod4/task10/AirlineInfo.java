package Mod4.task10;

public class AirlineInfo {
    private Airline[] airlines;

    public AirlineInfo(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void findDestination(String place) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(place)) {
                System.out.println(airlines[i]);
            }
        }

    }

    public void findDaysOfTheWeek(String dayOfTheWeek) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDaysOfTheWeek().equals(dayOfTheWeek)) {
                System.out.println(airlines[i]);
            }
        }
    }

    public void departureTime(String dayOfTheWeek, int hoursOfDep, int minOfDep) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDaysOfTheWeek().equals(dayOfTheWeek)) {
                if (airlines[i].getHoursOfDeparture() > hoursOfDep || airlines[i].getHoursOfDeparture() == hoursOfDep && airlines[i].getMinOfDeparture() > minOfDep) {
                    System.out.println(airlines[i]);
                }
            }
        }
    }


}
