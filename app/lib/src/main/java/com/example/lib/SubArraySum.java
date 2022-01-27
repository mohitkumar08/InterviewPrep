package com.example.lib;

import java.util.HashMap;

/**
 * @author Mohit Kumar
 * @created 25/01/22}
 */

//Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
public class SubArraySum
{
    public static void main(String[] args)
    {
        int nums[] = new int[]{1, 1, 3,1,2};
        int target = 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;
        map.put(0, 1);


        for (int i = 0; i < nums.length; i++)
        {

            sum += nums[i];

            if (map.containsKey(sum - target))
            {
                count += map.get(sum - target);
            }
            int d = map.getOrDefault(sum, 0);
            map.put(sum, d + 1);
        }
        System.out.print(count);


    }
}