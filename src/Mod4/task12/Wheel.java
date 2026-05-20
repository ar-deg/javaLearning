package Mod4.task12;

public class Wheel {
    private String wheelSeason;
    //поле сезон

    public Wheel(String wheelSeason) {
        this.wheelSeason = wheelSeason;
    }

    public String getWheelSeason() {
        return wheelSeason;
    }

    public void setWheelSeason(String wheelSeason) {
        this.wheelSeason = wheelSeason;
    }

    public String toString() {
        return "Колесо" + wheelSeason;
    }
}
