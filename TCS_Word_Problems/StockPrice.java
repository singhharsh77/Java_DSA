// You are given an array prices where prices[i] is the price of a given stock on the ith
// day.
// You want to maximize your profit by choosing a single day to buy one stock and
// choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve
// any profit, return 0.
// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5

import java.util.* ;
public class StockPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.print("Enter array elements : ");
        for(int i = 0; i<n; i++){
            prices[i] = sc.nextInt();
        }

        int maxProf = 0;            //  [7,1,5,3,6,4]
        int minPrice = prices[0];

        for(int i =0; i<n ;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;
                maxProf = Math.max(maxProf, profit);
            }

        }
        System.out.println(maxProf);
        sc.close();

    }
}
