package sorting_algorithms;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int low = 0;
        int high = arr.length - 1;
        new MergeSort().sort(arr, low, high);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[i + low];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[j + mid + 1];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
