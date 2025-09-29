package String_and_Character;

public class ReplaceSpaces {
    public static void main(String[] args){

        String str = "Hello World! Welcome to Java Programming.";
        String modifiedStr = replaceSapces(str);
        System.out.println("Original String: " + str);
        System.out.println("Modified String by replace method: " + modifiedStr);
        String modifiedStrManual = replaceSapceManual(str);
        System.out.println("Modified String by manual method: " + modifiedStrManual);

    }
    public static String replaceSapces(String str){
        return str.replace(" ", "%20"); 

    }
    public static String replaceSapceManual(String str) {
    StringBuilder result = new StringBuilder(); // start EMPTY
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ') {
            result.append("%20"); // replace space
        } else {
            result.append(str.charAt(i)); // keep character
        }
    }
    return result.toString();
}
    
}
