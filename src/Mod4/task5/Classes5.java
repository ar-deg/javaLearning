package Mod4.task5;

/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
в заданном дииапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имееет методы увеличения и уменьшения состояния, и метод позволяющий получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */
public class Classes5 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("Текущее значение счетчика:");
        System.out.println(counter.getCurrentCount());

        System.out.println("Значение счетчика после увеличения:");
        counter.incrementCount();
        System.out.println(counter.getCurrentCount());

        System.out.println("Значение счетчика после уменьшения:");
        counter.decrementCount();
        System.out.println(counter.getCurrentCount());

        Counter counter1 = new Counter(5, 10, 0);
        System.out.println("Текущее значение счетчика1:");
        System.out.println(counter1.getCurrentCount());

        System.out.println("Значение счетчика1 после увеличения:");
        counter1.incrementCount();
        System.out.println(counter1.getCurrentCount());

        System.out.println("Значение счетчика1 после уменьшения:");
        counter1.decrementCount();
        System.out.println(counter1.getCurrentCount());


    }
}
