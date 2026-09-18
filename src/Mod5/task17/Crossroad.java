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
    Condition northWestCondition = lock.newCondition();
    Condition sothEastCondition = lock.newCondition();

    public void waitingForPass(Direction direction, TrafficLight trafficLight) {
        lock.lock();
        try {
            if (direction == Direction.NORTH_TO_WEST || direction == Direction.WEST_TO_NORTH) {
                while (!trafficLight.currentColor.equals(TrafficLight.GREEN)) {
                    try {
                        northWestCondition.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else if (direction == Direction.EAST_TO_SOUTH || direction == Direction.SOUTH_TO_EAST) {
                while (!trafficLight.currentColor.equals(TrafficLight.RED)) {
                    try {
                        sothEastCondition.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

            }

        } finally {
            lock.unlock();
        }
    }

}


public static void main(String[] args) throws InterruptedException {


}

enum Direction {
    NORTH_TO_WEST,
    WEST_TO_NORTH,
    SOUTH_TO_EAST,
    EAST_TO_SOUTH;
}

public static class TrafficLight implements Runnable {
    public static final String GREEN = "GREEN";
    public static final String YELLOW = "YELLOW";
    public static final String RED = "RED";

    public volatile String currentColor;
    public final Crossroad crossroad;

    public TrafficLight(Crossroad crossroad, String currentColor) {
        this.crossroad = crossroad;
        this.currentColor = currentColor;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (currentColor.equals(GREEN)) {
                System.out.println("Светофор: зеленый свет");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                currentColor = YELLOW;

            } else if (currentColor.equals(YELLOW)) {
                System.out.println("Светофор: желтый свет");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                currentColor = RED;


            } else if (currentColor.equals(RED)) {
                System.out.println("Светофор: красный свет");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                currentColor = GREEN;


            }
        }
    }

    public static class Car implements Runnable {
        private String carMod;
        private Direction direction;
        private Crossroad crossroad;

        public Car(String carMod, Direction direction, Crossroad crossroad) {
            this.carMod = carMod;
            this.direction = direction;
            this.crossroad = crossroad;
        }

        @Override
        public void run() {
            //crossroad.waitingForPass();
        }
    }
}
