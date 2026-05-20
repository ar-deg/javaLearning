package Mod4.task13;

import java.util.List;

public class Region {
    private List<District> districts;
    private double area;
    private String regionName;
    private String centreOfRegion;

    public Region(List<District> districts, double area, String regionName, String centreOfRegion) {
        this.districts = districts;
        this.area = area;
        this.regionName = regionName;
        this.centreOfRegion = centreOfRegion;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCentreOfRegion() {
        return centreOfRegion;
    }

    public void setCentreOfRegion(String centreOfRegion) {
        this.centreOfRegion = centreOfRegion;
    }

    @Override
    public String toString() {
        return "Region{" +
                "districts=" + districts +
                ", area=" + area +
                ", regionName='" + regionName + '\'' +
                ", centreOfRegion='" + centreOfRegion + '\'' +
                '}';
    }
}
