package com.example.lib;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Mohit Kumar
 * @created 28/01/22}
 */
public class MergeIntervals
{
    // Driver code
    public static void main(String[] args)
    {
       int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] ints, int[] t1)
            {
                return ints[0];
            }
        });

        Queue<int[][]> pq = new PriorityQueue<>(new Comparator<int[][]>()
        {
            @Override
            public int compare(int[][] ints, int[][] t1)
            {
                return ints[0][1];
            }
        });




    }
}
