package com.example.lib;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Mohit Kumar
 * @created 14/01/22}
 */
public class TwoNumberProblem
{

    public static void main(String ar[])
    {

        int input[] = new int[]{0, 3, 4, 5, 8, 9, 13};
        int sum = 10;
        //    twoSum(input, sum);
        Arrays.sort(input); // nlogn
        boolean o = twoSum2(input, sum);
        System.out.println("output =  " + o);

    }

    public static boolean twoSum(int[] input, int sum)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : input)
        {
            int diff = sum - i;
            if (map.containsKey(diff))
            {
                return true;
            } else
            {
                map.put(i, 1);
            }
        }
        return false;
    }

    public static boolean twoSum2(int[] input, int sum)
    {
        for (int i = 0; i < input.length; i++)
        {
            int diff = sum - input[i];
            System.out.println("d  "+diff);

            System.out.println("f  "+(i-1));
            System.out.println("s  "+(i+1));

            boolean f1 = isExist(0, i-1, diff, input);
            boolean f2 = isExist(i+1, input.length, diff, input);
            if (f1 || f2){
                return  true;
            }

        }

        return false;
    }

    //arrys will be sorted
    public static boolean isExist(int low, int high, int diff, int[] input)
    {
        int mid = (low + high) / 2;

        if ((input[mid]) == diff)
        {
            return true;
        }

        if (low > high)
        {
            return false;
        }
        if (input[mid] > diff)
        {
            return isExist(low, mid - 1, diff, input);
        }
        return isExist(mid + 1, high, diff, input);

    }
}

