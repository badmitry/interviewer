package hw;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static int[] arr = new int[100];

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            arr[i] = random.nextInt(100);
        }
        printArr(arr); // печать неотсортированного массива

    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.printf("%d.", arr[arr.length - 1]);
    }
}
