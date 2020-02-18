import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Optional {
    /* Ввести с консоли n - размерность матрицы a [n] [n].
    Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).*/
    public static void printArr(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Введите размерность матрицы");
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.next());
        int[][] matrix;
        matrix = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int q = random.nextInt(21) - 10;
                //из генерируемого диапазона (от 0 и до 21) будет вычитаться 10.
                // Что при мин. значении nextInt (при 0) будет давать -10 и макс.
                // (при 20) 10, что нам и требуется. Но этот метод не подойдет, например, при мин. -510 и макс.
                // 10. Для этого можно использовать формулу int num = min + r.nextInt(max - min + 1);
                matrix[i][j] = random.nextInt(21) - 10;
            }
        }
        printArr(matrix);
        /* 2.     Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд. */
        int[] arr = new int[matrix.length * matrix.length];
        int c = 0;
        for (int[] x : matrix) {
            for (int elem : x) {
                arr[c++] = elem;
            }
        }
        int max = 0;
        int min = 0;
        int k = 0;
        int l = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                k++;
            } else {
                if (k > max)
                    max = k;
                k = 0;
            }
            if (arr[i] < arr[i + 1]) {
                l++;
            } else {
                if (l > min)
                    min = l;
                l = 0;
            }
        }
        if (k > max)
            max = k;
        if (l > min)
            min = l;

        min++;
        max++;
        System.out.println("наибольшее число возрастающих элементов матрицы, идущих подряд " + min);
        System.out.println("наибольшее число убывающих элементов матрицы, идущих подряд " + max);

        /*1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).*/
        for (int i = 0; i < n; i++){
            Arrays.sort(matrix[i]);
        }
        System.out.print("\n");
        printArr(matrix);

    }
}

