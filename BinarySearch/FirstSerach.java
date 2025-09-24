package BinarySearch;

public class FirstSerach {

    public static int binarySrch(int arr[], int size, int key){
        int start = 0;
        int end = size-1;

        int mid = start + (end-start)/2;

        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }

            if(key> arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }mid = start + (end-start)/2;

        }
        return -1;
    }
    public static void main(String[] args){
         int[] even = {2, 3, 5, 8, 9, 55, 67};
        int[] odd = {2, 3, 4, 5, 6, 34, 634};

        int index = binarySrch(odd, odd.length, 5);
        System.out.print("Index of 5 in odd array is: "+index);
    }
}
