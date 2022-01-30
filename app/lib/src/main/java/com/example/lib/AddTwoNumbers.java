package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 27/01/22}
 */
public class AddTwoNumbers
{
    public static void main(String ar[])
    {
        ListNode A = new ListNode(2);
        A.next = new ListNode(4);
        A.next.next = new ListNode(3);

        ListNode B = new ListNode(5);
        B.next = new ListNode(6);
        B.next.next = new ListNode(4);

        int carry = 0;

        ListNode head = new ListNode(-1);
        ListNode curent = head;

        while (A != null || B != null)
        {

            int a = 0;
            if (A != null)
            {
                a = A.value;
            }

            int b = 0;
            if (B != null)
            {
                b = B.value;
            }
            int temp = a + b + carry;
            carry = temp / 10;


            curent.next = new ListNode(temp % 10);
            curent = curent.next;


            A = A.next;
            B = B.next;
        }
        if (carry > 0)
        {
            curent.next = new ListNode(carry);
        }
        ListNode.printreverseLinkedList(head.next);

    }


}
