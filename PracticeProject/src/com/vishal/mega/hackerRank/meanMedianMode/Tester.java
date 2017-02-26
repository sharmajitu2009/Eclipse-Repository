package com.vishal.mega.hackerRank.meanMedianMode;

import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Tester 
{

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        List<Integer> list=new ArrayList<Integer>();
        
        double sum=0;
        int minIndex=0;
        int maxIndex=0;
        int max=0;
        int min=0;
        double mean=0.0d;
        double median=0.0d;
        int mode=0;
        
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        
        
        if(n>=10 && n<= 2500)
        {
            
        
        String[] numbers=s.split("\\s");
        
        for(int i=0;i<numbers.length;i++)
        {
            list.add(Integer.parseInt(numbers[i]));
            sum=sum+list.get(i);
        }
        
        mean= sum/n;
        
        Collections.sort(list);
        
        maxIndex=n/2;
        minIndex=maxIndex-1;
        
        max=list.get(maxIndex);
        min=list.get(minIndex);
        
        sum=max+min;
        
        median= sum/2;
        
        
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        
        for(Integer i:list)
        {
        	Integer retrieveValue=map.get(i);
        	if(null==retrieveValue)
        	{
        		map.put(i, 1);
        	}
        	else
        	{
        		map.put(i, retrieveValue+1);
        	}
        }
         
        
        if(map.isEmpty())
        {
             mode= list.get(0);
        }
        else
        {
            
                	Map.Entry<Integer, Integer> maxEntry = null;

                	for (Map.Entry<Integer, Integer> entry : map.entrySet())
                	{
                	    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                	    {
                	        maxEntry = entry;
                	    }
                	}
                	
                	mode=maxEntry.getKey();
        }
       
        DecimalFormat df2 = new DecimalFormat(".#");
        
        System.out.println(df2.format(mean));
        System.out.println(df2.format(median));
        System.out.println(mode);
       }
    }
}