package com.example.lib;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @author Mohit Kumar
 * @created 28/01/22}
 */
public class KthSmallest
{
    static int Kth_smallest(TreeMap<Integer, Integer> m,
                            int k)
    {
        int freq = 0;
        for (Map.Entry it : m.entrySet())
        {

            // adding the frequencies of each element
            freq += (int) it.getValue();

            // if at any point frequency becomes
            // greater than or equal to k then
            // return that element
            if (freq >= k)
            {
                return (int) it.getKey();
            }
        }

        return -1; // returning -1 if k>size of the array
        // which is an impossible scenario
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 5;
        int k = 2;
        int[] arr = {12, 3, 5, 7, 6, 2, 19};

        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++)
        {
            pq.add(arr[i]);
        }
        for (int i = 1; i < k; i++)
        {
            pq.remove();
        }
        System.out.print(pq.peek());




      /*
         int n = 5;
        int k = 2;
        int[] arr = {12, 3, 5, 7, 6, 2, 19};
      Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer integer, Integer t1)
            {
                return t1.compareTo(integer);
            }
        });

        for (int i = 0; i < arr.length; i++)
        {
            pq.add(arr[i]);
        }
        for (int i = 1; i < k; i++)
        {
            pq.remove();
        }
        System.out.print(pq.peek());
*/
    }

}
