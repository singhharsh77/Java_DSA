
public class SwapAlteranteNumbers {
   
    public static void printArray(int[] arr, int n){
    for(int i=0;i<n;i++){
        System.out.print (arr[i]+" ");

    }
}
    public static void swapAlternate(int[] arr, int size){

        for(int i=0;i<size;i+=2){
            if(i+1<size){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            }
        }
    }
    public static void main(String[] args){
       
        int[] even = {1,2,3,4,5,6,7,8};
        int[] odd = {9,8,7,6,5};


        swapAlternate(even, 8);
        printArray(even,8);
    }
}