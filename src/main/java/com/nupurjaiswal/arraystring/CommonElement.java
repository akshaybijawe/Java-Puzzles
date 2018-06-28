package com.nupurjaiswal.arraystring;

import java.util.*;
class CommonElements
{
    public static void main(String[] args)
    {
        Integer[] i1 = {1, 2, 3, 4, 5, 4};

        Integer[] i2 = {3, 4, 5, 6, 7, 4};

        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(i1));

        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(i2));

        set1.retainAll(set2);

        System.out.println(set1);     //Output : [3, 4, 5]
    }
}
