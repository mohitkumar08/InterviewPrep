package com.example.lib;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Mohit Kumar
 * @created 09/01/22}
 */
public class ALinkedlIst
{
    int value;
    ALinkedlIst next;
    ALinkedlIst prev;

    ALinkedlIst()
    {
    }

    ALinkedlIst(Integer valr)
    {
        this.value = valr;
    }
}
