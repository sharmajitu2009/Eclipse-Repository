package com.vishal.mega.hackerRank.meanMedianMode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCountInList 
{
    public static void main(String[] args)
    {
        List<Integer> list = getList(1, 1, 5, 3, 7, 3, 11, 2, 3, 1);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : list)
        {
            Integer retrievedValue = map.get(i);
            if (null == retrievedValue)
            {
                map.put(i, 1);
            }
            else
            {
                map.put(i, retrievedValue + 1);
            }
        }

        System.out.println("list: " + list);
        printCount(map);
    }

    private static List<Integer> getList(int... numbers)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : numbers)
        {
            list.add(i);
        }
        return list;
    }

    private static void printCount(Map<Integer, Integer> map)
    {
        for (Integer key : map.keySet())
        {
            System.out.println("number: " + key + ", count: " + map.get(key));
        }
    }

}
