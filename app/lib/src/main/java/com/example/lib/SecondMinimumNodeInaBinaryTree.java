package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 30/01/22}
 */
public class SecondMinimumNodeInaBinaryTree
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

        int node = gecondMinimumNodeInaBinaryTree(root);
        System.out.println(node);

    }

    private static int gecondMinimumNodeInaBinaryTree(TreeNode root)
    {
        if ( root.left == null)
        {
            return -1;
        }
        int leftV = -1;
        if (root.val == root.left.val)
        {
            leftV = gecondMinimumNodeInaBinaryTree(root.left);
        } else
        {
            leftV = root.left.val;
        }

        int rightV = -1;
        if (rightV == root.right.val)
        {
            rightV = gecondMinimumNodeInaBinaryTree(root.right);
        } else
        {
            rightV = root.right.val;
        }


        if (leftV == -1 || rightV == -1)
        {
            return Math.max(leftV, rightV);
        } else
        {
            return Math.min(leftV, rightV);
        }


    }
}
