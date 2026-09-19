package Mod4.task16;

public class MotorcycleGloves extends Equipment {
    private String worldStandard = "EN13594";

    public MotorcycleGloves(String productName, double price, String levelOfProtection, String size, int article) {
        super(productName, price, levelOfProtection, size, article);
    }

    @Override
    public String getStandardEquip() {
        if (getLevelOfProtection().equals(worldStandard)) {
            return "Регламент мотоперчаток" + getLevelOfProtection();
        } else {
            return "Ошибка! такого регламента не сущ-ет";
        }
    }


}

