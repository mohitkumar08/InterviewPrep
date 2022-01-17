package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class MoveZero
{
    public static void main(String ar[])
    {
        int nums[] = new int[]{0, 1, 0, 3, 12, 18, 0};

        int j = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                nums[j] = nums[i];
                j = j+1;
            }
        }

        for (; j < nums.length; j++)
        {
            nums[j] = 0;
        }

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }


    }
}