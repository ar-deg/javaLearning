package Mod4.task16;

public class MotorcycleHelmet extends Equipment {
    public MotorcycleHelmet(String productName, double price, String levelOfProtection, String size, int article) {
        super(productName, price, levelOfProtection, size, article);
    }

    @Override
    public String getStandardEquip() {
        return "Регламент защиты головы" + getLevelOfProtection(); //ECE 22.06, DOT, SNELL
    }


}
