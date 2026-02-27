// Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to
// cycling with his friends.
// So every time when the months starts he counts the number of sundays he will get to enjoy.
// Considering
// the month can start with any day, be it Sunday, Monday.... Or so on.
// Count the number of Sunday jack will get within n number of days.
// Example 1:
// Input
// 
// mon-> input String denoting the start of the month.
// 13 -> input integer denoting the number of days from the start of the month.
// Output :
// 2 -> number of days within 13 days.

import java.util.*;
public class CountSundays {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // input of the day on which month starts
        System.out.print("Enter the day on which month starts : ");
        String startDay = sc.next().toLowerCase();

        // input of number of days in the month
        System.out.print("Enter the number of days in the month : ");
        int n = sc.nextInt();

        String[] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        int startIndex = -1;

        for(int i =0 ;i<days.length ;i++){
            if(days[i].equals(startDay)){
                startIndex = i;
                break;
            }
        }
        int countSundays = 0;
        for(int i = 0; i < n; i++){
            if((startIndex + i) % 7 == 0){
                countSundays++;
            }
        }
        System.out.println(countSundays);

    }
    
}
