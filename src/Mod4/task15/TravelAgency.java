package Mod4.task15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelAgency {
    private List<Tour> tours;

    public TravelAgency(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Tour> chooseCountryForTravel(String country) {
        List<Tour> chooseCountry = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getCountry().equals(country)) {
                chooseCountry.add(tour);
            }
        }
        return chooseCountry;

    }

    public List<Tour> chooseTypeOfTourForTravel(String typeOfTour) {
        List<Tour> chooseTypeOfTour = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getTypeOfTour().equals(typeOfTour)) {
                chooseTypeOfTour.add(tour);
            }
        }
        return chooseTypeOfTour;
    }

    public List<Tour> chooseTypeOfTransportForTravel(String typeOfTransport) {
        List<Tour> chooseTypeOfTransport = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getTypeOfTransport().equals(typeOfTransport)) {
                chooseTypeOfTransport.add(tour);
            }
        }
        return chooseTypeOfTransport;
    }

    public List<Tour> chooseTypeOfFoodInTravel(String typeOfFood) {
        List<Tour> chooseTypeOfFood = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getTypeOfFood().equals(typeOfFood)) {
                chooseTypeOfFood.add(tour);
            }
        }
        return chooseTypeOfFood;
    }

    public List<Tour> chooseNumOfDaysInTravel(int days) {
        List<Tour> chooseNumOfDays = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getNumOfDays() == days) {
                chooseNumOfDays.add(tour);
            }
        }
        return chooseNumOfDays;
    }

    public void sortTour(List<Tour> tourList) {
        tourList.sort(Comparator.comparing(Tour::getNumOfDays));
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "tours=" + tours +
                '}';
    }
}
