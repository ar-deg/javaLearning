package Mod4.task5;

public class Counter {      //произвольные значения
    private int currentCount;
    private int maxCount;
    private int minCount;

    public Counter(int currentCount, int maxCount, int minCount) {
        this.currentCount = currentCount;
        this.maxCount = maxCount;
        this.minCount = minCount;
    }

    public Counter() {        //значения по умолчанию
        this.currentCount = 0;
        this.maxCount = 10;
        this.minCount = -10;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(int minCount) {
        this.minCount = minCount;
    }

    public void checkParameters() {
        if (currentCount > maxCount) {
            System.out.println("неверное значение");
        } else if (currentCount < minCount) {
            System.out.println("неверное значение");
        }
    }

    public void incrementCount() {
        currentCount++;
        if (currentCount > maxCount) {
            currentCount = minCount;
        }
    }

    public void decrementCount() {
        currentCount--;
        if (currentCount < minCount) {
            currentCount = maxCount;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "currentCount=" + currentCount +
                ", maxCount=" + maxCount +
                ", minCount=" + minCount +
                '}';
    }
}
