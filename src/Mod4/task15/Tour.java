package Mod4.task15;

public class Tour {
    private String country;
    private String typeOfTour;
    private String typeOfTransport;
    private String typeOfFood;
    private int numOfDays;

    public Tour(String country, String typeOfTour, String typeOfTransport, String typeOfFood, int numOfDays) {
        this.country = country;
        this.typeOfTour = typeOfTour;
        this.typeOfTransport = typeOfTransport;
        this.typeOfFood = typeOfFood;
        this.numOfDays = numOfDays;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTypeOfTour() {
        return typeOfTour;
    }

    public void setTypeOfTour(String typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", typeOfTour='" + typeOfTour + '\'' +
                ", typeOfTransport='" + typeOfTransport + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", numOfDays=" + numOfDays +
                '}';
    }
}
