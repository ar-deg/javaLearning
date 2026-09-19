package Mod4.task16;

public class BackProtection extends Equipment {
    public BackProtection(String producrName, double price, String levelOfProtection, String size, int article) {
        super(producrName, price, levelOfProtection, size, article);
    }

    @Override
    public String getStandardEquip() {
        return "Сертификация защиты спины" + getLevelOfProtection();//lvl 1 and lvl 2
    }


}
