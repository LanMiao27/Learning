package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{5, 2, 4, 8, 9, 3};
        int temp = 0;

        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] < arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j+1] = temp;
                }
            }

        }
        System.out.print(Arrays.toString(arrays));

    }
}

