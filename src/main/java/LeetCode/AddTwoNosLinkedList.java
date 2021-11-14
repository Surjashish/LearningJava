package LeetCode;

import coreJava.DataStructures.LinkedList.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  Definition for singly-linked list.
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


public class AddTwoNosLinkedList {
    class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2)
        {
            ListNode head=new ListNode(0);
            ListNode curr = head;
            do {
                int n1=(l1 != null)? l1.val : 0;
                int n2=(l2 != null)? l2.val : 0;
                int sum=(n1 + n2)%10;
                int carr = (n1+n2)/10;

                if (curr.next!=null) {
                    curr.next = new ListNode((sum + 1) % 10);
                    if ((sum + 1)/10 !=0 )carr = 1;
                }
                else
                    curr.next=new ListNode(sum);
                curr=curr.next;
                if (carr !=0)
                    curr.next=new ListNode(1);
                if (l1 != null) l1=l1.next;
                if (l2 !=null)l2=l2.next;

            }while (l1 !=null || l2 !=null);

            return head.next;
        }
    }
}

