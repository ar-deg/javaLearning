package Mod4.task4;

class Train {
    private String nameOfDestination;
    private int trainNumber;
    private String departureTime;


    public Train(String nameOfDestination, int trainNumber, String departureTime) {
        this.nameOfDestination = nameOfDestination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        ;
    }

    public String getNameOfDestination() {
        return nameOfDestination;
    }

    public void setNameOfDestination(String nameOfDestination) {
        this.nameOfDestination = nameOfDestination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String toString() {
        return "Пункт назначения " + nameOfDestination + "," + "номер поезда " + trainNumber + "," + "время отправления " + departureTime;
    }

}
