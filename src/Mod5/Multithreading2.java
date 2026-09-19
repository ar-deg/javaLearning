package Mod5;

import java.util.Scanner;

public class Multithreading2 {
    static void main() {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        myThread2.shutdown();
    }
}

class MyThread2 extends Thread { //теперь это поток
    private volatile boolean running = true; // volatile* - она может быть изменена;
    // используется, когда один поток пишет переменную, а все остальные потоки читают эту переменную.
    // Переменные не кэшируются в памяти ядра, а каждый раз читается из общей памяти.

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }

}
