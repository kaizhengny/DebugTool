package DataStructure;

public class Queue {
    private ListNode head;
    private int size;

    public ListNode offer(int value){
        return null;
    }

    public int poll(){
        ListNode newHead = head.next;
        return -1;

    }

    public int top(){

        return head.value;
    }


    class ListNode{
        int value;
        ListNode next;

        ListNode(int value){
            this.value = value;
        }
    }
}
