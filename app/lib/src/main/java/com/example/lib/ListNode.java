package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class ListNode
{
    int value;
    ListNode next;
    ListNode prev;

    ListNode()
    {
    }

    ListNode(Integer valr)
    {
        this.value = valr;
    }


     static void printreverseLinkedList(ListNode lis)
    {
        if (lis == null)
        {
            return;
        }
        System.out.print(lis.value+"->");

        printreverseLinkedList(lis.next);
    }
}
