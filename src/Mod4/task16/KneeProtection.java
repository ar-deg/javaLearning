package Mod4.task16;

public class KneeProtection extends Equipment {
    public KneeProtection(String productName, double price, String levelOfProtection, String size, int article) {
        super(productName, price, levelOfProtection, size, article);
    }

    @Override
    public String getStandardEquip() {
        return "Сертификация защиты колен" + getLevelOfProtection();//lvl 1 and lvl 2
    }


}
