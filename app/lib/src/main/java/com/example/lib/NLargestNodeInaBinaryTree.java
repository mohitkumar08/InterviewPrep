package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 14/02/22}
 */
public class NLargestNodeInaBinaryTree
{
    static int value = 0;
    static int K = 3;
    static int value1;


    public static void main(String ar[])
    {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(40);
        root.right = new TreeNode(60);

        root.left.left = new TreeNode(35);
        root.left.right = new TreeNode(42);


        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(65);

        getNLargestNodeInaBinaryTree(root);
        System.out.println(value1);

    }

    private static void getNLargestNodeInaBinaryTree(TreeNode root)
    {
        if (root == null || value >= K)
        {
            return;
        }
        getNLargestNodeInaBinaryTree(root.right);
        value++;
        if (value == K)
        {
            value1 = root.val;
            return;
        }

        getNLargestNodeInaBinaryTree(root.left);
    }
}
