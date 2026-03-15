// Question #2: A Sober Walk
// Our hoary culture had several great persons since time immemorial and king
// Vikramaditya’s nava ratnas (nine gems) belongs to this ilk. They are named in the
// following shloka:
// Among these, Varahamihira was an astrologer of eminence and his book Brihat
// Jataak is recokened as the ultimate authority in astrology. He was once talking
// with Amarasimha, another gem among the nava ratnas and the author of the
// Sanskrit thesaurus, Amarakosha. Amarasimha wanted to know the final position
// of a person, who starts from the origin 0 0 and travels per the following scheme.
// • He first turns and travels 10 units of distance
// • His second turn is upward for 20 units
// • The third turn is to the left for 30 units
// • The fourth turn is downward for 40 units
// • The fifth turn is to the right(again) for 50 units
// ... And thus he travels, every time increasing the travel distance by 10 units.
// Constraints:
// 2<=n<=1000
// Input:
// 3
// OUTPUT
// -20 20
import java.util.*;
class final_coordinates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of turns: " );
        int n = sc.nextInt();

        int x = 0, y = 0;
        for (int i = 1; i <= n; i++) {
    int distance = i * 10;

    if (i % 4 == 1) {        // Right
        x += distance;
    } 
    else if (i % 4 == 2) {   // Up
        y += distance;
    } 
    else if (i % 4 == 3) {   // Left
        x -= distance;
    } 
    else {                   // Down
        y -= distance;
    }
}
        System.out.println(x + " " + y);
    }
}