package com.example.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Mohit Kumar
 * @created 22/01/22}
 */
public class ThreeSum
{
    public static void main(String ar[])
    {

        int input[] = new int[]{-1, 0, 1, 2, -1, -4};
        // [[-1,-1,2],[-1,0,1]]
        int com = 0;
        Set<List<Integer>> output = new HashSet<>();

        Arrays.sort(input);

        for (int i = 0; i < input.length; i++)
        {
            int j = i + 1;
            int k = input.length - 1;

            while (j < k)
            {
                int temp = input[i] + input[j] + input[k];

                if(temp==com){
                    ArrayList o = new ArrayList();
                    o.add(input[i]);
                    o.add(input[j]);
                    o.add(input[k]);
                    output.add(o);
                    j = j+1;
                    k = k-1;
                }
                else if(temp>com){
                    k= k-1;
                }
                else if(temp<com){
                    j= j+1;
                }
            }
        }

        for (List<Integer> i:output) {
            for (Integer p:i) {
                System.out.print(p+",");
            }
            System.out.println();

        }

    }
}
