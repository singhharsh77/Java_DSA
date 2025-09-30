import java.util.*;
public class UnionOfArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {3,4,2,4,5,6,8,8,9};
        int[] result = unionOfArrays(arr1, arr2);
        System.out.println("Union of two arrays is: " + Arrays.toString(result));
    }
        
    public static int[] unionOfArrays(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        // Adding elements of first array to the set
        for(int num : arr1){
            set.add(num);
        }
        // Adding elements of second array to the set
        for(int num: arr2){
            set.add(num);

        }
        // Converting the set back to an array
        int[] unionarr = new int[set.size()];
        int i = 0;
        for(int num: set){
            unionarr[i++]= num;
        }

        return unionarr;

    }
}
