package com.example.lib;

import java.util.HashMap;

/**
 * @author Mohit Kumar
 * @created 22/01/22}
 */
public class LongestSubstringWithoutRepeatingCharacters
{
    public static void main(String ar[])
    {
        String s = "dvedf";

        if (s.length() <= 1)
            return;

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i)
        {
            if (map.containsKey(s.charAt(i)))
            {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);



        }

        System.out.print(max);
    }
}
