package com.example.lib;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class ReversePrintLinkedLIST
{

    public static void main(String ar[])
    {
        ALinkedlIst lis =new ALinkedlIst(10);

        lis.next = new ALinkedlIst(20);
        lis.next.next = new ALinkedlIst(30);
        lis.next.next.next = new ALinkedlIst(40);
        printreverseLinkedList(lis);
    }

    private static void printreverseLinkedList(ALinkedlIst lis)
    {
        if (lis==null){
            return;
        }
        System.out.println(lis.value);

        printreverseLinkedList(lis.next);
    }
}
