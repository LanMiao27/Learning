package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{5, 2, 4, 8, 9, 3};
        int temp;

        for (int i = 1; i < arrays.length; i++) {
            temp = arrays[i];
            int j = i;
            while (j > 0 && temp < arrays[j - 1]) {
                arrays[j] = arrays[j - 1];
                j--;
            }

            arrays[j] = temp;

        }

        System.out.println(Arrays.toString(arrays));

    }
}
