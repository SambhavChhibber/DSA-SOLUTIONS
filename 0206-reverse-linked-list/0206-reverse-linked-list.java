class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;  //saving next before breaking the chain
            current.next=prev;  //pointing to previous one
            prev=current;
            current=next;


        }
        return prev;
    }
}