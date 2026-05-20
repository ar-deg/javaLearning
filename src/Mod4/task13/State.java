package Mod4.task13;

import java.util.List;

public class State {
    private String capitalName;
    private List<Region> regions;

    public State(String capitalName, List<Region> regions) {
        this.capitalName = capitalName;
        this.regions = regions;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public void printCapitalName() {
        System.out.println("Название столицы Республики Беларусь: " + this.capitalName);
    }

    public void printNumberOfRegions() {
        System.out.println("Количество областей: " + this.regions.size());
    }

    public void findAreaOfState() {
        double sumArea = 0;
        for (Region region : this.regions) {
            sumArea = sumArea + region.getArea();
        }
        System.out.println("Общая площадь гос-ва: " + sumArea);
    }

    public void printCentreOfRegion() {
        for (Region region : this.regions) {
            System.out.println("Центр " + region.getRegionName() + " области: " + region.getCentreOfRegion());
        }
    }

}
