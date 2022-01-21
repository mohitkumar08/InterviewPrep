package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 20/01/22}
 */
public class LargestHistoragm
{

    public static void main(String ar[])
    {
        int arr[] = new int[]{2,1,2};
        int r = largestRectangleArea(arr);
        System.out.println(r);
    }

    public static int largestRectangleArea(int[] heights)
    {

        if (heights.length <= 1)
        {
            return heights[0];
        }
        int max = 0;

        for (int i = 0; i < heights.length - 1; i++)
        {
            int d = 0;
            if (heights[i] == 0)
            {
                d = heights[i + 1];

            } else if (heights[i + 1] == 0)
            {
                d = heights[i];
            }else{
                d = Math.min(heights[i],heights[i+1]) *2;

            }

            max = Math.max(max, d);

        }
        return max;


    }
}

