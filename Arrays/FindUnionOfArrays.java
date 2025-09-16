import java.util.*;

public class FindUnionOfArrays {
    public static void main(String[] args){


        Set<Integer> set = new HashSet<>();   // best and easiest method is using hashset.

        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {3,4,5,6,};

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            set.add(num);
        }

        System.out.println("Union is: "+ set);
    }
    
}
