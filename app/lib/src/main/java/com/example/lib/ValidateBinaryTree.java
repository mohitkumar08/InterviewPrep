package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class ValidateBinaryTree
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

       boolean status =  isValid(root);
       System.out.println(status);

    }

    private static boolean isValid(TreeNode root)
    {
        return isValidBST(root,null,null);

    }

    private static boolean isValidBST(TreeNode root,Integer min, Integer max)
    {
            if (root==null){
                return  true;
            }
            if ((min!=null && root.val<=min) || (max!=null && root.val>=max)){
                return false;
            }
            return isValidBST(root.left,min,root.val) &&  isValidBST(root.right, root.val, max);

    }


}
