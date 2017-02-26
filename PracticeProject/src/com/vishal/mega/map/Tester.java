package com.vishal.mega.map;

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
        
        for(int i=0;i<list.size()-1;)
        {
            int count=1;
            
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)==list.get(j))
                {
                    count++;
                    
                }
            }
            
             if(count>1)
             {
                map.put(list.get(i),count);  
             }
             
             i=i+count;
        }    
        
        if(map.isEmpty())
        {
             mode= list.get(0);
        }
        else
        {
            Iterator<Entry<Integer,Integer>> iterator = map.entrySet().iterator();
            
            int firstKey=0;
            int firstValue=0;
		    
            while (iterator.hasNext()) 
            {

			    Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) iterator.next();
                
                if(firstValue!=0)
                {
                	if(firstValue<entry.getValue())
                	{
                		mode=entry.getKey();
                		firstValue=entry.getValue();
                		firstKey=entry.getKey();
                	}
                	else if(firstValue==entry.getValue())
                    {
                    		mode= (firstKey<entry.getKey())?firstKey:entry.getKey();   
                    		firstValue=entry.getValue();
                    		firstValue=entry.getKey();
                    }
                    
                }
                else
                {
                    firstKey=entry.getKey();
                    firstValue=entry.getValue();
                }
                
                
                if(mode==0)
                {
                    mode=firstKey;
                }
			    
		    }
        }
       
        
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
       }
    }
}