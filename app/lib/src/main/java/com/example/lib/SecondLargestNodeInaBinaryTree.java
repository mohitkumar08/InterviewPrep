package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 30/01/22}
 */
public class SecondLargestNodeInaBinaryTree
{
    public static void main(String ar[])
    {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(40);
        root.right = new TreeNode(60);

        root.left.left = new TreeNode(35);
        root.left.right = new TreeNode(42);


        root.right.left = new TreeNode(55);
        root.right.right = new TreeNode(65);

        TreeNode node = getSecondLargestNodeInaBinaryTree(root);
        System.out.println(node.val);

    }

    private static TreeNode getSecondLargestNodeInaBinaryTree(TreeNode root)
    {
        if (root.right==null  && root.left!=null){
            return getSecondLargestNodeInaBinaryTree(root.left);
        }

        if (root.right!=null && root.right.left==null&& root.right.right==null){
            return root;
        }


        return getSecondLargestNodeInaBinaryTree(root.right);
    }
}
