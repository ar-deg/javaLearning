package Mod4.task16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {
    private List<Equipment> equipmentList;

    public Store(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public void sortEquip(List<Equipment> equipmentList) {//сортировка по цене есть
        equipmentList.sort(Comparator.comparing(Equipment::getPrice));
    }

    public double calculateTotal(List<Equipment> equipmentList) {//подсчет суммы есть
        double sum = 0;
        for (Equipment equip : equipmentList) {
            sum += equip.getPrice();
        }
        return sum;
    }

    public List<Equipment> findEquip(List<Equipment> equipmentList, String levelOfProtEquip) {//поиск экипировки есть по степени защиты
        List<Equipment> findEquip = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if (equipment.getLevelOfProtection().equals(levelOfProtEquip)) {
                findEquip.add(equipment);
            }
        }

        if (findEquip.isEmpty()) {
            System.out.println("К сожалению, мы не смогли найти совпадений");
        }

        return findEquip;

    }

    public List<Equipment> findEquip(String levelOfProtEquip, List<Equipment> equipmentList) {//поиск экипировки есть по степени защиты
        List<Equipment> findEquip = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if (equipment.getLevelOfProtection().equals(levelOfProtEquip)) {
                findEquip.add(equipment);
            }
        }

        if (findEquip.isEmpty()) {
            System.out.println("К сожалению, мы не смогли найти совпадений");
        }

        return findEquip;

    }


    public void showStore() {
        int number = 1;
        for (Equipment equip : equipmentList) {
            System.out.println("Товар " + number + " : " + equip.getProductName() + " " + " (размер) - " + equip.getSize() + " / " + " (уровень защиты) - " + equip.getLevelOfProtection() + " / " + " (артикул) - " + equip.getArticle());
            number++;

        }
    }


}
