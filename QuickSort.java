package SortingAlgorithms;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr[n] = Integer.MAX_VALUE;
        QuickSort ob = new QuickSort();
        System.out.println("Before Sorting");
        ob.printArray(arr, n);
        ob.QuickSorting(n, 0, arr, n-1);
        System.out.println("After Sorting");
        ob.printArray(arr, n);
        sc.close();
    }

    private void QuickSorting(int n, int l, int[] arr, int h) {
        if(l<h){
            int j = Partition(n,l,arr,h);
            System.out.println(j);
            QuickSorting(0, l, arr, j);
            QuickSorting(0, j+1, arr, h);
        }

    }
    private int Partition(int n, int l, int[] arr, int h){
        int pivot = arr[l];
        int i = l;
        int j = h;
        while(i<j){
            System.out.println(i+"  "+j);
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                System.out.print(true+"   ");
                swap(arr, i ,j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private void swap(int[] arr, int l, int j) {
        int t = arr[l];
        arr[l] = arr[j];
        arr[j] = t;
    }

    private void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
