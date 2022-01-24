package com.example.lib;

public class MinimumWindowSubstring {
    // Driver code
    public static void main(String[] args) {
        String input = "ADOBECODEBANC";
        String t = "ABC";

        int[] ch = new int[128];
        String res = "";

        for(char c: t.toCharArray()) {
            ch[c]++;
        }

        int windowStart = 0, matched = 0;
        for (int windowEnd = 0; windowEnd < input.length(); ++windowEnd) {
            char right = input.charAt(windowEnd);
            if (--ch[right] >= 0) matched++;

            while (matched == t.length()) {
                if (res.isEmpty() || windowEnd - windowStart + 1 < res.length()) {
                    res = input.substring(windowStart, windowEnd + 1);
                }

                char left = input.charAt(windowStart);
                if (++ch[left] > 0) {
                    matched--;
                }
                windowStart++;
            }
        }
        System.out.println(res);


    }
}
