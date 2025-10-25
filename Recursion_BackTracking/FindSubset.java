package Recursion_BackTracking;
import java.util.*;
public class FindSubset {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,5,6,6};
        List<Integer> current = new ArrayList<>();
        findSubset(arr,0,current);
    }

    public static void findSubset(int[] arr, int index ,List<Integer> current){

        if(index == arr.length){
            System.out.println(current);
            return;
        }

    findSubset(arr, index+1, current);
    current.add(arr[index]);

    findSubset(arr, index+1, current);
    current.remove(current.size() -1);


    }
}
    

