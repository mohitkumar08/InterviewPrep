package com.example.lib;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Mohit Kumar
 * @created 22/01/22}
 */
public class MeetingRoomScheduling2
{
    public static void main(String ar[])
    {
        Interval i0 = new Interval(0, 30);
        Interval i1 = new Interval(5, 10);
        Interval i3 = new Interval(15, 20);
        List<Interval> list = Arrays.asList(i0, i1, i3);
        list.sort(new Comparator<Interval>()
        {
            @Override
            public int compare(Interval interval, Interval t1)
            {
                return interval.start - t1.start;
            }
        });


        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a, b) -> a.end - b.end);

        minHeap.add(list.get(0));
         for (int i = 1; i < list.size(); i++)
        {
             Interval current = list.get(i);
             Interval earlist= minHeap.remove();
             if (current.start>=earlist.end){
                 earlist.end = current.end;
             }else{
                 minHeap.add(current);
             }
             minHeap.add(earlist);

        }

        System.out.println(minHeap.size());


    }

    public static class Interval
    {
        int start = 0;
        int end = 0;

        public Interval(int start, int end)
        {
            this.start = start;
            this.end = end;
        }

    }
}
