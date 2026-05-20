package Mod4.task2;


/*
Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. Добавьте set- get- методы для полей экземпляра класса.
 */
public class Classes2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setNumber1(5);
        System.out.println("Значение number1 - " + test2.getNumber1());
        test2.setNumber2(8);
        System.out.println("Значение number2 - " + test2.getNumber2());


    }
}

