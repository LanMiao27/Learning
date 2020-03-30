package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = randomCommon(1, 100, 30);
        System.out.println(Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergesort(int[] arr, int L, int R) {
        if (L == R)
            return;
        else {
            int M = (L + R) / 2;
            mergesort(arr, L, M);
            mergesort(arr, M + 1, R);
            merge(arr, L, M + 1, R);
        }
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] leftArray = new int[M - L];
        int[] rightArray = new int[R - M + 1];

        for (int i = L; i < M; i++) {
            leftArray[i - L] = arr[i];
        }
        for (int i = M; i <= R; i++) {
            rightArray[i - M] = arr[i];
        }
        int i = 0, j = 0;
        int k = L;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
                k++;
            } else {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static int[] randomCommon(int min, int max, int n) {
        if (n > (max - min + 1) || max < min) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while (count < n) {
            int num = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }
}
