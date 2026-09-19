package Mod4.task16;

public class Jacket extends Equipment {
    public Jacket(String productName, double price, String levelOfProtection, String size, int article) {
        super(productName, price, levelOfProtection, size, article);
    }

    @Override
    public String getStandardEquip() {
        return "Стандарт куртки" + getLevelOfProtection(); //AAA: Максимальная защита для трека.
        // AA: Высокий уровень защиты для дорожного использования.
        // A: Средний уровень защиты (оптимально для города), облегченные материалы.
        // B: Одежда без ударозащиты, только от истирания.
        // C: Вставки-протекторы, носимые под другой одеждой.
    }


}
