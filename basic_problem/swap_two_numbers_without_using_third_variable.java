import java.util.*;
public class swap_two_numbers_without_using_third_variable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of 'a' : ");
        int a = sc.nextInt();

        System.out.print("Enter Value of 'b' : ");
        int b = sc.nextInt();

        System.out.println("Original numbers "+a+" "+b);

        System.out.println("Using addition and sub.");

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping "+a+" "+b);

        System.out.println("Using bitwise operator ");



        a = a^b;
        b = a^b;


        
        a = a^b;

        System.out.println("After Swapping "+a+" "+b);
        
        
        sc.close();

    }
}
