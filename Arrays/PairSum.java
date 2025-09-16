public class PairSum {
    // given an array of size "N" and an integer "S". 
    // find all pairs of elements such that each som of elements of each each equal to S
    // S=5, arr={1,2,3,4,5,6}
    // pair = 1,4  2,3 

    public static void main(String[] args){
        int[] arr = {2,-3,3,-3,-2};
        int s = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == s){ 
                    if (arr[i] < arr[j]) { // ensure consistent order
                        System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    }else{
                    System.out.println("(" + arr[j] + ", " + arr[i] + ")");

                    }
                }
            }
        }
    }
    
}
