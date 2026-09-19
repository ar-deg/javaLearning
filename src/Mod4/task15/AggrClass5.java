package Mod4.task15;

import Mod4.task7.Triangle;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых,экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class AggrClass5 {
    public static void main(String[] args) {
        Tour tour1 = new Tour("UAE", "relax", "airplane", "RO", 7);
        Tour tour2 = new Tour("Cyprus", "excursion", "ferryboat", "BB", 10);
        Tour tour3 = new Tour("Vilnus", "shopping", "bus", "HB", 12);
        Tour tour4 = new Tour("Italy", "excursion", "bus", "BB", 7);
        Tour tour5 = new Tour("UK", "studies", "airplane", "FB", 21);
        Tour tour6 = new Tour("Turkey", "relax", "ferryboat", "AL", 14);
        Tour tour7 = new Tour("Turkey", "relax", "airplane", "AL", 21);
        Tour tour8 = new Tour("UAE", "shopping", "airlane", "BB", 14);

        List<Tour> tours = new ArrayList<>();
        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        tours.add(tour4);
        tours.add(tour5);
        tours.add(tour6);
        tours.add(tour7);
        tours.add(tour8);

        TravelAgency travelAgency = new TravelAgency(tours);

        Scanner sc = new Scanner(System.in);
        System.out.println("Сделайте выбор страны: UAE, Cyprus, Vilnus, Italy, UK, Turkey");
        String country = sc.nextLine();
        List<Tour> countryResult = travelAgency.chooseCountryForTravel(country);
        //for(Tour tour: countryResult){
        //     System.out.println(tour);
        // }
        // System.out.println();

        System.out.println("Сделайте выбор транспорта: airplane, ferryboat, bus");
        String transport = sc.nextLine();
        System.out.println();

        System.out.println("Сделайте выбор питания: RO, BB, HB, FB, AL");
        String food = sc.nextLine();
        System.out.println();

        System.out.println("Выберите кол-во дней: 7, 10, 12, 14, 21");
        int day = sc.nextInt();


    }
}
