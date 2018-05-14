package chapter1;

import java.util.Arrays;

public class SelectorSort {
    public static void sort(int[] arr) {
        if (arr==null || arr.length<2) {
            return;
        }
        for (int i =0; i< arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j< arr.length-1;j++) {
                minIndex = arr[j] <  arr[minIndex] ? j: minIndex;
            }
            swap(arr, i, minIndex);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] a = new int[] {2,1,6,4,7};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
