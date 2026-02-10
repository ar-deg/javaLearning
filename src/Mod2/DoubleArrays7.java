package Mod2;

/*
Сформировать квадратную матрицу порядка N по правилу:
A[i,j] = sin((i^2-j^2)/n)
 */
public class DoubleArrays7 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(" Длина массива " + n);

        double[][] matrice = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = Math.sin(((Math.pow(i, 2)) - Math.pow(j, 2)) / n);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
