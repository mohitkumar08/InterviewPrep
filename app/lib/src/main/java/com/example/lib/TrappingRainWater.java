package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 26/01/22}
 */
public class TrappingRainWater
{
    public static void main(String ar[])
    {

        int height[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int l = 0;
        int r = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while (l < r)
        {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if (leftMax < rightMax)
            {
                ans += leftMax - height[l];
                l++;
            } else
            {
                ans += rightMax - height[r];
                r--;
            }
        }
        System.out.print(ans);


    }
}