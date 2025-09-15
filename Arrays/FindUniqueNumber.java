public class FindUniqueNumber {

    public static int unique(int[] arr, int size){
        int ans = 0;
        for(int i= 0; i<size;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args){

        int[] arr = {1,2,2,1,5,6,6,8,8};
        int size = arr.length;
         
        int result = unique(arr, size);
        System.out.println("The non reapeated value is: "+result);
    }
    
}
