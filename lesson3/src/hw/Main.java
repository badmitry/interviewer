package hw;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static int[] arr = new int[10];
    private static int[] arr100 = new int[100];
    private static int[] plainNumberArr;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int i = 0; i < 100; i++) {
            arr100[i] = i + 1;
        }

        printArr(arr);
        printArr(sortArr(arr));
        System.out.println(fibonachi(10));
        System.out.println(fibonachi1(10));
        printArr(arr100);
        makeArrPlainNumber(arr100);
        printArr(plainNumberArr);

    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.printf("%d.%n", arr[arr.length - 1]);
    }

    private static int [] sortArr(int[] arr) {
        int arr2[] = new int[arr.length];
        int temporaryInt;
        for (int i = 0; i < arr.length; i++) {
            temporaryInt = -1;
            for (int j = 0; j < i; j++) {
                if (arr2[j] > arr[i]) {
                    temporaryInt = arr2[j];
                    arr2[j] = arr[i];
                    for (int k = j + 1; k <= i; k++) {
                        int temporaryInt2;
                        temporaryInt2 = arr2[k];
                        arr2[k] = temporaryInt;
                        temporaryInt = temporaryInt2;
                    }
                    break;
                }
            }
            if (temporaryInt == -1) {
                arr2[i] = arr[i];
            }
        }
        return arr2;
    }

    private static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    private static int fibonachi1(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        if (n == 0) {
            fn = f0;
        } else if (n == 1) {
            fn = f1;
        } else {
            for (int i = 2; i <= n; i++) {
                fn = f1 + f0;
                f0 = f1;
                f1 = fn;
            }
        }
        return fn;
    }

    private static void makeArrPlainNumber(int[] arr) {
        int counterLengthArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == 1) {
                continue;
            }
            counterLengthArr++;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] % arr[i] == 0) {
                    arr[j] = 0;
                }
            }
        }
        plainNumberArr = new int[counterLengthArr];
        int arrCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] != 1) {
                plainNumberArr[arrCounter] = arr[i];
                arrCounter++;

                if (arrCounter == counterLengthArr) {
                    break;
                }
            }
        }
    }
}
