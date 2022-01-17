package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 17/01/22}
 */
public class BSTToSortedDoublyLinkedList
{

    public static void main(String ar[])
    {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(40);
        root.right = new TreeNode(60);

        root.left.left = new TreeNode(35);
        root.left.right = new TreeNode(42);
        ;
        root.right.right = new TreeNode(65);

        //TreeNode r = treeToList2(root);
        //System.out.println("OutPut ");

       // printLL(r);

        treeToDoublyList(root);
        printLL(head);
       // treeToDoublyList(root);

       // printLL(last);

    }

    private static void printLL(TreeNode ap)
    {
        if (ap == null)
        {
            return;
        }
        System.out.println(ap.val);
        printLL(ap.right);
    }



    static TreeNode head = null;
    static TreeNode last = null;

    public static TreeNode treeToDoublyList(TreeNode root)
    {
        if (root == null) return null;
        inorder(root);
        //last.right = null; add these two lne if need circularer list
        //head.left = null;
        return head;
    }

    public static void inorder(TreeNode node)
    {
        if (node != null)
        {
            inorder(node.left);

            if (last != null)
            {
                last.right = node;
                node.left = last;
            } else
            {
                head = node;
            }
            last = node;

            inorder(node.right);
        }
    }


}
