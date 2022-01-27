package com.example.lib;

public class MinimumWindowSubstring
{
    // Driver code
    public static void main(String[] args)
    {
        String input = "ADOBECODEBANCC";
        String t = "ABC";

        int[] ch = new int[128];
        String res = "";

        for (char c : t.toCharArray())
        {
            ch[c]++;
        }

        int windowStart = 0;
        int matched = 0;
        for (int windowEnd = 0; windowEnd < input.length(); ++windowEnd)
        {
            char right = input.charAt(windowEnd);
            ch[right]--;
            if (ch[right] == 0)
            {
                matched++;
            }

            while (matched == t.length())
            {
                if (res.isEmpty() || windowEnd - windowStart < res.length() - 1)//must
                {
                    res = input.substring(windowStart, windowEnd + 1);
                }

                char left = input.charAt(windowStart);
                ch[left]++;
                if (ch[left] > 0)
                {
                    matched--;
                }
                windowStart++;
            }
        }
        System.out.println(res);
    }
}