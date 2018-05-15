package chapter1;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int []arr) {
        if (arr==null || arr.length<2){
            return;
        }

        for (int i=1;i<arr.length;i++) {
            for(int j=i-1;j>=0 && arr[j]>arr[j+1];j--) {
                swap(arr, j, j+1);
            }
        }
    }

    public static void swap(int[]arr , int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] testarr = new int[] {2, 4, 1, 5, 9, 6};
        sort(testarr);
        System.out.println(Arrays.toString(testarr));
    }
}
