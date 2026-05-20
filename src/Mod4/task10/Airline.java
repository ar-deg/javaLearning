package Mod4.task10;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private int hoursOfDeparture;
    private int minOfDeparture;
    private String daysOfTheWeek;

    public Airline(String destination, int flightNumber, String aircraftType, int hoursOfDeparture, int minOfDeparture, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.hoursOfDeparture = hoursOfDeparture;
        this.minOfDeparture = minOfDeparture;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircrafType) {
        this.aircraftType = aircrafType;
    }

    public int getHoursOfDeparture() {
        return hoursOfDeparture;
    }

    public void setHoursOfDeparture(int hoursOfDeparture) {
        this.hoursOfDeparture = hoursOfDeparture;
    }

    public int getMinOfDeparture() {
        return minOfDeparture;
    }

    public void setMinOfDeparture(int minOfDeparture) {
        this.minOfDeparture = minOfDeparture;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", hoursOfDeparture=" + hoursOfDeparture +
                ", minOfDeparture=" + minOfDeparture +
                ", daysOfTheWeek='" + daysOfTheWeek + '\'' +
                '}';
    }
}
