package com.example.lib;

import java.util.HashSet;

/**
 * @author Mohit Kumar
 * @created 07/01/22}
 */
public class LongestConsecutiveSequence
{
    public static void main(String ar[]){
        int arr[]  = new int[]{100,4,101,102,103,104,1,3,2};

        HashSet<Integer> con = new HashSet<>(arr.length);
        for (int i:arr){
         con.add(i);
        }

        int max_to_max = 0;

        for (int i:arr){
            int current_max = 1;
            int temp = i;

            if (!con.contains(temp-1)) {

                while (con.contains(temp+1)){
                    temp = temp+1;
                    current_max = current_max+1;
                }
                max_to_max = Math.max(current_max,max_to_max);
            }

        }
        System.out.println(max_to_max);

    }
}
