import java.util.*;
class NGramProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // input string
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
// input number 
        System.out.print("Entere N: ");
        int n = sc.nextInt();


        if(n>str.length() || n<=0){
            System.out.print("Invalid input please enter 'n' Greater than 0 ");

        }else{
            for(int i=0; i<=str.length()-n;i++){
                //  i<=str.length()-n
                //  Example: "hello" (length 5), n = 2
                //  Valid start indices → 0, 1, 2, 3
                //  5 - 2 = 3 → so loop runs till i = 3. 

                 String ngram = str.substring(i, i+n);
                //  i = 0 → substring(0, 2) → "he"
                //  i = 1 → substring(1, 3) → "el"
                //  i = 2 → substring(2, 4) → "ll"
                //  i = 3 → substring(3, 5) → "lo"
                System.out.print(ngram+" ");

            }
        }
                sc.close();


    }

}