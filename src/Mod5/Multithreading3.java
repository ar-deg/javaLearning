package Mod5;

public class Multithreading3 {
    private int counter;

    static void main() throws InterruptedException {
        Multithreading3 multithreading3 = new Multithreading3(); //создаем новый объект java.
        // У каждого объекта в java после создания, каждому объекту присваивается какая-то сущность.
        // И эта сущность в один момент времени может быть только у 1 потока. Synchronized использует это.
        // Для синхронизации нужен объект
        multithreading3.doWork();

    }

    public synchronized void increment() {  //synchronized/volatile - пишем только в методах
        //synchronized работает таким образом, что только один поток в один момент времени получает доступ к выполнению тела метода.
        //т.е если синхронизованно -> один поток в один момент времени может выполнять.
        // Если 2 потока -> одновременно не могут попасть в тело метода increment. Другой поток ждет
        counter++;
    }

    public void increment1() {
        synchronized (this) {   //synchronized-блок
            counter++;
        }
        System.out.println("Hello");
    }

    /*
    1: 100-> 101-> 101 (лежит в counter это число) -> 102 -> 102 -> 103 -> 103
    2: 100(а у второго потока в памяти все еще 100) -> 101 -> 101
     */
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();


            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();   //метод join выбрасывает исключения, когда он срабатывает *InterruptedException
        //хотим в текущем потоке(main) подождать, пока завершится поток thread1
        thread2.join();

        System.out.println(counter);
    }
}
