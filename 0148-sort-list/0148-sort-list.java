class Solution {
    public ListNode findMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
    ListNode merge(ListNode left,ListNode right){
        ListNode dummy= new ListNode(0);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            } else{
                temp.next=right;
                right=right.next;
                

            }
          temp=temp.next;

        }
        if(left!=null){temp.next=left;}
        if(right!=null){temp.next=right;}
         return dummy.next;
    }
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){return head;}
        ListNode mid=findMiddle(head);
        ListNode rightHalf=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rightHalf);
        return merge(left,right);
    }
}