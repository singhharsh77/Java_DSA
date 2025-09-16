public class SortZeroOne {
    // Array di hui {1,0,1,0,0,0,1,1,0,0,1,0,1,0};
    //sare 0 left me sare 1 right me
    // CHALL SHURU HOOOJJJJAAAAAAAAAA.A..A.A..AA..AA......
    public static void sort(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<=right){
            while (arr[left]==0 && left<right) {
                left++;
            }
        while (arr[right]==1 && left<right) {
            right--;
        }
        if (left<right) {
            swap(arr, left,right);
            left++;
            right--;
        }
        }
    }

    public static void swap(int[] arr, int i, int j){
        if (i == j) return; // avoid zeroing if same index
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void printArr(int[] arr) {
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,1,0,1,0,0,1,1,0,0,1,0,1};

        sort(arr);
        printArr(arr);
    }
    
}
