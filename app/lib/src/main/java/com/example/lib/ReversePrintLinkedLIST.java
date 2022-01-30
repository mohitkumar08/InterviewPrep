package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class ReversePrintLinkedLIST
{

    public static void main(String ar[])
    {
        ListNode lis =new ListNode(10);

        lis.next = new ListNode(20);
        lis.next.next = new ListNode(30);
        lis.next.next.next = new ListNode(40);
        printreverseLinkedList(lis);
    }

    private static void printreverseLinkedList(ListNode lis)
    {
        if (lis==null){
            return;
        }
        System.out.println(lis.value);

        printreverseLinkedList(lis.next);
    }
}
