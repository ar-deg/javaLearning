package Mod4.task1;


/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных
 */
public class Classes1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.displayMethod();
        System.out.println();

        test.changeVariables(1, 6);
        System.out.println();

        System.out.println("Сумма двух переменных =" + " " + test.sumNum());
        System.out.println();

        System.out.println("Наибольшее значение =" + " " + test.maxNum());


    }
}

