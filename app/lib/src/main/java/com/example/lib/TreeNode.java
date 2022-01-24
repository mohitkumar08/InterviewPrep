package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x)
    {
        val = x;
    }

    public static void printLL(TreeNode ap)
    {
        if (ap == null)
        {
            System.out.print("X");
            return;
        }
        System.out.print(ap.val);
        printLL(ap.left);
        printLL(ap.right);
    }
}
