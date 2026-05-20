package Mod4.task1;

class Test1 {
    int number1;
    int number2;

    void displayMethod() {
        System.out.printf("Первая переменная -" + " " + number1 + " " + "," + "Вторая переменная -" + " " + " " + number2);
    }

    void changeVariables(int newNum1, int newNum2) {
        number1 = newNum1;
        number2 = newNum2;
    }

    int sumNum() {
        int sum = number1 + number2;
        return sum;
    }

    int maxNum() {
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        return max;
    }
}
