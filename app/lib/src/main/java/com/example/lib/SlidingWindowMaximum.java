package com.example.lib;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Mohit Kumar
 * @created 17/01/22}
 */

//Complexity  = O(n)*O(Log(k))
// space      = O(K) // K - window size
public class SlidingWindowMaximum
{
    public static void main(String ar[])
    {
        int nums[] = new int[]{10, 1,2, 30, 3, 12, 18, 9};

        int window= 3;

        PriorityQueue<Integer> queue =new PriorityQueue<Integer>(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer first, Integer second)
            {
                return second.compareTo(first); //noted
            }
        });

        for (int i = 0; i < nums.length; i++)
        {
            queue.add(nums[i]);
            if (window == queue.size()){
                System.out.println("bigg "+queue.peek());
                queue.remove(nums[i-window+1]);
            }
        }
    }
}
