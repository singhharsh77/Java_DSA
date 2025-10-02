import java.util.*;
public class Armstrong_num {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = sc.nextInt();

    int Original = num ; 
    int sum = 0;

    int digits = String.valueOf(num).length();

    while(num > 0){
        int digit = num%10;
        sum += Math.pow(digit, digits);
        num /= 10;
    }

    if(sum == Original){
        System.out.print(Original+" is an Armstrong number. ");
    }else{
        System.out.print(Original+" is not Armstrong number. ");
    }
    sc.close();

    }
}
