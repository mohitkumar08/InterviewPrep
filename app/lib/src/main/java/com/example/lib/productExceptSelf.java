package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 25/01/22}
 */

//Input: nums = [1,2,3,4]
  // Output: [24,12,8,6]
public class productExceptSelf
{
    public static void main(String[] args)
    {
        int nums[] = new int[]{1, 2, 3, 4};
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++)
        {
            res[i] = res[i - 1] * nums[i - 1];
        }
        //1,1,2,6
        int right = 1;
        for (int i = n - 1; i >= 0; i--)
        {
            res[i] *= right;
            right *= nums[i];
        }

        for (Integer i : res)
        {
            System.out.print(i+"   ");
        }

    }
}