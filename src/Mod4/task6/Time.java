package Mod4.task6;

public class Time {
    private int hour;
    private int min;
    private int sec;


    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (this.hour > 23 || this.hour < 0) {
            this.hour = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
        if (this.min > 59 || this.min < 0) {
            this.min = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
        if (this.sec > 59 || this.sec < 0) {
            this.sec = 0;
        }
    }

    public int changeHour(int newHour) {
        this.hour += newHour;
        if (this.hour > 23 || this.hour < 0) {
            this.hour = 0;
        }
        return this.hour;
    }

    public int changeMinute(int newMin) {
        this.min += newMin;
        if (this.min > 59 || this.min < 0) {
            this.min = 0;
        }
        return this.min;
    }

    public int changeSec(int newSec) {
        this.sec += newSec;
        if (this.sec > 59 || this.sec < 0) {
            this.sec = 0;
        }
        return this.sec;
    }

    public String toString() {
        return "Время: " + getHour() + ":" + getMin() + ":" + getSec();
    }
}


