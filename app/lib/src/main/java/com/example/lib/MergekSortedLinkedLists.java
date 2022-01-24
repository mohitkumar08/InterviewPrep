package com.example.lib;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Mohit Kumar
 * @created 22/01/22}
 */
public class MergekSortedLinkedLists
{
    public static void main(String ar[])
    {
        ALinkedlIst A = new ALinkedlIst(1);
        A.next = new ALinkedlIst(4);
        A.next.next = new ALinkedlIst(5);

        ALinkedlIst B = new ALinkedlIst(1);
        B.next = new ALinkedlIst(3);
        B.next.next = new ALinkedlIst(4);


        ALinkedlIst C = new ALinkedlIst(2);
        C.next = new ALinkedlIst(6);

        List<ALinkedlIst> list = Arrays.asList(A, B, C);
        ALinkedlIst l = mergeListSort(list, 0, list.size() - 1);
        printreverseLinkedList(l);

        /*

        PriorityQueue<ALinkedlIst> queue = new PriorityQueue<>(new Comparator<ALinkedlIst>()
        {
            @Override
            public int compare(ALinkedlIst o1, ALinkedlIst o2)
            {
                if (o1.value<o2.value)
                    return -1;
                else if (o1.value==o2.value)
                    return 0;
                else
                    return 1;

            }
        });

        ALinkedlIst dummy = new ALinkedlIst(0);
        ALinkedlIst tail = dummy;

        for (ALinkedlIst node : list)
        {
            if (node != null)
            {
                queue.add(node);
            }
            while (!queue.isEmpty())
            {
                tail.next = queue.poll();
                tail = tail.next;

                if (tail.next != null)
                    queue.add(tail.next);
            }

        }
        while (dummy != null)
        {

            System.out.print(dummy.value + "->");
            dummy = dummy.next;
        }
*/

    }

    private static void printreverseLinkedList(ALinkedlIst lis)
    {
        if (lis == null)
        {
            return;
        }
        System.out.print(lis.value+"->");

        printreverseLinkedList(lis.next);
    }


    private static ALinkedlIst mergeListSort(List<ALinkedlIst> list, int i, int size)
    {

        if (size == i)
        {
            return list.get(i);
        }

        int mid = i + size/2;


        ALinkedlIst first = mergeListSort(list, i, mid);
        ALinkedlIst last = mergeListSort(list, mid + 1, size);

        ALinkedlIst head = new ALinkedlIst(0);
        ALinkedlIst cur = head;

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
