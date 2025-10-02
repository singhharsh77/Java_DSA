import java.util.*;

class DuplicateWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String[] words = str.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word: words){
            wordCount.put(word, wordCount.getOrDefault(word,0)+ 1);
        }

        System.out.print("Dublicate Words are: ");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
    } 
              sc.close();

}
}