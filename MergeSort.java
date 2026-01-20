/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAT SHOP
 */
public class MergeSort {

    // Main function that sorts arr[l..r] using merge()
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Recursively sort the left half
            mergeSort(arr, l, m);

            // Recursively sort the right half
            mergeSort(arr, m + 1, r);

            // Merge the two halves
            merge(arr, l, m, r);
        }
    }

    // Function to merge two subarrays of arr[]
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of the subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Initial indices
        int i = 0, j = 0;
        int k = l;

        // Merge temp arrays back into arr[l..r]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {45, 27, 43, 78, 9, 82, 1};

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);
    }
}

    

