package com.example.lib;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mohit Kumar
 * @created 22/01/22}
 */
public class MergekSortedLinkedLists
{
    public static void main(String ar[])
    {
        ListNode A = new ListNode(1);
        A.next = new ListNode(4);
        A.next.next = new ListNode(5);

        ListNode B = new ListNode(1);
        B.next = new ListNode(3);
        B.next.next = new ListNode(4);


        ListNode C = new ListNode(2);
        C.next = new ListNode(6);

        List<ListNode> list = Arrays.asList(A, B, C);
        ListNode l = mergeListSort(list, 0, list.size() - 1);
        printreverseLinkedList(l);


    }

    private static void printreverseLinkedList(ListNode lis)
    {
        if (lis == null)
        {
            return;
        }
        System.out.print(lis.value+"->");

        printreverseLinkedList(lis.next);
    }


    private static ListNode mergeListSort(List<ListNode> list, int i, int size)
    {

        if (size == i)
        {
            return list.get(i);
        }

        int mid = i + size/2;


        ListNode first = mergeListSort(list, i, mid);
        ListNode last = mergeListSort(list, mid + 1, size);

        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (first != null && last != null)
        {

            if (first.value <= last.value)
            {
                cur.next = first;
                first = first.next;
            } else
            {
                cur.next = last;
                last = last.next;
            }
            cur = cur.next;

        }
        if (first != null)
        {
            cur.next = first;
        } else
        {
            cur.next = last;
        }

        return head.next;
    }
}

