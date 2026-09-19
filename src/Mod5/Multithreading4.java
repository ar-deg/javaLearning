package Mod5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Multithreading4 {
    public static void main() throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() { //может быть такое, что два потока могут вызвать addToList1, если поток зашел,
        // то второй поток уже не может выполнить этот метод сам, т.к lock1 занят, только после выполнения первого.
        synchronized (lock1) { //синхронизируемся на объекте lock1 / на его мониторе
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }


    }

    public void addToList2() { //но может быть такое, что один поток выполняет addToList2,
        // а другой addToList1 -> от этого достигается быстрая работа программы + при этом нет гонки
        synchronized (lock2) { //синхронизируемся на объекте lock2 / на его мониторе
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start(); //когда запускается программа, два потока начинают свое выполнение, они вызывают метод work (см. выше ^)
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");
        System.out.println("List1 " + list1.size());
        System.out.println("List2 " + list2.size());
    }
}