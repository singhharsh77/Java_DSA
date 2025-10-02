package JTG;

// Provided a sorted linked list, write a program to delete all the nodes that have
// duplicate numbers, leaving the linked list having unique numbers.

// INPUT: 2-4->5->5->6->8->8
// OUTPUT: 2->4->5->6->8
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    
    }
}
public class LinkedList_DeleteDublicateNumbers {
    public static void main(String[] args){
        //ya to ese manual bana do ya fir linked list ka constructor bana do
        // ListNode head = new ListNode(2);
        // head.next = new ListNode(4);
        // head.next.next = new ListNode(5);
        // head.next.next.next = new ListNode(5);
        // head.next.next.next.next = new ListNode(6);
        // head.next.next.next.next.next = new ListNode(8);
        // head.next.next.next.next.next.next = new ListNode(8);}
        int[] values = {2,4,5,5,6,8,8};
        ListNode head = BuildList(values);

        System.out.print("Input: ");
        printList(head);

        head = deleteDuplicate(head);

        System.out.print("Output: ");
        printList(head);

    
    
    }
    // First Build krenge linked list Function se jo array banaya tha use ab list me convert krenge
    public static ListNode BuildList(int[] head){
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            for(int v : head){
                curr.next = new ListNode(v);
                curr = curr.next;
            }
            return dummy.next;
    }

    // Ab function bnaenge jo duplicate remove krega
    public static ListNode deleteDuplicate(ListNode head){
        ListNode current = head;
        while(current != null & current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
    
    //LinkedList ko print kra denge function use kr k
    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val);
            if(head.next != null){
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }


}
