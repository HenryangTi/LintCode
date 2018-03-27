package reverseListNode450;

import java.util.List;

public class reverseListNode {
    public ListNode reverseKgroups(ListNode head, int k){
        ListNode dummy = new ListNode(0);//值是什么没有关系
        dummy.next = head;

        ListNode prev = dummy;
        while(prev != null){
            prev = reverseAndReturnPrev(prev, k);
        }
        return dummy.next; //dummy.next就是head
    }

    private  ListNode reverseAndReturnPrev(ListNode prev, int k){
        ListNode lastPrev = prev;
        ListNode n1 = prev.next;
        ListNode nk = n1;

        for (int i = 0; i < k - 1; i++) {
            nk = nk.next;
            if(nk == null){
                return null;
            }
        }



        //以下代码没有考虑剩余链表元素少于k是，链表不反转的情况

        ListNode current = prev.next;
        for (int i = 0; i < k; i++) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        ListNode nk1 = prev;
        ListNode nkplus = current;
        lastPrev.next = nk;
        n1.next = nkplus;
        return n1;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode perv = null;
        ListNode current = node1;
        while (current != null){
            ListNode temp = current.next;
            current.next = perv;
            perv = current;
            current = temp;
        }
        while(perv != null){
            System.out.println(perv.val);
            perv = perv.next;
        }



    }
}
