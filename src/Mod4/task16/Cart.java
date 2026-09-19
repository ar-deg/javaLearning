package Mod4.task16;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<Equipment> cartEquip = new ArrayList<>();

    public Cart() {
    }

    public List<Equipment> getCartEquip() {
        return cartEquip;
    }

    public void setCartEquip(List<Equipment> cartEquip) {
        this.cartEquip = cartEquip;
    }

    public void addEquipToTheCart(Equipment equip) {
        cartEquip.add(equip);
    }

    public double calculateTotalCart() {
        double sum = 0;
        for (Equipment equip : cartEquip) {
            sum += equip.getPrice();
        }
        return sum;
    }

    public void showCart() {
        for (Equipment equip : cartEquip) {
            System.out.println("Товар в корзине: " + equip.getProductName() + " / " + "(размер - " + equip.getSize() + " / " + "(уровень защиты) - " + equip.getLevelOfProtection() + " / " + "(стоимость) - " + equip.getPrice() + " byn ");
        }
    }

    public void clear() {
        cartEquip.clear();
    }


}

