
import java.util.*;

class Odd_num_balloon{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = sc.nextInt();
    
    String balloon[] = new String[n];
        Map<String, Integer> CountMap = new LinkedHashMap<>();


        for(int i = 0; i<n; i++){
            balloon[i] = sc.next().toLowerCase();
            CountMap.put(balloon[i], CountMap.getOrDefault(balloon[i], 0 ) + 1);
        }

        String result = "All are even";
        for (Map.Entry<String, Integer> entry : CountMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result = entry.getKey();
                break; // Stop at the first odd occurrence
            }
        }

        System.out.println("Result: " + result);
}
}