package Recursion_BackTracking.Sort;
// [38, 27, 43, 10] is divided into [38, 27] and [43, 10] . 
// [38, 27] is divided into [38] and [27] . 
// [43, 10] is divided into [43] and [10] . 
// Conquer: 
// [38] is already sorted. 
// [27] is already sorted. 
// [43] is already sorted. 
// [10] is already sorted. 
// Merge: 
// Merge [38] and [27] to get [27, 38] . 
// Merge [43] and [10] to get [10,43] . 
// Merge [27, 38] and [10,43] to get the final sorted list [10, 27, 38, 43] 
// Therefore, the sorted list is [10, 27, 38, 43] .
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 65, 23, 87, 44, 33, 4, 5, 6, 7};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        // divide
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // merge
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
}
