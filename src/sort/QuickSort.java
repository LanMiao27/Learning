package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = randomCommon(1, 100, 30);//get a random array
        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quicksort(int[] arr, int L, int R) {//L is the first el R is the last
        int i = L;
        int j = R;
        int temp;
        int pivot = arr[(L + R) / 2];

        //scan until cross
        while (i <= j) {
            while (pivot > arr[i])//find larger than pivot in left
                i++;
            while (pivot < arr[j])//find less than pivot in right
                j--;

            if (i <= j) {//find two num to exchange
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //continue move
                i++;
                j--;
            }
        }
        if (L < j)//"left" continue sort until having only one num
            quicksort(arr, L, j);
        if (i < R)//"right" continue sort until having only one num
            quicksort(arr, i, R);
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
