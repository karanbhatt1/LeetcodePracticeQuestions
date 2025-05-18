package twoPointer;
import java.util.LinkedList;

//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class RemoveDuplicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev;
        ListNode next = head.next;
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;;
        prev = dummy;
        while(curr!= null){
            next = curr.next;
            if(curr.next!= null && curr.val == curr.next.val){
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }

            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
    }
}
