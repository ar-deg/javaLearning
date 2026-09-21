package Mod5.task17;

/*
Смоделировать перекрёсток двух дорог: Север–Юг и Запад–Восток.
На каждом направлении — светофор, через перекрёсток едут машины.

Каждый светофор циклически переключается: зелёный → жёлтый → красный → зелёный.
Два перпендикулярных направления никогда не должны гореть зелёным одновременно.

Машина подъезжает к перекрёстку, ждёт зелёного на своём направлении и проезжает. На красный — стоит в очереди и ждёт.

Реализовать светофоры и машины как отдельные потоки.
Обеспечить корректную синхронизацию: зелёный горит максимум у одного направления в каждый момент времени,
ни одна машина не ждёт вечно, программа корректно завершается по сигналу остановки.

-поток машин
-поток светофоров
-синхронизация
-если цвета светофоров циклически переключаются => нужет sleep / то же самое с машинами - одни едут, а другие стоят?
-мне надо знать цвета светофоров (создать класс с данными о цветах)
-нужно знать направления : их должно быть  4
-светофор можно сделать через метод sleep зеленый -> желтый -> красный -> зеленый ?
каждая машина присвоена своему направлению и у нее свой светофор
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Crossroad {
    public Lock lock = new ReentrantLock();
    Condition diretcionCondition = lock.newCondition();


    public void waitingForPass(TrafficLight trafficLight) {
        lock.lock();
        try {
            while (!trafficLight.currentColor.equals(TrafficLight.GREEN)) {
                diretcionCondition.await();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Crossroad crossroad = new Crossroad();
        TrafficLight trafficLightNS = new TrafficLight(crossroad, "GREEN", "Север-Юг");
        Thread trafficLightThread1 = new Thread(trafficLightNS);
        trafficLightThread1.start();

        TrafficLight trafficLightWE = new TrafficLight(crossroad, "RED", "Запад-Восток");
        Thread trafficLightThread2 = new Thread(trafficLightWE);
        trafficLightThread2.start();


        Car car1 = new Car("BMW", Direction.NORTH_TO_SOUTH, crossroad, trafficLightNS);
        Thread carThread1 = new Thread(car1);
        carThread1.start();


        Car car2 = new Car("Audi", Direction.WEST_TO_EAST, crossroad, trafficLightWE);
        Thread carThread2 = new Thread(car2);
        carThread2.start();


        Car car3 = new Car("Jeely", Direction.SOUTH_TO_NORTH, crossroad, trafficLightNS);
        Thread carThread3 = new Thread(car3);
        carThread3.start();


        Car car4 = new Car("Lixiang", Direction.EAST_TO_WEST, crossroad, trafficLightWE);
        Thread carThread4 = new Thread(car4);
        carThread4.start();

        Thread.sleep(10000);
        trafficLightThread1.interrupt();
        trafficLightThread2.interrupt();


    }

    enum Direction {
        NORTH_TO_SOUTH,
        SOUTH_TO_NORTH,
        WEST_TO_EAST,
        EAST_TO_WEST;
    }

    public static class TrafficLight implements Runnable {
        public static final String GREEN = "GREEN";
        public static final String YELLOW = "YELLOW";
        public static final String RED = "RED";

        public volatile String currentColor;
        public final Crossroad crossroad;
        public final String directioName;

        public TrafficLight(Crossroad crossroad, String currentColor, String directioName) {
            this.crossroad = crossroad;
            this.currentColor = currentColor;
            this.directioName = directioName;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (currentColor.equals(GREEN)) {
                    System.out.println("Светофор " + directioName + " : зеленый свет");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    crossroad.lock.lock();
                    try {
                        currentColor = YELLOW;
                        crossroad.diretcionCondition.signalAll();
                    } finally {
                        crossroad.lock.unlock();
                    }


                } else if (currentColor.equals(YELLOW)) {
                    System.out.println("Светофор " + directioName + " : желтый свет");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    crossroad.lock.lock();
                    try {
                        currentColor = RED;
                        crossroad.diretcionCondition.signalAll();
                    } finally {
                        crossroad.lock.unlock();
                    }


                } else if (currentColor.equals(RED)) {
                    System.out.println("Светофор " + directioName + " : красный свет");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    crossroad.lock.lock();
                    try {
                        currentColor = GREEN;
                        crossroad.diretcionCondition.signalAll();
                    } finally {
                        crossroad.lock.unlock();
                    }
                }
            }
        }
    }

    public static class Car implements Runnable {
        private String carMod;
        private Direction direction;
        private Crossroad crossroad;
        private TrafficLight trafficLight;

        public Car(String carMod, Direction direction, Crossroad crossroad, TrafficLight trafficLight) {
            this.carMod = carMod;
            this.direction = direction;
            this.crossroad = crossroad;
            this.trafficLight = trafficLight;
        }

        @Override
        public void run() {
            crossroad.waitingForPass(trafficLight);
            System.out.println("Машина " + carMod + " проезжает перекресток по направлению " + direction + " на " + trafficLight.currentColor + " свет ");
        }
    }
}

