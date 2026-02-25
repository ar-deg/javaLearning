package Mod2;

/*
Даны дроби p1/q1, p2/q2,..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в пордке возрастания.
-создание двух массивов ( массив числителей и массив знаменателей)
-нахождение наименьшего общего знаменателя commonDenominator:
-пусть НОЗ(НОК) будет первым числом;
-прохождение по циклу;
-нахождение НОД (цикл while);
-вывод общего знаменателя;
-приведение числителя к знаменателю:
-создать новый массив числителей (те, что будут приведены к знаменателю, чтобы исходные не пропали);
-отсортировать пузырьком дробь (сортировка идет в числителе, при выводе добавление общего знаменателя)
 */
public class SortArray8 {
    public static void main(String[] args) {
        int[] p = {1, 4, 5, 3, 7, 2}; // 1/2, 4/3, 5/6, 3/4, 7/3, 2/3
        int[] q = {2, 3, 6, 4, 3, 3};

        int commonDenominator = q[0];
        for (int i = 0; i < q.length; i++) {
            int a = commonDenominator;
            int b = q[i];
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int gcd;
            while (b != 0) {
                gcd = a % b;
                a = b;
                b = gcd;
            }
            commonDenominator = (commonDenominator * q[i]) / a;
        }
        System.out.println("Наименьший общий знаменатель:" + " " + commonDenominator);
        System.out.println();

        System.out.println("Приведение числителя к  общему знаменателю:");
        int[] pNew = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            pNew[i] = p[i] * (commonDenominator / q[i]);
            System.out.print(pNew[i] + " ");
        }
        System.out.println();

        int length = p.length;
        System.out.println("Исходная дробь:");
        for (int i = 0; i < length; i++) {
            System.out.print(p[i] + "/" + q[i] + " ");
        }
        for (int i = 0; i < length - 1; i++) { //кол-во проходов по массиву
            for (int j = 0; j < length - i - 1; j++) { //j проходится по парам
                if (pNew[j] > pNew[j + 1]) {
                    int temp = pNew[j];
                    pNew[j] = pNew[j + 1];
                    pNew[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Приведенная дробь в порядке возрастания:");
        for (int i = 0; i < length; i++) {
            System.out.print(pNew[i] + "/" + commonDenominator + " ");
        }


    }

}
