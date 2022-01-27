package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 25/01/22}
 */
public class BinaryTreeMaximumPathSum
{
    static int maxValue = Integer.MIN_VALUE;

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        maxPathDown(root);
        System.out.print(maxValue);

    }


    static private int maxPathDown(TreeNode node)
    {
        if (node == null)
        {
            return 0;
        }
        int leftMax = maxPathDown(node.left);
        int rightMax = maxPathDown(node.right);

        maxValue = Math.max(maxValue, leftMax + rightMax + node.val);
        return Math.max(leftMax, rightMax) + node.val;

    }
}
