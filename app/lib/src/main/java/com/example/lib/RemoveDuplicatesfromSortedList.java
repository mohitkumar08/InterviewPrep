package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 29/01/22}
 */
public class RemoveDuplicatesfromSortedList
{

    public static void main(String ar[])
    {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(5);


        removeDuplicate(node);

        ListNode.printreverseLinkedList(node);

    }

    private static ListNode removeDuplicate(ListNode node)
    {
        if (node == null || node.next == null)
        {
            return node;
        }
        if (node.value != node.next.value)
        {
            node.next = removeDuplicate(node.next);
            return node;
        } else
        {
            while (node.next != null && node.value == node.next.value)
            {
                node = node.next;
            }
            return removeDuplicate(node.next);
        }
    }
}
