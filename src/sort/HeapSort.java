package sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {18, 77, 70, 92, 61, 64, 36, 90, 56, 1, 87, 86, 14, 96, 83, 16, 68, 63, 72, 25, 24, 89, 50, 23, 9, 79, 75, 69, 4, 40};
        int len = arr.length;
        buildMaxHeap(arr, len);
        int temp;
        for (int i = len - 1; i > 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            len--;
            heapify(arr, 0, len);
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void buildMaxHeap(int[] arr, int len) {
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    public static void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, len);
        }
    }
}
