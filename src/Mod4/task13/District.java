package Mod4.task13;

import java.util.List;

public class District {
    private String districtName;
    private List<City> city;

    public District(String districtName, List<City> city) {
        this.districtName = districtName;
        this.city = city;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }
}
