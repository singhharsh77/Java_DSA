//  DSA question on sitting arrangement based on array

// seats . Interview asked me input - 0 0 0 1 0 0 1 0 0 0 o/p-2(1 0 0 1 0 0 1 0 0 1)

// I got a question paper which had 2 questions Q1: Given an array of seats in which "0" represents
//  empty seat and "1" represents filled seat, find out the maximum number of seats that can be filled, 
// given that there is a difference of at least 2 seats between each person. EG1: [1, 0, 0, 0, 0, 1] -> no seats can
//  be filled as there is never a gap of 2 people	 between the seats. So answer is 0. EG2: [0, 0, 0, 0, 0,, 0 0, 0, 1, 1, 0, 0] -> 1 
// seat can be filled at index 5 as there is a gap of 2 seats on both sides. So final seat arrangement will be: [1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0]. 
// Final answer is 1
import java.util.*;
public class seatingArrangement {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of seat");
    int n = sc.nextInt();
    
System.out.println("Enter the seat arrangement");
    int[] seats = new int[n];
    
    for(int i = 0; i<n ;i++){
        seats[i] = sc.nextInt();
    }

    System.out.println("Maximum seats that can be filled: " + findMaxSeats(seats));

    
 }    
 private static int findMaxSeats(int[] seats){
    int count = 0;
    int n = seats.length;
    for(int i = 0 ;i<n;i++){
    if (seats[i] == 0){
            boolean left1 = (i-1 < 0) || (seats[i-1] ==0);
            boolean left2 = ( i-2 < 0) || (seats[i-2] == 0);
            boolean right1 = (i+1 >= n) || (seats[i+1] == 0);
            boolean right2 = (i+2 >= n) || (seats[i+2] == 0);
            if (left1 && left2 && right1 && right2) {
                seats[i] = 1;
                count++;
            }
        }
    }
    return count;
 }
}
