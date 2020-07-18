package com.johngmarshall;

import java.util.ArrayList;

public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0,val1=0,val2=0;

        while(l1!=null||l2!=null){
            val1=(l1!=null)?l1.val:0;
            val2=(l2!=null)?l2.val:0;
            curr.next=new ListNode((val1+val2+carry)%10);
            carry=(val1+val2+carry)/10;
            curr=curr.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }

        if(carry>0) curr.next=new ListNode(carry);

        return dummy.next;
    }



 class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }
}


