public class InsertionsSort {
    // i = 1 se loop chalu krenge coz we assume ki 0th element sorted h
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i-1;
            for(; j>=0;j--){
                if(arr[j] > temp){
                arr[j+1] = arr[j];
            }
        
            else{
                break;
            }

        }
        arr[j+1] = temp;
        }
}
public static void printArray(int[] arr){
    int n = arr.length;
    for(int x : arr){
        System.out.print(x+ " ");

    }
     System.out.println();
}
}