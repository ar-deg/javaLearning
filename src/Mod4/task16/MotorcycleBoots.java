package Mod4.task16;

public class MotorcycleBoots extends Equipment {
    private String worldStandardBoots = "EN13634";

    public MotorcycleBoots(String productName, double price, String levelOfProtection, String size, int article) {
        super(productName, price, levelOfProtection, size, article);
    }

    @Override
    public String getStandardEquip() {
        if (getLevelOfProtection().equals(worldStandardBoots)) {
            return "Стандарт бот" + getLevelOfProtection();
        } else {
            return "Ошибка! такого регламента не сущ-ет";
        }

    }


}
