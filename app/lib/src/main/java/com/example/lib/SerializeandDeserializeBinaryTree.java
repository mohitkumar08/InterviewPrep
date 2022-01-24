package com.example.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Mohit Kumar
 * @created 22/01/22}
 */
public class SerializeandDeserializeBinaryTree
{
    public static void main(String ar[])
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = null;
        root.left.right = null;

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String s = serialize(root);
        System.out.println(s);
        TreeNode t = deserialize(s);
        TreeNode.printLL(t);
    }

    static String DELIMITER = ",";
    static String END = "X";


    // Encodes a tree to a single string.
    public static String serialize(TreeNode root)
    {
        StringBuilder ou = new StringBuilder();
        serlize(root, ou);
        return ou.toString();
    }

    private static void serlize(TreeNode root, StringBuilder ou)
    {
        if (root == null)
        {
            ou.append(END).append(DELIMITER);
            return;
        } else
        {
            ou.append(root.val).append(DELIMITER);
            serlize(root.left, ou);
            serlize(root.right, ou);
        }
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data)
    {
        Queue<String> l = new LinkedList();
        l.addAll(Arrays.asList(data.split(DELIMITER)));
        return buildTree(l);
    }

    private static TreeNode buildTree(Queue<String> l)
    {
        String s = l.remove();
        if (s.equals(END))
        {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(s));
        node.left = buildTree(l);
        node.right = buildTree(l);
        return node;
    }


}
