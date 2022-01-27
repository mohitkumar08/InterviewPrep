package com.example.lib;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mohit Kumar
 * @created 27/01/22}
 */
public class AddTwoNumbers
{
    public static void main(String ar[])
    {
        ALinkedlIst A = new ALinkedlIst(2);
        A.next = new ALinkedlIst(4);
        A.next.next = new ALinkedlIst(3);

        ALinkedlIst B = new ALinkedlIst(5);
        B.next = new ALinkedlIst(6);
        B.next.next = new ALinkedlIst(4);

        int carry = 0;

        ALinkedlIst head = new ALinkedlIst(-1);
        ALinkedlIst curent = head;

        while (A != null || B != null)
        {

            int a = 0;
            if (A != null)
            {
                a = A.value;
            }

            int b = 0;
            if (B != null)
            {
                b = B.value;
            }
            int temp = a + b + carry;
            carry = temp / 10;


            curent.next = new ALinkedlIst(temp % 10);
            curent = curent.next;


            A = A.next;
            B = B.next;
        }
        if (carry > 0)
        {
            curent.next = new ALinkedlIst(carry);
        }
        ALinkedlIst.printreverseLinkedList(head.next);

    }


}
