package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class MoveZeroStartng
{
    public static void main(String ar[])
    {
        int nums[] = new int[]{0, 1, 0, 3, 12, 18, 0};

        int readindex = nums.length - 1;
        int wrightIndex = nums.length - 1;

        while (readindex >= 0)
        {
            if (nums[readindex] != 0)
            {
                nums[wrightIndex--] = nums[readindex];
            }
            readindex -= 1;
        }

        for (; wrightIndex >= 0; wrightIndex--)
        {
            nums[wrightIndex] = 0;
        }

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }

    }
}
