import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Original Stack: " + s);
        insertAtBottom(s, 6);

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    private static void insertAtBottom(Stack<Integer> s, int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        insertAtBottom(s,data);
        s.push(top);

    }
    
}