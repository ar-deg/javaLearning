package Mod4.task6;

/*
Составьте описание класса для представления времени.
Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой
допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное кол-во часов, минут и секунд.
 */
public class Classes6 {
    public static void main(String[] args) {
        Time time = new Time(8, 15, 20);
        System.out.println(time.toString());

        System.out.println();

        time.setHour(9);
        time.setMin(25);
        time.setSec(59);
        System.out.println(time.toString());

        System.out.println();
        time.setMin(15);
        System.out.println(time.toString());


    }

}
