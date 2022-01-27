package com.example.lib;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * @author Mohit Kumar
 * @created 25/01/22}
 */
public class RemoveInvalidParentheses
{

    // Driver Code
    public static void main(String[] args)
    {
        String expression = "()())()";
        removeInvalidParenthesis(expression);

        expression = "()v)";
        //    removeInvalidParenthesis(expression);
    }

    private static void removeInvalidParenthesis(String expression)
    {
        if (expression.isEmpty())
        {
            return;
        }
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(expression);
        visited.add(expression);
        boolean level = false;


        while (!queue.isEmpty())
        {
            String string = queue.remove();

            if (isValidParenthesisString(string))
            {
                System.out.println(string);
                level = true;
            }

            if (level)
            {
                continue;
            } else
            {
                for (int i = 0; i < string.length(); i++)
                {
                    if (!isParenthesis(string.charAt(i)))
                        continue;

                    String temp = string.substring(0, i) + string.substring(i + 1);
                    if (!visited.contains(temp))
                    {
                        visited.add(temp);
                        queue.add(temp);
                    }
                }
            }

        }


    }

    private static boolean isValidParenthesisString(String string)
    {
        int counter = 0;
        for (char c : string.toCharArray())
        {
            if (c == '(')
            {
                counter++;
            } else if (c == ')')
            {
                counter--;
            }
            if (counter < 0)
            {
                return false;
            }
        }
        return counter == 0;
    }

    static boolean isParenthesis(char c)
    {
        return ((c == '(') || (c == ')'));
    }
}
