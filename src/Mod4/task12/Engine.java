package Mod4.task12;

public class Engine {
    private String typeOfEngine;
    //поле тип двигителя

    public Engine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String toString() {
        return "Двигатель" + typeOfEngine;
    }
}
