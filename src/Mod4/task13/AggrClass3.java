package Mod4.task13;

import java.util.ArrayList;
import java.util.List;

/*
Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class AggrClass3 {
    public static void main(String[] args) {
        City cityMinsk = new City("Minsk");
        City cityZaslavl = new City("Zaslavl");
        City cityBobruisk = new City("Bobruisk");
        City cityGrodno = new City("Grodno");
        City cityKirovsk = new City("Kirovsk");
        City citySkidel = new City("Skidel");

        List<City> minskCities = new ArrayList<>();
        minskCities.add(cityMinsk);
        minskCities.add(cityZaslavl);

        List<City> bobruiskCities = new ArrayList<>();
        bobruiskCities.add(cityBobruisk);
        bobruiskCities.add(cityKirovsk);

        List<City> grodnoCities = new ArrayList<>();
        grodnoCities.add(cityGrodno);
        grodnoCities.add(citySkidel);


        District districtMinsk = new District("Минский", minskCities);
        District districtBobruisk = new District("Бобруйский", bobruiskCities);
        District districtGrodno = new District("Гродненский", grodnoCities);

        List<District> minskDistrict = new ArrayList<>();
        minskDistrict.add(districtMinsk);

        List<District> bobruiskDistrict = new ArrayList<>();
        bobruiskDistrict.add(districtBobruisk);

        List<District> grodnoDistrict = new ArrayList<>();
        grodnoDistrict.add(districtGrodno);

        Region minskRegion = new Region(minskDistrict, 23.6, "Минская", "Минск");
        Region mogilevRegion = new Region(bobruiskDistrict, 20.6, "Могилевская", "Могилев");
        Region grodnoRegion = new Region(grodnoDistrict, 21.6, "Гродненская", "Гродно");

        List<Region> regions = new ArrayList<>();
        regions.add(minskRegion);
        regions.add(mogilevRegion);
        regions.add(grodnoRegion);

        State state = new State("Минск", regions);
        state.printCapitalName();
        state.findAreaOfState();
        state.printNumberOfRegions();
        state.printCentreOfRegion();


    }
}


