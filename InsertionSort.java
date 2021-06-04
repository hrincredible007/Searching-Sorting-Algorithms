import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertionSort ob = new InsertionSort();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting");
        ob.printArray(arr, n);
        ob.InsertionSorting(arr, n);
        System.out.println("After Sorting");
        ob.printArray(arr, n);
        sc.close();
    }

    private void InsertionSorting(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int current = arr[i]; // 2
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }arr[j + 1] = current;
        }
    }
    private void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
