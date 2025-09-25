public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6,8, 9}; // fixed order
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Merged Sorted Array: ");
        printArray(mergedArray);
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) arr3[k++] = arr1[i++];
        while (j < n2) arr3[k++] = arr2[j++];

        return arr3;
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
