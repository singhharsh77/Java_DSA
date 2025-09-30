package String_and_Character;
//Remove All Adjacent Duplicates In String
public class RemoveAdjacentDuplicates {
    public static void main(String[] args){
        String str = "abbaca";
        String result = removeAdjacentDuplicates(str);
        System.out.println("String after removing adjacent duplicates: " + result);
    }
    

    public static String removeAdjacentDuplicates(String str){
        // Stringbuilder se string ko modify karna easy hota hai
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            int length = sb.length();
            if(length > 0 && sb.charAt(length - 1) == ch){
                sb.deleteCharAt(length - 1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
