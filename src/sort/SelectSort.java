package sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{5, 2, 4, 8, 9, 3};
        int max=0;
        int temp;

        for (int i = 0; i < arrays.length-1; i++) {
            max=0;
            for (int j = 0; j < arrays.length-i; j++) {
                if(arrays[j]>arrays[max]){
                    max=j;
                }
            }
            temp=arrays[max];
            arrays[max]=arrays[arrays.length-1-i];
            arrays[arrays.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arrays));
    }
}
