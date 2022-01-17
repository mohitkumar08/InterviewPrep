package com.example.lib;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Mohit Kumar
 * @created 17/01/22}
 */
public class PriorityTest
{
    public static void main(String ar[])
    {

        PriorityQueue<Integer> p =new PriorityQueue<>(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer lhs, Integer rhs)
            {
                if (lhs<rhs){
                    return 1;
                }
                else if ((rhs.equals(lhs))){
                    return 0;
                }
                return -1;

                //return rhs.compareTo(lhs);
            }
        });
        p.add(10);
        p.add(20);
        p.add(5);
        p.add(2);
        p.add(34);
        p.add(78);
        p.add(45);

        while (!p.isEmpty()){
            System.out.println(p.poll());
        }


    }
}
